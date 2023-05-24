import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;


public class ChatClient extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextArea chatArea;
	private JTextField inputField;
	private JButton sendButton;
	private PrintWriter out;
	private BufferedReader in;
	public String pseudo;
	public JScrollPane scrollPane;

	public ChatClient(String username, String adresseIP) {
		super("Chat Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel inputPanel = new JPanel();
		inputField = new JTextField(50);
		sendButton = new JButton("Send");
		inputPanel.add(inputField);
		inputPanel.add(sendButton);
		this.pseudo=username;

		chatArea = new JTextArea(20, 50);
		chatArea.setEditable(false);

		this.scrollPane = new JScrollPane(chatArea);
		this.scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		add(this.scrollPane, BorderLayout.CENTER);
		add(inputPanel, BorderLayout.SOUTH);

		sendButton.addActionListener(this);
		inputField.addActionListener(this);

		try {
			Socket socket = new Socket(adresseIP, 80);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Thread readerThread = new Thread(new IncomingReader());
			readerThread.start();
		} catch (IOException e) {
			System.err.println("Could not connect to server.");
			System.exit(1);
		}
		this.setTitle(this.pseudo);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChatClient(" "," ");
	}

	public void actionPerformed(ActionEvent e) {
		String message = this.pseudo+" : ";
		message += inputField.getText();
		out.println(message);
		inputField.setText("");
	}

	public class IncomingReader implements Runnable {
		public void run() {
			String message;

			try {
				while ((message = in.readLine()) != null) {
					chatArea.append(message + "\n");

				}
			} catch (IOException e) {
				System.err.println("Error reading from server.");
				System.exit(1);
			}
		}
	}
}
