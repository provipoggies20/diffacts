import javax.swing.*;
import java.util.*;
import static java.lang.System.out;
public class Calculator
{
    private int key;
    private int firstnum;
    private int secondnum;
    private double res;
    public Calculator()
    {
        key=0;
        firstnum=0;
        secondnum=0;
        res=0.0;
    }
    public void displayKey()
    {
        out.print("SELECT KEY TO PRESS: \n1 = Addition (+)\n2 = Subtraction (-)\n3 = Multiplication (*)\n4 = Division (/)\n\n");
        select();
    }
    public void select()
    {
        try
        {
            Scanner read = new Scanner(System.in);
            out.print("Select Operation: ");
            key=read.nextInt();
        }
        catch(InputMismatchException chi)
        {
            JOptionPane.showMessageDialog(null,"Input Numbers Only","Error",JOptionPane.ERROR_MESSAGE);
        }
        op();
        }
    public int getKey()
    {
        return key;
    }
    public void op()
    {
        if(key==1)
        {
            out.print("\nOperation Selected: Addition");
            setNum();
            addition();
        }
        else if(key==2)
        {
            out.print("\nOperation Selected: Subtraction");
            setNum();
            subtraction();
        }
        else if(key==3)
        {
            out.print("\nOperation Selected: Multiplication");
            setNum();
            multiplication();
        }
        else if(key==4)
        {
            out.print("\nOperation Selected: Division");
            setNum();
            division();
        }
        }
    public void setNum()
    {
        try
        {
            Scanner read=new Scanner(System.in);
            out.print("\nFirst Number: ");
            firstnum=read.nextInt();
        }
        catch(InputMismatchException chi)
        {     
            JOptionPane.showMessageDialog(null,"Invalid Number","Error",JOptionPane.ERROR_MESSAGE);
            setNum();
        }
        try
        {
            Scanner red=new Scanner(System.in);
            out.print("Second Number: ");
            secondnum=red.nextInt();
        }
        catch(InputMismatchException chi)
        {
            JOptionPane.showMessageDialog(null,"Invalid Number","Error",JOptionPane.ERROR_MESSAGE);
            setNum();
        }
    }
    public int getFNum()
    {
        return firstnum;
    }
    public int getSNum()
    {
        return secondnum;
    }
    public void addition()
    {
        res=getFNum()+getSNum();
        result();
    }
    public void subtraction()
    { 
        res=getFNum()-getSNum();
        result();
    }
    public void multiplication()
    {  
        res=getFNum()*getSNum();
        result();
    }
    public void division()
    {
        if(secondnum==0)
        {
           JOptionPane.showMessageDialog(null,"Invalid Second Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
           res=getFNum()/getSNum();
        }
        result();
    }
    public double getResult()
    {
        return res;
    }
    public void result()
    { 
        out.print("Result: "+getResult());
    }        
    public static void main(String[] args)
    {
        Calculator calc=new Calculator();
        calc.displayKey();
    }
}
