import javax.swing.JOptionPane;

public class InputValidation {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("please enter a number in the range of 1 through 100");
        int number=Integer.parseInt(input);
        while(number<1 || number>100)
        {
            JOptionPane.showMessageDialog(null, "Number is not valid");
            input=JOptionPane.showInputDialog(
                "please enter again it is not valid");
            number=Integer.parseInt(input);

        }
        JOptionPane.showMessageDialog(null, "You enter a correct value "); }     
}