import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalc {
    private double total =0.0;
    private double totalEq =0.0;
    private char operator;

    private JPanel MyCalc;
    private JTextField jTextField;
    private JButton BtnBackS;
    private JButton Btn0;
    private JButton Btn1;
    private JButton Btn4;
    private JButton Btn7;
    private JButton Btn8;
    private JButton Btn5;
    private JButton Btn2;
    private JButton BtnDot;
    private JButton BtnC;
    private JButton Btn9;
    private JButton Btn6;
    private JButton Btn3;
    private JButton BtnEqual;
    private JButton BtnMul;
    private JButton BtnAdd;
    private JButton BtnSub;
    private JButton BtnDiv;

    private void getOperator (String btnText){
        operator = btnText.charAt(0);
        total = total + Double.parseDouble(jTextField.getText());
        jTextField.setText("");
    }

    public MyCalc() {
        Btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0Text = jTextField.getText() + Btn0.getText();
                jTextField.setText(btn0Text);
            }
        });

        Btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Btn1Text = jTextField.getText() + Btn1.getText();
                jTextField.setText(Btn1Text);
            }
        });

        Btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = jTextField.getText() + Btn2.getText();
                jTextField.setText(btn2Text);
            }
        });

        Btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = jTextField.getText() + Btn3.getText();
                jTextField.setText(btn3Text);
            }
        });

        Btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = jTextField.getText() + Btn4.getText();
                jTextField.setText(btn4Text);
            }
        });

        Btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = jTextField.getText() + Btn5.getText();
                jTextField.setText(btn5Text);
            }
        });

        Btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = jTextField.getText() + Btn6.getText();
                jTextField.setText(btn6Text);
            }
        });

        Btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = jTextField.getText() + Btn7.getText();
                jTextField.setText(btn7Text);
            }
        });

        Btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8Text = jTextField.getText() + Btn8.getText();
                jTextField.setText(btn8Text);
            }
        });

        Btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = jTextField.getText() + Btn9.getText();
                jTextField.setText(btn9Text);
            }
        });
        BtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTxt = BtnAdd.getText();
                getOperator(btnTxt);
            }
        });

        BtnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTxt = BtnSub.getText();
                getOperator(btnTxt);
            }
        });
        BtnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTxt = BtnDiv.getText();
                getOperator(btnTxt);
            }
        });
        BtnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTxt = BtnMul.getText();
                getOperator(btnTxt);
            }
        });

        BtnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator){
                    case '+':
                        totalEq = total + Double.parseDouble(jTextField.getText());
                        break;
                    case '-':
                        totalEq = total - Double.parseDouble(jTextField.getText());
                        break;
                    case '*':
                        totalEq = total * Double.parseDouble(jTextField.getText());
                        break;
                    case '/':
                        totalEq = total / Double.parseDouble(jTextField.getText());
                        break;
                }
                jTextField.setText(Double.toString(totalEq));
                total = 0;
            }
        });

        BtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalEq = 0;
                jTextField.setText("");

            }
        });

        BtnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextField.getText().equals("")){
                    jTextField.setText("0.");
                    //make readable ".123" to "0.123"
                }
                else if(jTextField.getText().contains(".")){
                    BtnDot.setEnabled(false);
                    //avoid "1.." or ".1." types
                }
                else{
                    String BtnDotText = jTextField.getText() + BtnDot.getText();
                    jTextField.setText(BtnDotText);
                }
                BtnDot.setEnabled(true);
            }
        });

        BtnBackS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if(jTextField.getText().length()>0){
                    StringBuilder strBSpace = new StringBuilder(jTextField.getText());
                    strBSpace.deleteCharAt(jTextField.getText().length()-1);
                    backSpace = strBSpace.toString();
                    jTextField.setText(backSpace);
                }
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalc");
        frame.setMinimumSize(new Dimension(400, 500));
        frame.setContentPane(new MyCalc().MyCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
