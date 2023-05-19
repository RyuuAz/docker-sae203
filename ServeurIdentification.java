import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ServeurIdentification extends JFrame implements ActionListener
{
    private JTextField textField;
    private JButton sendButton;
    private JLabel label;
    public String pseudo;
   

    public ServeurIdentification( String pseudo)
    {
        this.setSize(200, 200);
        this.setTitle("choix pseudo");
        this.setLocation(20, 20);
        this.setLayout(new GridLayout(3, 1));
        
        this.pseudo = pseudo;

        label = new JLabel("Entrez l'addresse ip du serveur");
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
           String adresseIP = textField.getText();
           new ChatClient(this.pseudo,adresseIP); 
           this.dispose();
        }
        
    }
    public static void main(String[] args) {
        new Init();
    }
}
