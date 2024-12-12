package lession02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends Frame{
    public Calculator()  {
        TextField textField = new TextField(10);
        TextField textField2 = new TextField(10);
        TextField textField3 = new TextField(20);

        Button button = new Button("=");

        button.addActionListener(new CalcListener(textField,textField2,textField3));

        Label label = new Label("+");

        setLayout(new FlowLayout());
        add(textField);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();
        setVisible(true);
    }
}

class CalcListener implements ActionListener{

    TextField field1;
    TextField field2;
    TextField field3;
    public CalcListener(TextField field1,TextField field2,TextField field3) {
        this.field1=field1;
        this.field2=field2;
        this.field3=field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(field1.getText());
        int num2 = Integer.parseInt(field2.getText());
        field3.setText(""+(num1+num2));
    }
}
