package Project;

import javax.swing.*;
import java.awt.*;

public class Search extends JFrame {

    public Search() {
        createComponents();
    }

    public void createComponents() {

        Font f_bold = new Font("TimesRoman", Font.BOLD, 50);
        Font f_normal = new Font("TimesRoman", Font.PLAIN, 50);
        Font f_small = new Font("TimesRoman", Font.ITALIC, 40);

        Container c = this.getContentPane();
        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Car ID:");
        nameLabel.setFont(f_bold);
        JTextField textField = new JTextField();
        textField.setFont(f_normal);
        //textField.setSize(190, 50);
        JLabel brandLabel = new JLabel("Car Brand:");
        brandLabel.setFont(f_bold);
        //JTextField brandField = new JTextField();
        //textField.setSize(50, 60);
        JLabel modelLabel = new JLabel("Car Model:");
        modelLabel.setFont(f_bold);
        // JTextField modelField = new JTextField();

        String Id[] = {"A100", "B200"};
        JComboBox IdCB = new JComboBox(Id);
        IdCB.setFont(f_normal);

        String brand[] = {"Audi", "Benz"};
        JComboBox brandCB = new JComboBox(brand);
        brandCB.setFont(f_normal);
        String model[] = {"2008 ", "2010B"};
        JComboBox modelCB = new JComboBox(model);
        modelCB.setFont(f_normal);

        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setFont(f_bold);
        JLabel yearMinLabel = new JLabel("Min");
        yearMinLabel.setFont(f_small);
        JTextField yearMinText = new JTextField();
        yearMinText.setFont(f_normal);
        JLabel yearMaxLabel = new JLabel("Max");
        yearMaxLabel.setFont(f_small);
        JTextField yearMaxText = new JTextField();
        yearMaxText.setFont(f_normal);

        JLabel MilesLabel = new JLabel("Miles:");
        MilesLabel.setFont(f_bold);
        JLabel milesMinLabel = new JLabel("Min");
        milesMinLabel.setFont(f_small);
        JTextField milesMinText = new JTextField();
        milesMinText.setFont(f_normal);
        JLabel milesMaxLabel = new JLabel("Max");
        milesMaxLabel.setFont(f_small);
        JTextField milesMaxText = new JTextField();
        milesMaxText.setFont(f_normal);

        JLabel priceLabel = new JLabel("Price:");
        JLabel priceMinLabel = new JLabel("Min");
        JTextField priceMinText = new JTextField();
        priceMinText.setFont(f_normal);
        JLabel priceMaxLabel = new JLabel("Max");
        JTextField priceMaxText = new JTextField();
        priceMaxText.setFont(f_normal);
        priceLabel.setFont(f_bold);
        priceMinLabel.setFont(f_small);
        priceMaxLabel.setFont(f_small);

        JLabel vehicleTypeLabel = new JLabel("Vehicle Type");
        ButtonGroup vehicleTypeButtonGroup = new ButtonGroup();
        JRadioButton vehicleTypeUsed = new JRadioButton("Used");
        JRadioButton vehicleTypeUnUsed = new JRadioButton("UnUsed");
        vehicleTypeLabel.setFont(f_bold);
        vehicleTypeUsed.setFont(f_small);
        vehicleTypeUnUsed.setFont(f_small);

        vehicleTypeButtonGroup.add(vehicleTypeUsed);
        vehicleTypeButtonGroup.add(vehicleTypeUnUsed);

        JLabel colorLabel = new JLabel("Color:");
        JLabel colorExteriorLabel = new JLabel("Exterior");
        JTextField colorExteriorText = new JTextField();
        colorExteriorText.setFont(f_normal);
        JLabel colorInteriorLabel = new JLabel("Interior");
        JTextField colorInteriorText = new JTextField();
        colorInteriorText.setFont(f_normal);
        colorLabel.setFont(f_bold);
        colorInteriorLabel.setFont(f_small);
        colorExteriorLabel.setFont(f_small);

        JButton searchButton = new JButton("Search");
        searchButton.setFont(f_bold);
        searchButton.setHorizontalAlignment(0);
        searchButton.setVerticalAlignment(0);

        GroupLayout layout = new GroupLayout(panel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.ParallelGroup allRows = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        //allRows.addGap(1000);
        allRows.addGap(100, 300, 1000);

        /// Row 1
        GroupLayout.ParallelGroup row1_2_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(brandCB);
        GroupLayout.ParallelGroup row1_2_2_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(modelCB);
        GroupLayout.SequentialGroup row1_2_2 = layout.createSequentialGroup()
                .addComponent(modelLabel)
                .addGroup(row1_2_2_1);
        GroupLayout.ParallelGroup row1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(IdCB);
        GroupLayout.SequentialGroup row1_2 = layout.createSequentialGroup()
                .addComponent(brandLabel)
                .addGroup(row1_2_1)
                .addGroup(row1_2_2);
        GroupLayout.SequentialGroup row1 = layout.createSequentialGroup().addComponent(nameLabel)
                .addGroup(row1_1)
                .addGroup(row1_2);

        //Row 2
        GroupLayout.ParallelGroup row2_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(yearMinLabel);
        GroupLayout.ParallelGroup row2_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(yearMinText);
        GroupLayout.ParallelGroup row2_1_3 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(yearMaxLabel);
        GroupLayout.ParallelGroup row2_1_4 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(yearMaxText);
        GroupLayout.SequentialGroup row2_1 = layout.createSequentialGroup()
                .addComponent(yearLabel)
                .addGroup(row2_1_1)
                .addGroup(row2_1_2)
                .addGroup(row2_1_3)
                .addGroup(row2_1_4);
        GroupLayout.SequentialGroup row2 = layout.createSequentialGroup().addGroup(row2_1);

        //Row 3
        GroupLayout.ParallelGroup row3_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(milesMinLabel);
        GroupLayout.ParallelGroup row3_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(milesMinText);
        GroupLayout.ParallelGroup row3_1_3 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(milesMaxLabel);
        GroupLayout.ParallelGroup row3_1_4 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(milesMaxText);
        GroupLayout.SequentialGroup row3_1 = layout.createSequentialGroup()
                .addComponent(MilesLabel)
                .addGroup(row3_1_1)
                .addGroup(row3_1_2)
                .addGroup(row3_1_3)
                .addGroup(row3_1_4);
        GroupLayout.SequentialGroup row3 = layout.createSequentialGroup().addGroup(row3_1);

        //Row 4
        GroupLayout.ParallelGroup row4_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(priceMinLabel);
        GroupLayout.ParallelGroup row4_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(priceMinText);
        GroupLayout.ParallelGroup row4_1_3 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(priceMaxLabel);
        GroupLayout.ParallelGroup row4_1_4 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(priceMaxText);
        GroupLayout.SequentialGroup row4_1 = layout.createSequentialGroup()
                .addComponent(priceLabel)
                .addGroup(row4_1_1)
                .addGroup(row4_1_2)
                .addGroup(row4_1_3)
                .addGroup(row4_1_4);
        GroupLayout.SequentialGroup row4 = layout.createSequentialGroup().addGroup(row4_1);

        //Row 5
        GroupLayout.ParallelGroup row5_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(vehicleTypeUsed);
        GroupLayout.ParallelGroup row5_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(vehicleTypeUnUsed);
        GroupLayout.SequentialGroup row5_1 = layout.createSequentialGroup()
                .addComponent(vehicleTypeLabel)
                .addGroup(row5_1_1)
                .addGroup(row5_1_2);
        GroupLayout.SequentialGroup row5 = layout.createSequentialGroup().addGroup(row5_1);

        //Row 6
        GroupLayout.ParallelGroup row6_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(colorExteriorLabel);
        GroupLayout.ParallelGroup row6_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(colorExteriorText);
        GroupLayout.ParallelGroup row6_1_3 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(colorInteriorLabel);
        GroupLayout.ParallelGroup row6_1_4 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(colorInteriorText);
        GroupLayout.SequentialGroup row6_1 = layout.createSequentialGroup()
                .addComponent(colorLabel)
                .addGroup(row6_1_1)
                .addGroup(row6_1_2)
                .addGroup(row6_1_3)
                .addGroup(row6_1_4);
        GroupLayout.SequentialGroup row6 = layout.createSequentialGroup().addGroup(row6_1);

        //Row 7
        GroupLayout.SequentialGroup row7_1 = layout.createSequentialGroup()
                .addComponent(searchButton);
        row7_1.addContainerGap(400, 900);
        row7_1.addGap(60);
        GroupLayout.SequentialGroup row7 = layout.createSequentialGroup().addGroup(row7_1);


        //Main
        layout.setHorizontalGroup(allRows
                .addGroup(row1)
                .addGroup(row2)
                .addGroup(row3)
                .addGroup(row4)
                .addGroup(row5)
                .addGroup(row6)
                .addGroup(row7));

        GroupLayout.ParallelGroup v_1 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(nameLabel)
                .addComponent(IdCB)
                .addComponent(brandLabel)
                .addComponent(brandCB)
                .addComponent(modelLabel)
                .addComponent(modelCB);

        GroupLayout.ParallelGroup v_2 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(yearLabel)
                .addComponent(yearMinLabel)
                .addComponent(yearMinText)
                .addComponent(yearMaxLabel)
                .addComponent(yearMaxText);

        GroupLayout.ParallelGroup v_3 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(MilesLabel)
                .addComponent(milesMinLabel)
                .addComponent(milesMinText)
                .addComponent(milesMaxLabel)
                .addComponent(milesMaxText);

        GroupLayout.ParallelGroup v_4 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(priceLabel)
                .addComponent(priceMinLabel)
                .addComponent(priceMinText)
                .addComponent(priceMaxLabel)
                .addComponent(priceMaxText);

        GroupLayout.ParallelGroup v_5 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(vehicleTypeLabel)
                .addComponent(vehicleTypeUsed)
                .addComponent(vehicleTypeUnUsed);

        GroupLayout.ParallelGroup v_6 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(colorLabel)
                .addComponent(colorExteriorLabel)
                .addComponent(colorExteriorText)
                .addComponent(colorInteriorLabel)
                .addComponent(colorInteriorText);

        GroupLayout.ParallelGroup v_7 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(searchButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(v_1)
                .addGroup(v_2)
                .addGroup(v_3)
                .addGroup(v_4)
                .addGroup(v_5)
                .addGroup(v_6)
                .addGroup(v_7));

        panel.setLayout(layout);
       // setSize(1600, 1600);
        c.add(panel);
        this.setVisible(true);
        pack();

























/*
        GroupLayout.SequentialGroup sg = layout.createSequentialGroup();

        sg.addComponent(nameLabel);
        layout.setHorizontalGroup(sg);
        layout.setAutoCreateContainerGaps(true);
        setTitle("Simple");
        setLocationRelativeTo(null);*/
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       this. setVisible(true);


       /* GridLayout gridLayout = new GridLayout(2, 1);

        Container c = this.getContentPane();
        JPanel panelScreen = new JPanel(gridLayout);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Search");
        nameLabel.setFont(new Font("TimesRoman", Font.BOLD, 30));
        panelScreen.add(nameLabel);
        JScrollPane scroll = new JScrollPane(panelScreen);

        JMenuBar menu = new JMenuBar();
        JMenu me = new JMenu("Car ID");
        me.setFont(new Font("TimesRoman", Font.BOLD, 30));
        JMenuItem item = new JMenuItem("ID 1");
        JMenuItem item2 = new JMenuItem("ID 2");
        item.setFont(new Font("TimesRoman", Font.BOLD, 30));
        me.add(item);
        me.add(item2);
        menu.add(me);
        panelScreen.add(menu);
        c.add(panelScreen);
        setSize(1300, 1400);
        setVisible(true);
*/

      /*  JPanel row1=new JPanel();
        JLabel carIDLabel = new JLabel();
        carIDLabel.setText("Car ID: ");
        JLabel brandLabel = new JLabel();
        brandLabel.setText("Brand: ");
        JLabel modelLabel = new JLabel();
        modelLabel.setText("Model: ");
        JList list=new JList();
        JCheckBoxMenuItem brandCB=new JCheckBoxMenuItem();
        JCheckBoxMenuItem modelCB=new JCheckBoxMenuItem();
        row1.add(carIDLabel);
        row1.add(brandLabel);
        row1.add(brandCB);
        row1.add(list);
        row1.add(modelLabel);
        row1.add(modelCB);

        c.add(row1);*/
//        setVisible(true);


    }

    public static void main(String[] args) {
        Search search = new Search();
    }


}
