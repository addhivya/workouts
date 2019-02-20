package Assignment8;

import javax.swing.*;
import java.awt.*;

public class Student extends JFrame {

    private JRadioButton Gender;

    public Student()
    {
        createComponents();
        //addGender();
    }

    public void createComponents()
    {
        Container container=this.getContentPane();
        GridLayout gridLayout = new GridLayout(5,2);
        GridLayout namegrid=new GridLayout(1,2);
        JPanel panel=new JPanel(gridLayout);
        JPanel namepanel=new JPanel(namegrid);

        JLabel nameLabel=new JLabel();
        nameLabel.setText("Name:");
        nameLabel.setSize(1024,1024);
        nameLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        namepanel.add(nameLabel);
        JTextField namefield=new JTextField();
        namefield.setSize(30,100);
        namepanel.add(namefield);
        namepanel.setMaximumSize(new Dimension(1024, 200));

        GridLayout gendergrid=new GridLayout(1,2);
        JPanel genderpanel=new JPanel(gendergrid);
        JLabel genderlabel=new JLabel();
        genderlabel.setText("Gender");
        genderlabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        genderpanel.add(genderlabel);
        JRadioButton mradioButton=new JRadioButton("Male");
        JRadioButton fradioButton=new JRadioButton("Female");
        mradioButton.setFont(new Font("TimesRoman", Font.BOLD, 30));
        fradioButton.setFont(new Font("TimesRoman", Font.BOLD, 30));
        genderpanel.add(mradioButton);
        genderpanel.add(fradioButton);
        panel.add(namepanel);
        panel.add(genderpanel);
        this.setLocation(1400, 900);
        this.setSize(1024, 1024);
        container.add(panel);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        Student student=new Student();
    }
}
