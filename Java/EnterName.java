import java.util.Scanner;
public class EnterName
{
  private String nagan;
  public EnterName()
  {
      nagan = "";
  }
  private void setName(String name)
  {
      nagan = name;
  }
  private String getName()
  {
      return nagan;
  }
  public void displayName()
  {
      System.out.print("Your name is: " + nagan);
  }
  public static void main(String[] args)
   {
       EnterName anyName = new EnterName();
       Scanner read = new Scanner(System.in);
       System.out.print("Enter any name: ");
       String value = read.nextLine();
       anyName.setName(value);
       anyName.displayName();
   }
}
