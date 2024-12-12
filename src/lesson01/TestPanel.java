package lesson01;

import java.awt.*;

public class TestPanel {
    public static void main(String[] args) {
        // 创建一个 Frame 对象，作为主窗口
        Frame frame = new Frame();

        // 创建一个 Panel 对象，作为子面板
        Panel panel = new Panel();

        // 设置 Frame 的布局管理器为 null，使用绝对布局
        frame.setLayout(null);

        // 设置 Frame 的位置和大小
        frame.setBounds(300, 300, 500, 500);

        // 设置 Frame 的背景颜色为绿色
        frame.setBackground(Color.green);

        // 设置 Panel 的位置和大小
        // Panel 的位置是相对于 Frame 的
        panel.setBounds(50, 50, 400, 400);

        // 设置 Panel 的背景颜色为红色
        panel.setBackground(Color.red);

        // 将 Panel 添加到 Frame 中
        frame.add(panel);

        // 设置 Frame 可见
        frame.setVisible(true);
    }
}
