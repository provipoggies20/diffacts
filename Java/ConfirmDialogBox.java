import javax.swing.*;
public class ConfirmDialogBox
{
   private double side;
   private double area;
   public ConfirmDialogBox()
   {
       side = 0.0;
       area = 0.0;
   }
   public void setSide()
   {
     try
     {
       String str = JOptionPane.showInputDialog("Set value of side: ");
       double side=Double.parseDouble(str);
     }  
     catch(NumberFormatException err)
     {
         JOptionPane.showMessageDialog(null,"Please Input Numners only", "ERROR",JOptionPane.ERROR_MESSAGE);
     }
   }
   public double getSide()
   {
       return side;
   }
   public double computeArea()
   {
       area = side*side;
       return area;
   }
   public void isContinue()
   {
       int choice = JOptionPane.showConfirmDialog(null, "Would you like to continue?");
       if (choice == 0||choice == 2)
       {
           setSide();
           printArea();
       }else if (choice == 1)
       {
           JOptionPane.showMessageDialog(null, "Program Terminated");
       }
   }
   public void printArea()
   {
       JOptionPane.showMessageDialog(null, "The computed Area is: " + computeArea());
       isContinue();
   }
   public static void main(String[] args)
   {
       ConfirmDialogBox box = new ConfirmDialogBox();
       box.setSide();
       box.computeArea();
       box.printArea();
   }
}
