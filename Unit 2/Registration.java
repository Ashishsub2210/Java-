import java.awt.*;
public class Registration extends Frame {
    
Label lblUsername, lblPassword, lblConfirmPassword, lblOptions, lblGender, lblInterests;
    TextField txtUsername, txtPassword, txtConfirmPassword;
    Button btnRegister, btnClear;
    Checkbox cbAgreeTerms;
    Choice choiceOptions;
    List listInterests;
    ScrollPane scrollPaneInterests;
	
public Registration() {
        setTitle("Registration Form");
        setSize(400, 600);
        setLayout(null);

        lblUsername = new Label("Username:");
        lblUsername.setBounds(50, 50, 80, 30);
        txtUsername = new TextField(20);
        txtUsername.setBounds(150, 50, 180, 30);

        lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 100, 80, 30);
        txtPassword = new TextField(20);
        txtPassword.setBounds(150, 100, 180, 30);
        txtPassword.setEchoChar('*');

        lblConfirmPassword = new Label("Confirm Password:");
        lblConfirmPassword.setBounds(50, 150, 120, 30);
        txtConfirmPassword = new TextField(20);
        txtConfirmPassword.setBounds(150, 150, 180, 30);
        txtConfirmPassword.setEchoChar('*');

        cbAgreeTerms = new Checkbox("I agree to the terms and conditions");
        cbAgreeTerms.setBounds(150, 200, 200, 30);

        lblOptions = new Label("Country:");
        lblOptions.setBounds(50, 240, 80, 30);
        choiceOptions = new Choice();
        choiceOptions.setBounds(150, 240, 180, 30);
        choiceOptions.add("USA");
        choiceOptions.add("Nepal");
        choiceOptions.add("India");

        lblGender = new Label("Gender:");
        lblGender.setBounds(50, 280, 80, 30);
        CheckboxGroup cbgGender = new CheckboxGroup();
        Checkbox cbMale = new Checkbox("Male", cbgGender, false);
        cbMale.setBounds(150, 280, 50, 30);
        Checkbox cbFemale = new Checkbox("Female", cbgGender, false);
        cbFemale.setBounds(210, 280, 70, 30);
        Checkbox cbOther = new Checkbox("Other", cbgGender, false);
        cbOther.setBounds(290, 280, 60, 30);

        lblInterests = new Label("Interests:");
        lblInterests.setBounds(50, 320, 80, 30);
        listInterests = new List(4, true);
        listInterests.add("Gaming");
        listInterests.add("Reading");
        listInterests.add("Dancing");
	listInterests.add("Dancing");
	listInterests.add("Dancing");



        scrollPaneInterests = new ScrollPane();
        scrollPaneInterests.setBounds(150, 320, 180, 80);
        scrollPaneInterests.add(listInterests);

        btnRegister = new Button("Register");
        btnRegister.setBounds(100, 450, 80, 30);
        btnClear = new Button("Clear");
        btnClear.setBounds(220, 450, 80, 30);

        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(lblConfirmPassword);
        add(txtConfirmPassword);
        add(cbAgreeTerms);
        add(lblOptions);
        add(choiceOptions);
        add(lblGender);
        add(cbMale);
        add(cbFemale);
        add(cbOther);
        add(lblInterests);
        add(scrollPaneInterests);
        add(btnRegister);
        add(btnClear);
	

        setVisible(true);}
public static void main(String[] args) {
new Registration();
}
}
