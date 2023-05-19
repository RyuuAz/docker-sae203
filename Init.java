import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Init extends JFrame implements ActionListener
{
    private JTextField textField;
    private JButton sendButton;
    private JLabel label;
   

    public Init()
    {
        this.setSize(200, 200);
        this.setTitle("choix pseudo");
        this.setLocation(20, 20);
        this.setLayout(new GridLayout(3, 1));

        label = new JLabel("Entrez un pseudo");
        textField = new JTextField();
        sendButton = new JButton("Valider");
        

        this.add(label);
        this.add(textField);
        this.add(sendButton);

        

        sendButton.addActionListener(this);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
           String pseudo = textField.getText();
           new ServeurIdentification(pseudo); 
           this.dispose();
        }
        
    }
    public static void main(String[] args) {
        new Init();
    }
}
