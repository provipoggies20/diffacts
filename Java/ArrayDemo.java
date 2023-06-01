import static java.lang.System.out;
import java.util.*;
public class ArrayDemo{
    Integer[] age={12,4,5,2,5};
    public void manualArray(){
        out.println(age[0]);
        out.println(age[1]);
        out.println(age[2]);
        out.println(age[3]);        
        out.println(age[4]);
    }
    public void loopArray(){
        Integer c=0;
        while(c<5){
            out.println(age[c]);
            c++;
        }
    }
    public void enhancedArray(){
        for(int a:age){
            out.println(a);
        }
    }
    public void inputArray(){
        Scanner read=new Scanner(System.in);
        Integer[] ages=new Integer[5];
        for(Integer i=0;i<ages.length;i++){
            out.print("Enter Value At Index "+i+":");
            Integer element=read.nextInt();
            ages[i]=element;
        }
        out.println("\n\n");
        out.print("Size Of The Array: "+ages.length);
        out.println("The Elements Of The Array:");
          for(int b:ages){
            out.println(b);
        }
    }
}