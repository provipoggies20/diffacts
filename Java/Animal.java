import static java.lang.System.out;
public class Animal{
    public String name;
    public Animal(){
        name="";
    }
    public void eat(){
        out.println("I Can Eat...");
    }
    public void sleep(){
        out.println("I Can Sleep...");
    }
    public String getName(){
        return name;
    }
    public void printName(){
        out.println("My Name Is: "+getName());
    }
}