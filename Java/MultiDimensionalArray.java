import java.util.*;
import static java.lang.System.out;
public class MultiDimensionalArray{
    public static void main(String[] args){
        Integer[][]a={{1,2,3},
                     {4,5,6,9},
                     {7}};
        out.println("Length Of Row 1: "+a[0].length);
        out.println("Length Of Row 2: "+a[1].length);
        out.println("Length Of Row 3: "+a[2].length);
    }
}