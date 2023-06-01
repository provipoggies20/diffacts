import static java.lang.System.out;
public class MultiplicationTable{
    public void Ultimate()
    {
    out.format("   *  ");
    for(int c=0;c<11;c++){
        out.format("%4d",c);
    }
    out.println();
    out.println("--------------------------------------------------");
    for(int c=0;c<11;c++){
    out.format("%4d |",c);
    for(int l=0;l<11;l++){
        out.format("%4d",c*l);
    }
    out.println();
    }
    }
    public static void main(String[] args){
        MultiplicationTable ult = new MultiplicationTable();
        ult.Ultimate();
    }
}
