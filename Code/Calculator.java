package Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.*;

public class Calculator extends  JFrame{

    enum operations {
        ADD,SUB, MUL, DIV;
    }

    private JButton oneButton;
    int currentResult;
    operations lastOperation;
    JTextField result;

    public Calculator()
    {
        this.setTitle("Calculator");
        this.currentResult = 0;
        this.lastOperation = null;
        createComponents();
       //this.setLayout();
     // addComponents();
      //  addBehaviors();
        display();
    }

    public void display()
    {
        //this.pack();
        this.setVisible(true);
    }


    public void resultDisplay(JPanel panelScreen) {
        GridLayout gridLayout = new GridLayout(1,1);
        JPanel jPanel = new JPanel(gridLayout);
        Font font = new Font("TimesRoman", Font.PLAIN, 36);
        result = new JTextField();
        result.setFont(font);
        result.setBackground(Color.WHITE);
        result.setEnabled(true);
        result.setHorizontalAlignment(CENTER);
        result.setSize(0,100);
        result.setText(String.valueOf(currentResult));
        jPanel.setMaximumSize(new Dimension(1024, 300));
        jPanel.add(result);
        System.out.println(result.getMaximumSize());
        panelScreen.add(jPanel);
    }

    class Sample implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public void calcFeaturesDisplay(JPanel panelScreen) {
        GridLayout g2=new GridLayout(0,2);
        JPanel panel1 = new JPanel(g2);
        GridLayout numbersgrid = new GridLayout(4, 3);

        JPanel panel = new JPanel(numbersgrid);
        Font font = new Font("TimesRoman", Font.BOLD, 36);
        for(int i =1;i<=10;i++) {
            JButton one = new JButton(String.valueOf(i==10?0:i));
            final int valueToActionListen = i;
            one.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(lastOperation!=null) {
                        switch (lastOperation) {
                            case ADD:
                                currentResult = currentResult + valueToActionListen;
                                break;
                            case SUB:
                                currentResult = currentResult - valueToActionListen;
                                break;
                            case MUL:
                                currentResult = currentResult * valueToActionListen;
                                break;
                            case DIV:
                                currentResult = currentResult / valueToActionListen;
                                break;
                            default:
                                currentResult = currentResult * 10 + valueToActionListen;
                        }
                    } else {
                        currentResult = currentResult * 10 + valueToActionListen;
                    }
                    System.out.println("Divi Babe " + currentResult);
                    result.setText(String.valueOf(currentResult));
                }
            });
            one.setFont(font);
            panel.add(one);
        }
        JButton equal = new JButton("=");
        equal.setFont(font);
        JButton cancel = new JButton("Clear");
        cancel.setFont(font);
        panel.add(equal);
        panel.add(cancel);
        panel1.add(panel);
        addSymbols(panel1);
        panel1.setMaximumSize(new Dimension(1024, 800));
        panelScreen.add(panel1);
    }

    public void addSymbols(JPanel panel1) {
        GridLayout symbolsgrid=new GridLayout(4,0);
        Font font = new Font("TimesRoman", Font.BOLD, 36);
        JPanel symbol = new JPanel(symbolsgrid);

        JButton add = new JButton("+");
        add.setFont(font);
        JButton sub = new JButton("-");
        sub.setFont(font);
        JButton mul = new JButton("*");
        mul.setFont(font);
        JButton div = new JButton("/");
        div.setFont(font);
        // JButton comp = new JButton("=");

        JButton[] jButtons = {add, sub, mul, div};
        for(JButton currentButton : jButtons) {
            currentButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch(e.getActionCommand()) {
                        case "+" : lastOperation = operations.ADD; break;
                        case "-" : lastOperation = operations.ADD; break;
                        case "*" : lastOperation = operations.ADD; break;
                        case "/" : lastOperation = operations.ADD; break;
                        default: lastOperation = null;
                    }
                }
            });
        }


        symbol.add(add);
        symbol.add(sub);
        symbol.add(mul);
        symbol.add(div);
        //   symbol.add(comp);
        panel1.add(symbol);
    }

    public void createMenu(JPanel panelScreen) {
        GridLayout gridLayout = new GridLayout(1,1);
        Panel menu = new Panel(gridLayout);
        TextField field = new TextField();
        field.setFont(new Font("TimesRoman", Font.BOLD, 36));
        field.setEditable(false);
        field.setSize(1024, 150);
        field.setText("Standard Calculator");
        menu.add(field);
        menu.setMaximumSize(new Dimension(1024, 150));
        panelScreen.add(menu);
    }

    public void createComponents()
    {
        Container c = this.getContentPane();
       // GridLayout g = new GridLayout(3, 1);
        JPanel panelScreen = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelScreen, BoxLayout.PAGE_AXIS);

        panelScreen.setLayout(boxLayout);

        this.setLocation(1400, 900);
        this.setSize(1024, 1024);
        this.getContentPane().add(panelScreen);
        // panelScreen.add(Box.createRigidArea(new Dimension(100,100)));
        this.createMenu(panelScreen);
        this.resultDisplay(panelScreen);
        this.calcFeaturesDisplay(panelScreen);
        c.add(panelScreen);
    }

    public static void main(String[] args) {

        Calculator cal=new Calculator();
    }
}

 /* JPanel panelScreen = new JPanel(new GridLayout(0,1));
        JPanel panelButtons = new JPanel(new GridLayout(3,3));*/


//   panelButtons.add(oneButton);

      /*  jframe.getContentPane().add(panelScreen, BorderLayout.NORTH);
        jframe.getContentPane().add(panelButtons, BorderLayout.SOUTH);*/
