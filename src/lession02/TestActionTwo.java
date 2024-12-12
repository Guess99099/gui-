package lession02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
//        两个按钮实现一个事件监听

        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("end");

       button2.setActionCommand("bbb");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.SOUTH);



        frame.pack();
        frame.setVisible(true);
    }


}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="start"){
            System.out.println("开启");
        } else if (e.getActionCommand()=="end") {
            System.out.println("结束");
        } else if (e.getActionCommand()=="bbb") {
            System.out.println("bbb");
        }
    }
}
