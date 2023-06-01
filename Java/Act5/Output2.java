import java.util.*;
public class Output2
{
    public static void main(String[] args)
    {
        int whitespace=7; 
        int x=1;
        while(x<=7){ 
            int y=1;
            while(y<=whitespace){
    		System.out.print(" "); 
                y++;
            } 
            whitespace--;
            int z=1;
            while(z<=x){ 
                System.out.print("* ");
                z++;
            } 
            System.out.println(); 
            x++;
        } 
        whitespace=2; 
        int a=1;
        while(a<=7-1){ 
            int b=1;
            while(b<=whitespace){ 
    		System.out.print(" "); 
    		b++;
            } 
            whitespace++;
            int c=1;
            while(c<=7-a){ 
            System.out.print("* ");
            c++;
            } 
            System.out.println(); 
            a++;
        } 
    } 
}
