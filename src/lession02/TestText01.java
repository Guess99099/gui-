package lession02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        MyFrame1 myFrame1 = new MyFrame1();
    }

}

class MyFrame1 extends Frame{
    public MyFrame1(){
//        创建文本框
        TextField textField = new TextField();
//        将文本框加入到窗口中
        add(textField);
//        给文本框添加监听事件
        textField.addActionListener(new TextListener());

//        设置文本的替换字符,就是将输入的字符全部改为*,从而在窗口在展现的是*,而不是具体输入的内容,但是在控制台输出的是输入的字符
        textField.setEchoChar('*');

//        设置窗口的可视化
        setVisible(true);
//        自动填充窗口
        pack();

    }
}

class TextListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}
