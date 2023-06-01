import static java.lang.System.out;
import java.util.*;
public class MultiDimensionalArrays{
    private Integer[][] age;
    public MultiDimensionalArrays(){
        age=new Integer[3][2];
    }
    private void initElements(){
        Scanner read=new Scanner(System.in);  
        out.println("Enter Element Values: ");
        for(Integer r=0;r<3;r++){
            for(Integer c=0;c<2;c++){
                out.print("At Index["+r+"]["+c+"]:");
                age[r][c]=read.nextInt();
            }
        }
    }
    public void showElements(){
        out.println("\nThe Elements Are: ");
        for(Integer[] r:age){
            for(Integer Element:r){
                out.print(Element+"\t");
            }
        }
    }
    public static void main(String[] args){
        MultiDimensionalArrays cl=new MultiDimensionalArrays();
        cl.initElements();
        cl.showElements();
    }
}