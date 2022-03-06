import javax.swing.*;

public class Operation {
    public static String operation(char operator, double total1, double total2, JTextField txtDisplay){
        if(operator=='+'){
            total2=total1+Double.parseDouble(txtDisplay.getText());
        }
        else if(operator=='-'){
            total2=total1-Double.parseDouble(txtDisplay.getText());
        }
        else if(operator=='*'){
            total2=total1*Double.parseDouble(txtDisplay.getText());
        }
        else{
            total2=total1/Double.parseDouble(txtDisplay.getText());
        }
        if(total2 % 1!=0) return Double.toString(total2);
        else {
            int total=(int)total2;
            return Integer.toString(total);
        }

    }
}
