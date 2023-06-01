import java.util.*;
import static java.lang.System.out;
public class Act4{
    public String name, year;
    public int midgrade,tengrade,value;
    public double fingrade;
    public Act4(){
        name="";
        year="";
    }
    public void setName(){
        Scanner read=new Scanner(System.in);
        out.print("Enter Your Name: ");
        name=read.nextLine();
        Scanner read1=new Scanner(System.in);
        out.print("Enter Your Year and Course: ");
        year=read1.nextLine();
    }
    public int setMGrade(){
        Scanner read=new Scanner(System.in);
        out.print("Enter Midterm Grade: ");
        midgrade=read.nextInt();
        return midgrade;
    }
    public int setTGrade(){
        Scanner read=new Scanner(System.in);
        out.print("Enter Final Tentative Grade: ");
        tengrade=read.nextInt();
        return tengrade;
    }
    public int computeFGrade(){
        double tenmidgrade, tenfingrade;
        tenmidgrade=midgrade*0.4;
        tenfingrade=tengrade*0.6;
        fingrade=tenmidgrade+tenfingrade;
        value=(int)fingrade;
        return value;
    }
    public void displayGrade(){
        out.println("Your Final Grade is"+ value);
        if(value>=90&&value<=98) out.println("Remarks: A");
        else if(value>=85&&value<=89) out.println("Remarks: B");
        else if(value>=80&&value<=84) out.println("Remarks: C");
        else if(value>=75&&value<=79) out.println("Remarks: D");
        else out.println("Remarks: Failed");
    }
    public static void main(String[] args)
    {
        Act4 scs=new Act4();
        scs.setName();
        scs.setMGrade();
        scs.setTGrade();
        scs.computeFGrade();
        scs.displayGrade();
    }
}