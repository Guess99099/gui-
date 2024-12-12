package lesson01;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        // 创建一个 Frame 对象，标题为 "dfa"
        Frame frame = new Frame("dfa");

        // 创建六个 Button 对象，分别命名为 "bt1", "bt2", "bt3", "bt4", "bt5", "bt6"
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");

        /*
GridLayout 是 Java AWT 中的一种布局管理器，用于将容器划分为一个网格，每个单元格的大小相同。它非常适合用于需要均匀排列组件的场景
基本概念
均匀网格：GridLayout 将容器划分为一个均匀的网格，每个单元格的大小相同。
行优先顺序：组件按行优先的顺序填充网格，即先填满第一行，然后是第二行，依此类推。
构造函数
GridLayout 提供了几个构造函数，允许你指定网格的行数、列数以及组件之间的间距。
   GridLayout()
1. 默认构造函数
创建一个默认的 GridLayout，行数和列数都为 1。
   GridLayout(int rows, int cols)
2. 指定行数和列数
rows：指定网格的行数。如果为 0，则行数根据组件数量和列数自动计算。
cols：指定网格的列数。如果为 0，则列数根据组件数量和行数自动计算。
   GridLayout(int rows, int cols, int hgap, int vgap)
3,指定行数、列数和间距
rows：指定网格的行数。如果为 0，则行数根据组件数量和列数自动计算。
cols：指定网格的列数。如果为 0，则列数根据组件数量和行数自动计算。
hgap：组件之间的水平间距（以像素为单位）。
vgap：组件之间的垂直间距（以像素为单位）。
        * */
        // 设置 Frame 的布局管理器为 GridLayout，3 行 2 列
        frame.setLayout(new GridLayout(3, 2));

        // 将按钮添加到 Frame 中
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);

        // 调整 Frame 的大小以适应其内容
        frame.pack();

        // 设置 Frame 可见
        frame.setVisible(true);
    }
}
