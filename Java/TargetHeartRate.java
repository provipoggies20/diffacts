import java.util.Scanner;
public class TargetHeartRate
{
  private String name;
  private int age;
  private double upperlimit;
  private double lowerlimit;
  private double ages;
  public TargetHeartRate()
  {
      String  name="";
      int age = 0;
      int upperlimit = 0;
      int lowerlimit = 0;
      int ages = 0;
  }
  public void displayTitle()
  {
      System.out.print("***********************************************");
      System.out.print("\n**************TARGET HEART RATE****************");
      System.out.print("\n***********************************************");
  }
  public void setName()
  {
      Scanner read=new Scanner(System.in);
      System.out.print("\nPlease enter your name: ");
      name = read.nextLine();
  }
  public String getName()
  {
      return name;
  }
  public void setAge()
  {
     Scanner read=new Scanner(System.in);
     System.out.print("Enter your Age: ");
     age=read.nextInt();
  }
  public int getAge()
  {
      return age;
  }
  public void upperLimit()
  {
      ages=220-age;
      upperlimit=ages*0.85;
      System.out.print("\nYour upper limit of your target heart rate: "+upperlimit);
  }
  public double getUpperLimit()
  {
      return upperlimit;
  }
  public void lowerLimit()
  {
      ages=220-age;
      lowerlimit=ages*0.65;
      System.out.print("\nYour lower limit of your target heart rate: "+lowerlimit);
  }
  public double getLowerLimit()
  {
      return lowerlimit;
  }
  public void displayRate()
  {
      System.out.print("\n"+getName()+", your Target Heart Rate is "+getLowerLimit());
      System.out.print(" to "+getUpperLimit());
      System.out.print(" beats per minute.");
  }
  public static void main(String[] args)
  {
      TargetHeartRate heartRate=new TargetHeartRate();
      Scanner read=new Scanner(System.in);
      heartRate.displayTitle();
      heartRate.setName();
      heartRate.setAge();
      heartRate.upperLimit();
      heartRate.lowerLimit();
      heartRate.displayRate();
  }
}
