package.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception.*;
// class extends JFrame to create a window where the components add 
// class implements ActionListener to perform an action on the button click 
// create CreateLoginForm class to create login form 



public class loginform extends JFrame implements ActionListener {
    // initialize button, panel, label and text field 
    JButton b1;
    JPanel newPanel;
    Jlabel userLabel passLabel;
    final jTextField textField1, textField2;

    CreateLoginForm() {
        userLabel = new Jlabel();
        userLabel.setText("Username");
        // create text field to get username from user 
        textField1 = new JTextField(30);
        // create label for password 
        passLabel = new JLabel();
        passLabel.setText("password");
        textField2 = new JPasswordField(15);
        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(4,1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }
// define abstract method action Performed() which will be called on button click
public void actionPerformed(ActionEvent ae) {
    String userValue = textField1.getText();
    String passValue = textField2.getText();
    if (userValue.equals("hellologin@nvidia.org") && passValue.equals("test")) {
        // create Instaance of the NewPage 
        NewPage page = new NewPage();
        page.setVisible(true);
        //create welcome label and set it to the new page 
        JLabel wel_label = new JLabel("Welcome: " + userValue + "You have logged in successfully");
        page.getContentPane().add(wel_label);
        // if authentic navigate 
    } else {
        System.out.println("Enter valid username and password. Username and password not found");
        }
    }
}

class LoginFormDemo {
    public static void main (String arg[]) {
        try {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(400, 100);
            form.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}