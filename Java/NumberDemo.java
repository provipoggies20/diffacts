import java.lang.*;
import static java.lang.System.out;
public class NumberDemo{
    public void computeSinCosTan(){
        int value=1;
        while(value<=10){
            out.println(value+"\t"+Math.sin(value)+"\t"+Math.cos(value)+"\t"+Math.tan(value));;
            value++;
        }
    }
    public void printHead(){
        out.println("DECIMAL\t\tSINE\t\t\tCOSINE\t\t\tTANGENT");
        out.println("----------------------------------------------------------------------------------");
    }
}