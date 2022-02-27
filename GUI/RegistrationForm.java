import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm
{
    private JFrame jFrame;

    private JLabel jl_userName, jl_password, jl_dob, jl_gender, jl_skills;
    private JTextField jtf_userName;
    private JPasswordField jpf_password;
    private JRadioButton jrb_male, jrb_female;
    private JComboBox jcb_day, jcb_month,jcb_year;
    private JCheckBox jc_c, jc_java, jc_python;

    private JButton jb_submit, jb_reset;

    public void doAction()
    {
        jFrame = new JFrame();

        jl_userName = new JLabel("Enter User Name:");
        jl_userName.setBounds(100,100,150,30);
        // 100 x axis, 100 y axis, 150 label length, 30 label height
        jFrame.add(jl_userName);

        jtf_userName = new JTextField();
        jtf_userName.setBounds(270,100,150,30);
        jFrame.add(jtf_userName);

        jl_password = new JLabel("Enter Password:");
        jl_password.setBounds(100,150,150,30);
        jFrame.add(jl_password);

        jpf_password = new JPasswordField();
        jpf_password.setBounds(270,150,150,30);
        jFrame.add(jpf_password);

        jl_gender = new JLabel("Gender:");
        jl_gender.setBounds(100,200,150,30);
        jFrame.add(jl_gender);

        jrb_male = new JRadioButton("Male");
        jrb_male.setBounds(270,200,100,30);
        jFrame.add(jrb_male);

        jrb_female = new JRadioButton("Female");
        jrb_female.setBounds(370,200,100,30);
        jFrame.add(jrb_female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb_male);
        bg.add(jrb_female);

        jl_dob = new JLabel("Date of Birth");
        jl_dob.setBounds(100,250,150,30);
        jFrame.add(jl_dob);

        jcb_day = new JComboBox();
        jcb_day.setBounds(270,250,70,30);
        jFrame.add(jcb_day);

        jcb_day.addItem("Day");

        for(int d = 1; d<=31; d++)
        {
            jcb_day.addItem(""+d);
        }

        jcb_month = new JComboBox();
        jcb_month.setBounds(350,250,70,30);
        jFrame.add(jcb_month);

        jcb_month.addItem("Month");

        for(int m=1;m<=12 ;m++)
        {
            jcb_month.addItem(""+m);
        }

        jcb_year = new JComboBox();
        jcb_year.setBounds(430,250,70,30);
        jFrame.add(jcb_year);

        jcb_year.addItem("Year");

        for(int y=1993;y<=2020;y++)
        {
            jcb_year.addItem(""+y);
        }

        jl_skills = new JLabel("Skills");
        jl_skills.setBounds(100,300,150,30);
        jFrame.add(jl_skills);

        jc_c = new JCheckBox("C");
        jc_c.setBounds(270,300,70,30);
        jFrame.add(jc_c);

        jc_java = new JCheckBox("Java");
        jc_java.setBounds(340,300,70,30);
        jFrame.add(jc_java);

        jc_python = new JCheckBox("Python");
        jc_python.setBounds(420,300,70,30);
        jFrame.add(jc_python);

        jb_submit = new JButton("submit");
        jb_submit.setBounds(150,350,70,30);
        jFrame.add(jb_submit);

        jb_reset = new JButton("Reset");
        jb_reset.setBounds(300,350,70,30);
        jFrame.add(jb_reset);

        jFrame.setLayout(null);
        jFrame.setTitle("Registration Form");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1024, 768);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new RegistrationForm().doAction();
    }
}