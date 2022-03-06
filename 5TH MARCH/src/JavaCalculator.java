import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    public static double total1=0.0;
    public static double total2=0.0;
    private char math_operator;
    private boolean arithmatic=true;
    private JPanel JavaCalculator;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnOne;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JTextField txtDisplay;
    private JButton btnNeg;
    private JRadioButton btnstart;

    public JavaCalculator() {
        btnOne.addActionListener(e -> {
            String btnOneText=txtDisplay.getText()+btnOne.getText();
            txtDisplay.setText(btnOneText);
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText=txtDisplay.getText()+btnOne.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText=txtDisplay.getText()+btnThree.getText();
                txtDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText=txtDisplay.getText()+btnFour.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText=txtDisplay.getText()+btnFive.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText=txtDisplay.getText()+btnSix.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText=txtDisplay.getText()+btnSeven.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText=txtDisplay.getText()+btnEight.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText=txtDisplay.getText()+btnNine.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText=txtDisplay.getText()+btnZero.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if(arithmatic){
                String btnText = btnPlus.getText();
                getOperator(btnText);
                 arithmatic =false;

             }
             else{
                 txtDisplay.setText("Too many pressing");
             }
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(Operation.operation(math_operator,total1,total2,txtDisplay));
                total1 = 0;
                arithmatic=true;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtDisplay.setText("");
                arithmatic=true;
            }
        });
        btnNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().equals("")){
                    txtDisplay.setText("-");
                }else{
                    Double x = -1 * Double.parseDouble(txtDisplay.getText());
                    txtDisplay.setText(Double.toString(x));
                }
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(arithmatic){
                    String btnText = btnMultiply.getText();
                    getOperator(btnText);
                    arithmatic =false;

                }
                else{
                    txtDisplay.setText("Too many pressing");
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(arithmatic){
                    String btnText = btnMinus.getText();
                    getOperator(btnText);
                    arithmatic =false;

                }
                else{
                    txtDisplay.setText("Too many pressing");
                }
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(arithmatic){
                    String btnText = btnDivide.getText();
                    getOperator(btnText);
                    arithmatic =false;

                }
                else{
                    txtDisplay.setText("Too many pressing");
                }
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+btnPoint.getText());
            }
        });
        btnstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnstart.isEnabled()){

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private void getOperator(String butonText){
        math_operator=butonText.charAt(0);
        total1+=Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }
}
