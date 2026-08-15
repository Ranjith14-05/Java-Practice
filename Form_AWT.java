
import java.awt.*;
import java.awt.event.*;

class Form extends Frame{


    Form(){
        super("Login Form");
        setLayout(null);
        setSize(1000,700);
        setVisible(true);
        
        Label lbl1 = new Label("Email");
        lbl1.setBounds(300,300,60,30);

        TextField email = new TextField();
        email.setBounds(380,300,160,30);

        Label lbl2 = new Label("Password");
        lbl2.setBounds(300,350,60,30);

        TextField pass = new TextField();
        pass.setBounds(380,350,160,30);

        Label lbl3 = new Label("Age");
        lbl3.setBounds(300,400,60,30);

        TextField age = new TextField();
        age.setBounds(380,400,160,30);

        //Creating Checkbox group Radio Buttons For Gender

        CheckboxGroup cbg = new CheckboxGroup();

        Label lbl4 = new Label("Gender");
        lbl4.setBounds(300,450,60,30);

        Checkbox c1 = new Checkbox("Male",cbg,false);
        c1.setBounds(380,450,80,30);
        Checkbox c2 = new Checkbox("Female",cbg,false);
        c2.setBounds(480,450,80,30);

        //CheckBoxes 

        Label lbl5 = new Label("Favourite Code Language");
        lbl5.setBounds(200,500,160,30);

        Checkbox c3 = new Checkbox("Java",true);
        c3.setBounds(380,500,80,30);

        Checkbox c4 = new Checkbox("Python");
        c4.setBounds(480,500,80,30);

        Checkbox c5 = new Checkbox("C++");
        c5.setBounds(580,500,80,30);




        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);

        add(email);
        add(pass);
        add(age);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);

        //Submit Button 

        Button submit = new Button("Submit");
        submit.setBounds(380,550,80,30);
        
        add(submit);

        //Add ActionListener
        ActionListener sblsn = new ActionListener() {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("");
                System.out.println("Email :" +email.getText());
                System.out.println("----------------------------");
                System.out.println("Password :"+ pass.getText());
                System.out.println("----------------------------");
                System.out.println("Age :"+age.getText());
                System.out.println("----------------------------");

                // Getting Radio Value
                Checkbox selectedGender = cbg.getSelectedCheckbox();

                if (selectedGender != null) {
                    System.out.println("Gender : " + selectedGender.getLabel());
                } else {
                    System.out.println("Gender : Not Selected");
                }

                System.out.println("----------------------------");

                //Getting ChechBox Value
                String languages = "";

                if (c3.getState()) {
                    languages += "Java";
                }

                if (c4.getState()) {
                    if (!languages.isEmpty()) {
                        languages += ", ";
                    }
                    languages += "Python";
                }

                if (c5.getState()) {
                    if (!languages.isEmpty()) {
                        languages += ", ";
                    }
                    languages += "C++";
                }

                System.out.println("Favourite Language : " + languages);
                }

                

                    
        };

        submit.addActionListener(sblsn);


        //Code for close Button

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

}




public class Form_AWT {
    public static void main(String[] args) {
        new Form();
    }
}
