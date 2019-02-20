package Assignment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal extends JFrame {
    enum operations {
        ADD,SUB, MUL, DIV
    }

    JTextField current;
    JTextField buffer;
    operations Operation;

    public Cal()
    {
        this.setTitle("Calculator");
        createComponents();
        display();
    }

    public void display()
    {
       this.setVisible(true);
    }


    public void setNumbers(JPanel panelScreen) {
        GridLayout gridLayout = new GridLayout(0, 2);
        JPanel panel1 = new JPanel(gridLayout);
        panel1.setMaximumSize(new Dimension(1024, 600));
        GridLayout numbersgrid = new GridLayout(4, 3);
        JPanel row1 = new JPanel(numbersgrid);
        JButton button=null;
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                button = new JButton("0");
                Font font = new Font("TimesRoman", Font.BOLD, 36);
                button.setFont(font);
                row1.add(button);
            }

            if(i!=10) {
                button = new JButton(Integer.toString(i));
                Font font = new Font("TimesRoman", Font.BOLD, 36);
                button.setFont(font);
                row1.add(button);
            }
            button.addActionListener(new ActionListener() {
                String display;
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getActionCommand().equals(e.getActionCommand()))
                    {
                        display=current.getText()+e.getActionCommand();
                    }
                    current.setText(display);
                }
            });
        }
        JButton equal = new JButton("=");
        JButton cancel = new JButton("Clear");
        Font font = new Font("TimesRoman", Font.BOLD, 36);
        equal.setFont(font);
        equal.addActionListener(new ActionListener() {
            int solution=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.setVisible(false);
                if(Operation==operations.ADD) {
                    solution=(Integer.parseInt(current.getText())+Integer.parseInt(buffer.getText()));
                }
                if(Operation==operations.SUB) {
                    solution=(Integer.parseInt(current.getText())-Integer.parseInt(buffer.getText()));
                }
                if(Operation==operations.MUL) {
                    solution=(Integer.parseInt(current.getText())*Integer.parseInt(buffer.getText()));
                }
                if(Operation==operations.DIV) {
                    solution=(Integer.parseInt(current.getText())/Integer.parseInt(buffer.getText()));
                }
                Operation=null;
                buffer.setText("");
                current.setText(String.valueOf(solution));
                }
            });
        cancel.setFont(font);
        row1.add(equal);
        row1.add(cancel);
        panel1.add(row1);
        panelScreen.add(panel1);
        cancel.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                     //   result.setText("");
                                        buffer.setText("");
                                        current.setText("");
                                        Operation=null;
                                     }
                                 });
                setOperators(panel1,panelScreen);
    }


        public void setOperators(JPanel panel1, JPanel panelScreen)
        {
        GridLayout symbolLayout = new GridLayout(4,0);
        JPanel sym=new JPanel(symbolLayout);
        JButton add=new JButton("+");
        JButton sub=new JButton("-");
        JButton mul=new JButton("*");
        JButton div=new JButton("/");
        Font font1 = new Font("TimesRoman", Font.BOLD, 36);
        add.setFont(font1);
        sub.setFont(font1);
        mul.setFont(font1);
        div.setFont(font1);
        sym.add(add);
        sym.add(sub);
        sym.add(mul);
        sym.add(div);
        panel1.add(sym);
        panelScreen.add(panel1);
            JButton[] jButtons = {add, sub, mul, div};
            for(JButton currentButton : jButtons) {
            currentButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   // first=Integer.parseInt(current.getText());
                    int solution=0;
                    if(Operation!=null)
                    {
                        if(Operation==operations.ADD) {
                            solution=(Integer.parseInt(current.getText())+Integer.parseInt(buffer.getText()));
                        }
                        if(Operation==operations.SUB) {
                            solution=(Integer.parseInt(current.getText())-Integer.parseInt(buffer.getText()));
                        }
                        if(Operation==operations.MUL) {
                            solution=(Integer.parseInt(current.getText())*Integer.parseInt(buffer.getText()));
                        }
                        if(Operation==operations.DIV) {
                            solution=(Integer.parseInt(current.getText())/Integer.parseInt(buffer.getText()));
                        }
                        current.setText(String.valueOf(solution));
                    }
                    buffer.setText(current.getText());
                    current.setText("");
                    buffer.setVisible(true);

                    switch (e.getActionCommand()) {
                        case "+":
                            Operation = operations.ADD;
                            break;
                        case "-":
                            Operation = operations.SUB;
                            break;
                        case "*":
                            Operation = operations.MUL;
                            break;
                        case "/":
                            Operation = operations.DIV;
                            break;
                        default:
                            Operation = null;
                    }

                }
            } );
            }
    }


    public void resultDisplay(JPanel panelScreen) {
        GridLayout gridLayout = new GridLayout(2,1);
        JPanel jPanel = new JPanel(gridLayout);
        Font font = new Font("TimesRoman", Font.PLAIN, 36);
        jPanel.setMaximumSize(new Dimension(1024, 200));
        panelScreen.add(jPanel);

        buffer=new JTextField();
        buffer.setFont(font);
        buffer.setHorizontalAlignment(JTextField.RIGHT);
        buffer.setEditable(false);
        jPanel.add(buffer);

        current=new JTextField();
        current.setFont(font);
        current.setHorizontalAlignment(JTextField.RIGHT);
        current.setEditable(false);
        jPanel.add(current);
    }


    public void createMenu(JPanel panelScreen) {
        GridLayout gridLayout = new GridLayout(1,1);
        JPanel menu = new JPanel(gridLayout);
        TextField field = new TextField();
        field.setFont(new Font("TimesRoman", Font.BOLD, 36));
        field.setSize(1024, 150);
        field.setText("Standard Calculator");
        field.setEditable(false);
        menu.add(field);
        menu.setMaximumSize(new Dimension(1024, 150));
        panelScreen.add(menu);
    }

    public void createComponents()
    {
        Container c = this.getContentPane();
        JPanel panelScreen = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelScreen, BoxLayout.PAGE_AXIS);
        panelScreen.setLayout(boxLayout);
        this.setLocation(1400, 900);
        this.setSize(1024, 1024);
        this.getContentPane().add(panelScreen);
        this.createMenu(panelScreen);
        this.resultDisplay(panelScreen);
        this.setNumbers(panelScreen);
        c.add(panelScreen);
    }

    public static void main(String[] args)
    {
        Cal cal=new Cal();
    }
}
