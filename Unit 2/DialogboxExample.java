import java.awt.*;
import java.awt.event.*;

public class DialogboxExample extends Frame implements ActionListener {
    Button buttonDialog;
    Dialog msgDialog;

    public DialogboxExample() {
        setLayout(new FlowLayout());
        setSize(300, 500);
        setVisible(true);

        buttonDialog = new Button("Message Dialog box");
        buttonDialog.setBounds(20, 50, 120, 60);
        add(buttonDialog);

        buttonDialog.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Show the message dialog when the button is clicked
        showMessageDialog("This is a message dialog.", "Message Dialog");
    }

    private void showMessageDialog(String message, String title) {
        // Create a modal dialog
        msgDialog = new Dialog(this, title, true);
        msgDialog.setLayout(new FlowLayout());
        msgDialog.add(new Label(message));

        // Create an OK button to close the dialog
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msgDialog.dispose();
            }
        });

        msgDialog.add(okButton);
        msgDialog.setSize(250, 100);
        msgDialog.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogboxExample();
    }
}
