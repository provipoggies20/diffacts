import java.util.*;
public class BMI
{
    private int weight;
    private double pounds;
    private int feet;
    private int inch;
    private int height;
    private double bmi;
    public BMI()
    {
         int weight=0;
         double pounds=0.0;
         int feet=0;
         int inches=0;
         int height=0;
         double bmi=0.0;
    }
    public void displayH()
    {
        System.out.print("***************************************************************\n");
        System.out.print("************************BMI CALCULATOR*************************\n");
        System.out.print("***************************************************************\n");
    }
    public void setWeight()
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter Weight In Kilograms (kg): ");
        weight=read.nextInt();
    }
    public int getWeight()
    {
        return weight;
    }
    public void computeWeightPounds()
    {
        pounds=weight*2.0463;
    }
    public double getWeightToPounds()
    {
        return pounds;
    }
    public void displayPounds()
    {
        System.out.print("Computed Weight In Pounds (lbs): "+pounds);
    }
    public void setFeet()
    {
        System.out.print("\nEnter Height In Feet: ");
        Scanner read=new Scanner(System.in);
        feet=read.nextInt();
    }
    public int getFeet()
    {
        return feet;
    }
    public void setInch()
    {
        System.out.print("Enter Height In Inches: ");
        Scanner read=new Scanner(System.in);
        inch=read.nextInt();
    }
    public int getInch()
    {
        return inch;
    }
    public void computeHeightInches()
    {
        height=feet*12;
        height+=inch;
    }
    public int getHeight()
    {
        return height;
    }
    public void displayHeight()
    {
        System.out.print("Computed Height In Inches: "+height);
    }
    public void computeBMI()
    {
        double allweight=0.0;
        double allheight=0.0;
        allweight=pounds*703;
        allheight=height*height;
        bmi=allweight/allheight;
    }   
    public double getBMI()
    {
        return bmi;
    }
    public void displayBMI()
    {
        System.out.print("\nComputed BMI: "+bmi);
    }
    public static void main(String[] args)
    {
        BMI bmi=new BMI();
        bmi.displayH();
        bmi.setWeight();
        bmi.computeWeightPounds();
        bmi.displayPounds();
        bmi.setFeet();
        bmi.setInch();
        bmi.computeHeightInches();
        bmi.displayHeight();
        bmi.computeBMI();
        bmi.displayBMI();
    }
}
    
    