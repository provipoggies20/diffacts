package Act_3;

import java.util.Scanner;
public class TotalDiscount
{   private String name, year;
    private int total;
    private double discount, total_discount;
   public TotalDiscount()
    {
       name="";
       year="";
    }
   private void setName()
    {
        Scanner read = new Scanner (System.in);
        System.out.print("Enter Your Name: ");
        name=read.nextLine();
        System.out.print("Enter Your Year and Course: ");
        year=read.nextLine();
    }
   private int setAmount()
   {
       Scanner read=new Scanner(System.in);
       System.out.print("The Total Amount Purchase: ");
       total=read.nextInt();
       return total;
   }
   private double setDiscount()
   {
       if(total>=10000)
       {
           discount=total*0.05;
       }
       else
       {
           discount=total*0.02;
       }
       System.out.println("The Discount: "+discount);
       return discount;
   }
   private double setTotal()
   {
       total_discount=total-discount;
       System.out.print("The Total Amount to be Paid: "+total_discount);
       return total_discount;
   }
   public static void main(String[] args)
    {   TotalDiscount td= new TotalDiscount();
        td.setName();
        td.setAmount();
        td.setDiscount();
        td.setTotal();
    }
}
