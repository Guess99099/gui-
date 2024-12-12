package lesson01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        // 创建一个 Frame 对象，标题为 "我的第一个java窗口"
        Frame frame = new Frame("我的第一个java窗口");

        // 设置窗口可见
        frame.setVisible(true);

//        // 设置窗口大小为 400x400 像素
//        frame.setSize(400, 400);

        // 设置窗口的位置和大小
        // x: 窗口左上角的 x 坐标,就是位于屏幕的哪一个位置
        // y: 窗口左上角的 y 坐标,就是位于屏幕的哪一个位置
        // width: 窗口的宽度
        // height: 窗口的高度
        frame.setBounds(100, 100, 200, 200);

        // 设置窗口背景颜色为黑色
        frame.setBackground(Color.black);

//        // 设置窗口初始位置为 (200, 200) 像素
//        frame.setLocation(200, 200);

        // 设置窗口大小不可调整
        frame.setResizable(false);

    }
}
