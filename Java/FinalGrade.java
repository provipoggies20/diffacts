import javax.swing.*;
import java.util.*;
public class FinalGrade
{
    private int first;
    private int second;
    private int third;
    private int fourth;
    private double average;
    public FinalGrade()
    {
        first=0;
        second=0;
        third=0;
        fourth=0;
        average=0.0;
    }
    public void displayIn()
    {
        JOptionPane.showMessageDialog(null,"This Is A Simple Grader System Program!");
    }
    public void setFirst()
    {
        try
        {
            String str=JOptionPane.showInputDialog("Enter First Examination Score: ");
            first=Integer.parseInt(str);
        }
        catch(NumberFormatException c)
        {
            JOptionPane.showMessageDialog(null,"Input Numbers Only!");

        }
    }
    public int getFirst()
    {
        return first;
    }
    public int getSecond()
    {
        return second;
    }
    public int getThird()
    {
        return third;
    }
    public int getFourth()
    {
        return fourth;
    }
    public void setSecond()
    {
        try
        {
            String str=JOptionPane.showInputDialog("Enter Second Examination Score: ");
            second=Integer.parseInt(str);
        }
        catch(NumberFormatException c)
        {
            JOptionPane.showMessageDialog(null,"Input Numbers Only!");

        } 
    }
    public void setThird()
    {
       try
        {
            String str=JOptionPane.showInputDialog("Enter Third Examination Score: ");
            third=Integer.parseInt(str);
        }
        catch(NumberFormatException c)
        {
            JOptionPane.showMessageDialog(null,"Input Numbers Only!");

        } 
    }
    public void setFourth()
    {
        try
        {
            String str=JOptionPane.showInputDialog("Enter Fourth Examination Score: ");
            fourth=Integer.parseInt(str);
        }
        catch(NumberFormatException c)
        {
            JOptionPane.showMessageDialog(null,"Input Numbers Only!");

        } 
    }
    public void computeAverage()
    {
        average=first+second+third+fourth;
        average/=4;
    }
    public double getAverage()
    {
        return average;
    }
    public void remarks()
    {
        String status=" ";
        status=average>=75?"Passed":"Failed";
        JOptionPane.showMessageDialog(null,"The Average Of The Student is "+average+"\nRemarks  "+status);
    }
    public static void main(String[] args)
    {
        FinalGrade grade=new FinalGrade();
        grade.displayIn();
        grade.setFirst();
        grade.setSecond();
        grade.setThird();
        grade.setFourth();
        grade.computeAverage();
        grade.remarks();
    }
}