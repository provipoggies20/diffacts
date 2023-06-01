public class AreaTriangle
{
    private double base;
    private double height;
    private AreaTriangle()
    {
        base = 0;
        height = 0;
    }
    public void setBase(double b)
    {
       base = b;
    }
    public double getBase()
    {
       return base;
    }
    private void setHeight(double h)
    {
         height = h;
    }
    public double getHeight()
    {
        return height;
    }
    private void computeArea()
    {
        double area = (getBase()*getHeight()/2);
        System.out.print("Base:"+base);
        System.out.print("\nHeight:"+height);
        System.out.print("\nThe area of the triangle:"+area);
    }
    public static void main(String []args)
    {
        AreaTriangle triangle = new AreaTriangle();
        triangle.setBase(10.25);
        triangle.setHeight(5.75);
        triangle.computeArea();
    }
}
