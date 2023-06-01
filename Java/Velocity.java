import java.util.Scanner;
public class Velocity
{
  private double speed;
  private double time;
  private double velocity;
  public Velocity ()
  {
      speed = 0.0;
      time = 0.0;
      velocity = 0.0;
  }
  public void setSpeed()
  {
      Scanner read = new Scanner(System.in);
      System.out.print("Enter value of speed: ");
      speed = read.nextDouble();
  }
  public void setTime()
  {
      Scanner read = new Scanner(System.in);
      System.out.print("Enter value of time: ");
      time = read.nextDouble();
  }
  public double getSpeed()
  {
      return speed;
  }
  public double getTime()
  {
      return time;
  }
  public void computeVelocity()
  {
      velocity = getSpeed()/getTime();
      System.out.print("The computed velocity is: " + velocity); 
  }
}
