import javax.swing.JOptionPane;
public class MessageDialogBox
{
 private int num1;
 private int num2;
 public MessageDialogBox()
 {
     num1=0;
     num2=0;
 }
 public void computeSum(int n1, int n2)
 {
     num1=n1;
     num2=n2;
     int sum = num1+num2;
     JOptionPane.showMessageDialog(null, "The sum of two integer number is: " + sum, "Adding Two Number", JOptionPane.WARNING_MESSAGE);
 }
 public static void main(String [] args)
 {
     MessageDialogBox box = new MessageDialogBox();
     box.computeSum(10,9);
 }
}
