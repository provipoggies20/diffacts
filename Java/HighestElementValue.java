import java.util.*;
import static java.lang.System.out;
public class HighestElementValue{
    public void Array(){
        Scanner read=new Scanner(System.in);
        Integer[] elements=new Integer[10];
        Integer maxi=0;
        for(Integer c=0;c<elements.length;c++){
            out.print("Enter Value For "+c+":");
            Integer element=read.nextInt();
            elements[c]=element;
        }
        out.println("\n\n");
        out.print("Size Of The Array: "+elements.length);
        for(Integer l=0;l<elements.length;l++){
            if(maxi<elements[l]){
                maxi=elements[l];
            }
        }
        out.println("\nMax Element is: "+maxi);
    }
    public static void main(String[] args){
        HighestElementValue elm=new HighestElementValue();
        elm.Array();
    }
}