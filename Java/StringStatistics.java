import java.util.*;
import static java.lang.System.out;
import java.lang.*;
public class StringStatistics{
    private String elm;
    private double letter;
    private Integer lett, ws, dg, pc;
    private Integer cha;
    private double l,w,d,p;
    public StringStatistics(){
        elm=" ";
        letter=0.0;
        lett=0;
        ws=0;
        dg=0;
        pc=0;
        cha=0;
    }
    public void setElements(){
        Scanner read=new Scanner(System.in);
        out.print("Enter Any String Or Words:\n");
        elm=read.nextLine();
    }
    public void total(){
       cha=elm.length();
       out.println("------------------------------------------------");
       out.println("Total Number Of Characters in String: "+cha);
       out.println("\n");
    }
    public int getTotal(){
        return cha;
    }
    public void oa(){
        Integer x=0;
        out.println("CATEGORY\tHOW MANY?\t% OF FILE");
        out.println("------------------------------------------------");
        while(x<elm.length())
        {
            Character letter=elm.charAt(x);
            if(Character.isLetter(letter)){
                lett++;
                l=lett;
            }
            if(Character.isDigit(letter)){
                dg++;
                d=dg;
            }
            if(Character.isWhitespace(letter)){
                ws++;
                w=ws;
            }
            if(elm.charAt(x)=='!'||elm.charAt(x)==','||elm.charAt(x)=='.'||elm.charAt(x)=='('||elm.charAt(x)==')'||elm.charAt(x)==';'||elm.charAt(x)==':'||elm.charAt(x)=='/'||elm.charAt(x)=='?'||elm.charAt(x)=='-'||elm.charAt(x)=='{'||elm.charAt(x)=='}'||elm.charAt(x)=='@'||elm.charAt(x)=='#'||elm.charAt(x)=='$'||elm.charAt(x)=='%'||elm.charAt(x)=='^'||elm.charAt(x)=='&'||elm.charAt(x)=='*'||elm.charAt(x)=='['||elm.charAt(x)==']'||elm.charAt(x)=='_'||elm.charAt(x)=='+'){
                pc++;
                p=pc;
            }
             x++;
        }
    }
    public void displayAll(){
        double c1=100*l/cha, c2=100*w/cha, c3=100*d/cha, c4=100*p/cha, fu=c1+c2+c3+c4;
        out.print("Letters:\t");
        out.printf("%d \t \t %.4f",lett, c1);
        out.print("%\nWhiteSpace:\t");
        out.printf("%d \t \t %.4f",ws, c2);
        out.print("%\nDigits:\t\t");
        out.printf("%d \t \t %.4f",dg, c3);
        out.print("%\nPunctations:\t");
        out.printf("%d \t \t %.4f",pc, c4);
        out.print("%\n------------------------------------------------");
        out.print("\nTOTAL:\t\t\t\t");
        out.print(" "+(int)fu);
        out.print("%");
    }
}