package lesson01;

import java.awt.*;

public class TestHow {
    public static void main(String[] args) {
        Button button = new Button("123");
        Frame frame = new Frame("作业");
        frame.setLayout(new GridLayout(2,3));
        frame.add(button);
        frame.add(button);
        frame.add(button);
        frame.add(button);
        frame.add(button);
        frame.add(button);

        frame.pack();


        frame.setVisible(true);
    }
}
