import javax.swing.*;
public class TemperatureConverter
 {
    private double num;
    private double celsius;
    private double fahrenheit;
    private int choice;
    
public TemperatureConverter()
    {
     num = 0.0;
     celsius = 0.0;
     fahrenheit = 0.0;
     choice = 0;
    }
public void title()
    {
  try 
    {
        JOptionPane.showMessageDialog(null,"This is a Temperature Converter Program ");
    } 
  catch(NumberFormatException err)
    {
       JOptionPane.showMessageDialog(null, "Please input numbers only" , "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }
 public double getInput()
   {
       return num; 
   } 
 public double getFahrenheit()
   {
       return num; 
   }
 public double getCelsius()
   {
       return num; 
   } 
 public double computeCelsius()
   {
       celsius = (getFahrenheit() -32) * 5/9;
       return celsius;
   }
 public double computeFahrenheit()
   {
       fahrenheit = (getCelsius() * 9/5) + 32;
       return fahrenheit;
   }    
 public void setInputFaren()
   {
       String XxX = JOptionPane.showInputDialog("Please input the fahrenheit degree to convert. ");
       num = Double.parseDouble(XxX);
   }  
 public void setInputCels()
   {
       String YyY = JOptionPane.showInputDialog("Please input the celsius degree to convert. ");
       num = Double.parseDouble(YyY);
   } 
  public void setOption()
   {
   try 
    {
      String str =JOptionPane.showInputDialog("Please select an Option to do the Conversion.\n Press 1: Celsius to Fahrenheit\n Press 2: Fahrenhiet to Celsius \n Press any number to quit.");
      choice = Integer.parseInt(str);
       
      if (choice == 1)
       {
          setInputCels();
          choice = Integer.parseInt(str);
          computeCelsius(); 
          JOptionPane.showMessageDialog(null, "The celsius degree: " + getCelsius()+ "\nThe equivalent Fahrenheit degree is: " + computeFahrenheit());
       }
      else if (choice == 2)
       {
           setInputFaren();
           computeFahrenheit(); 
           JOptionPane.showMessageDialog(null, "The Fahrenheit degree:" +getFahrenheit() + "\nThe equivalent Celsius degree is: " + computeCelsius());
       }
      else
      {
          JOptionPane.showMessageDialog(null, "Program Terminated");
      }
    }
      catch(NumberFormatException err)
      {
          JOptionPane.showMessageDialog(null, "Please input numbers only" , "Error", JOptionPane.ERROR_MESSAGE);
          setOption();
      } 
 }
 public void isCon()
  {
    setOption();
  }
 public static void main (String[] args)
  {
    TemperatureConverter view = new TemperatureConverter();
    view.title();
    view.setOption();
  }
}
