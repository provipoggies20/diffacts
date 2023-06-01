import javax.swing.*;
public class InputDialogBox
{
   private String name;
   public InputDialogBox()
   {
      name = ""; 
   }
   public void setName()
   {
       name = JOptionPane.showInputDialog("Enter any Name: ");
   }
   public String getName()
   {
       return name;
   }
   public void printName()
   {
       JOptionPane.showMessageDialog(null, "Your name is:  " + getName());
   }
   public static void main(String[] args)
   {
       InputDialogBox box = new InputDialogBox();
       box.setName();
       box.printName();
   }
}
