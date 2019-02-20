package Assignment8.StudentDetails;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentView extends JFrame {
    JTextField studentName;
    JTextField studentId;
    ButtonGroup studentGender;
    JButton submitButton;
    JButton viewButton;
    JButton hideButton;
    StudentController studentController;
    JRadioButton male;
    JRadioButton female;
    JPanel viewPanel;
    JPanel hidePanel;

    JPanel namePanel;
    JPanel idPanel;
    JPanel genderPanel;
    JPanel submitPanel;

    StudentView() {
        studentController = new StudentController();
        createForm();
        setActionListener();
        this.setVisible(true);
        this.setLocation(1400, 900);
        this.setSize(1024, 1024);
        pack();
    }

    public void setActionListener() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = studentName.getText();
                String id = studentId.getText();
                String gender = male.isSelected() ? "Male" : "Female";
                studentGender.clearSelection();
                studentName.setText("");
                studentId.setText("");
                studentController.addEntry(name, id, gender);
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewPanel.setVisible(true);
                namePanel.setVisible(false);
                idPanel.setVisible(false);
                genderPanel.setVisible(false);
                submitPanel.setVisible(false);
                hidePanel.setVisible(true);
                viewButton.setVisible(false);

                List<StudentModel> studentModelList = studentController.getModelArrayList();
                DefaultTableModel tableModel = new DefaultTableModel(0, 3);

                String[] heading = {"Student ID","Student Name", "Gender"};

                tableModel.addRow(heading);
                studentModelList.forEach(model -> {
                    String[] entry = new String[3];
                    entry[0] = model.getName();
                    entry[1] = model.getId();
                    entry[2] = model.getGender().name();

                    System.out.println(entry[0] + " " +entry[1] +" " +entry[2]);
                    tableModel.addRow(entry);
                });

                JTable jTable = new JTable(tableModel);
                jTable.setSize(new Dimension(1024, 600));
                jTable.setRowHeight(50);
                jTable.setFont(new Font("TimesRoman", Font.BOLD, 30));
                viewPanel.add(jTable);
            }
        });

        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewPanel.setVisible(false);
                namePanel.setVisible(true);
                idPanel.setVisible(true);
                genderPanel.setVisible(true);
                submitPanel.setVisible(true);
                hidePanel.setVisible(false);
                viewButton.setVisible(true);
                viewPanel.remove(0);
            }
        });
    }

    public void createForm() {
        Container container = this.getContentPane();
        Font f = new Font("TimesRoman", Font.BOLD, 35);
        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.PAGE_AXIS);
        container.setLayout(boxLayout);

        hidePanel = new JPanel();
        hideButton = new JButton();
        hideButton.setFont(f);
        hideButton.setText("Back to Form");
        hideButton.setMaximumSize(new Dimension(5, 10));
        container.add(hidePanel);
        hidePanel.setLayout(new GridLayout(1,10));
        hidePanel.add(hideButton);
        hidePanel.setMaximumSize(new Dimension(1024, 100));
        hidePanel.setVisible(false);
        namePanel = new JPanel(new GridLayout(1,2));
        idPanel = new JPanel(new GridLayout(1,2));
        genderPanel = new JPanel(new GridLayout(1,3));
        JPanel genderPanelSub = new JPanel(new GridLayout(2, 1));
        submitPanel = new JPanel();
        JLabel studentNameLabel = new JLabel("Student Name");
        JLabel studentIdLabel = new JLabel("Student Id");
        JLabel studentGenderLabel = new JLabel("Student Gender");

        studentNameLabel.setFont(f);
        studentIdLabel.setFont(f);
        studentGenderLabel.setFont(f);

        studentName = new JTextField();
        studentName.setMaximumSize(new Dimension(100, 100));

        studentId = new JTextField();
        studentGender = new ButtonGroup();
        studentName.setFont(f);
        studentId.setFont(f);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        studentGender.add(male);
        studentGender.add(female);

         male.setFont(f);
        female.setFont(f);

        studentGender.add(male);
        studentGender.add(female);
        genderPanelSub.add(male);
        genderPanelSub.add(female);

        namePanel.add(studentNameLabel);
        namePanel.add(studentName);

        idPanel.add(studentIdLabel);
        idPanel.add(studentId);

        genderPanel.add(studentGenderLabel);
        genderPanel.add(genderPanelSub);

        container.add(namePanel);
        container.add(idPanel);
        container.add(genderPanel);

        namePanel.setMaximumSize(new Dimension(1024, 400));
        idPanel.setMaximumSize(new Dimension(1024, 400));
        genderPanel.setMaximumSize(new Dimension(1024, 400));

        submitButton = new JButton();
        submitButton.setFont(f);
        submitButton.setText("Submit Form");
        container.add(submitPanel);
        submitPanel.setLayout(new BorderLayout());
        submitPanel.add(submitButton);
        submitPanel.setMaximumSize(new Dimension(1024, 200));

        JPanel viewButtonPanel = new JPanel();
        viewButton = new JButton();
        viewButton.setFont(f);
        viewButton.setText("View Students");
        viewButton.setMaximumSize(new Dimension(1024, 10));
        container.add(viewButtonPanel);
        viewButtonPanel.setLayout(new GridLayout(1,10));
        viewButtonPanel.add(viewButton);
        viewButtonPanel.setMaximumSize(new Dimension(1024, 100));

        viewPanel = new JPanel();
        BoxLayout boxLayout1 = new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS);
        viewPanel.setLayout(boxLayout1);
        viewPanel.setVisible(false);
        container.add(viewPanel);
        viewPanel.setSize(new Dimension(1024, 1024));
    }

    public static void main(String[] args) {
        StudentView studentView = new StudentView();
    }
}