package lesson01;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {

        // 创建一个 Frame 对象，作为主窗口
        Frame frame = new Frame();

        // 创建三个 Button 对象，分别命名为 "b1", "b2", "b3"
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");


        /*
详细解释
FlowLayout：FlowLayout 是 Java AWT 中的一种布局管理器。它将容器中的组件按添加顺序从左到右排列，类似于文本在文档中的排列方式。
FlowLayout 的特点
1. 顺序排列：组件按添加顺序排列。当一行放不下时，自动换行。
2.自动调整：当窗口大小改变时，FlowLayout 会自动调整组件的位置，使它们在容器中保持合理的排列。
3. 简单易用：适合用于简单的布局场景，特别是当你希望组件按顺序排列时。

   FlowLayout(int align, int hgap, int vgap)
构造函数和参数
1. 默认构造函数   默认对齐方式：FlowLayout.CENTER    默认水平间距：5 像素     默认垂直间距：5 像素
2. 指定对齐方式
align：指定对齐方式，可以是以下之一：
FlowLayout.LEFT：左对齐
FlowLayout.CENTER：居中对齐
FlowLayout.RIGHT：右对齐
FlowLayout.LEADING：与容器的开始边对齐（通常是左对齐）
FlowLayout.TRAILING：与容器的结束边对齐（通常是右对齐）
3. 指定对齐方式和间距    align：同上，指定对齐方式。    hgap：水平间距，组件之间的水平间距（以像素为单位）。    vgap：垂直间距，组件之间的垂直间距（以像素为单位）。
        */
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 设置 Frame 的大小为 200x200 像素
        frame.setSize(200, 200);

        // 将按钮 b1, b2, b3 添加到 Frame 中
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        // 设置 Frame 可见
        frame.setVisible(true);


    }
}
