package lesson01;

import java.awt.*;

public class TestDemo {
    public static void main(String[] args) {

        Button button = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button10 = new Button("10");

        Frame frame = new Frame();
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(2,0));


//        上部分
        Panel panel = new Panel(new BorderLayout());
        panel.add(button2,BorderLayout.EAST);
        panel.add(button3,BorderLayout.WEST);
//        上部分的中间
        Panel panel1 = new Panel(new GridLayout(2,1));
        panel1.add(button4);
        panel1.add(button1);
        panel.add(panel1,BorderLayout.CENTER);
        frame.add(panel);


        Panel panel2 = new Panel(new BorderLayout());
        panel2.add(button5,BorderLayout.EAST);
        panel2.add(button6,BorderLayout.WEST);
        Panel panel3 = new Panel(new GridLayout(2, 2));
        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);
        panel3.add(button10);
        panel2.add(panel3,BorderLayout.CENTER);
        frame.add(panel2);

        frame.pack();


        frame.setVisible(true);
    }
}
