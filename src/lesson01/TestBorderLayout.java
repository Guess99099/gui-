package lesson01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        // 创建一个 Frame 对象，标题为 "daf"
        Frame frame = new Frame("daf");

        /*
BorderLayout 的区域
BorderLayout 是 Java AWT 中的一种布局管理器，它将容器分为五个区域：
1. NORTH：北边区域，位于容器的顶部。
2. SOUTH：南边区域，位于容器的底部。
3. EAST：东边区域，位于容器的右侧。
4. WEST：西边区域，位于容器的左侧。
5. CENTER：中间区域，占据剩余的所有空间。
frame.add(esat, BorderLayout.EAST);
这行代码将按钮 esat 添加到 Frame 的东边区域。BorderLayout 会自动调整 esat 的大小，使其适应东边区域的高度，并将其宽度设置为组件的首选宽度。
注意事项
每个区域最多只能放置一个组件。如果你在同一个区域添加多个组件，只有最后一个组件会显示。
CENTER 区域会占据剩余的所有空间，因此通常用于放置主要内容。
        * */
        // 创建五个 Button 对象，分别命名为 "Esat", "West", "South", "North", "Center"
        Button esat = new Button("Esat");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
//        Button center = new Button("Center");

        // 使用 BorderLayout 布局管理器将按钮添加到 Frame 中
        // BorderLayout 是 Frame 的默认布局管理器

        // 将按钮添加到东边
        frame.add(esat, BorderLayout.EAST);

        // 将按钮添加到西边
        frame.add(west, BorderLayout.WEST);

        // 将按钮添加到南边
        frame.add(south, BorderLayout.SOUTH);

        // 将按钮添加到北边
        frame.add(north, BorderLayout.NORTH);

        // 将按钮添加到中间
//        frame.add(center, BorderLayout.CENTER);

        // 设置 Frame 的大小为 200x200 像素
        frame.setSize(200, 200);


        // 设置 Frame 可见
        frame.setVisible(true);
    }
}
