import java.util.Scanner;
public class AverageCalculator
{   private String name;
    private double q1,q2,q3,q4,q5;
    private double p1,p2,p3;
    double total,total1;
    double percent,percent1;
   public AverageCalculator()
    {
       name ="";
    }
   private void setName()
    {
        Scanner read = new Scanner (System.in);
        System.out.print("Enter Student Name: ");
        name=read.nextLine();
    }
   private String getName()
    {
        return name;
    }
   private void setQuiz()
    { 
       Scanner read = new Scanner(System.in);
       
       System.out.print("Enter 5 Quiz Raw Scores (Maximum = 30):\n ");
       System.out.print("Quiz #1: ");
       q1=read.nextInt();
       System.out.print(" Quiz #2: ");
       q2=read.nextInt();
       System.out.print(" Quiz #3: ");
       q3=read.nextInt();
       System.out.print(" Quiz #4: ");
       q4=read.nextInt();
       System.out.print(" Quiz #5: ");
       q5=read.nextInt();
       total=((q1+q2+q3+q4+q5)/150)*100;
       System.out.print("Average: "+total);
    }
   private double getQuiz()
    {
     return total;
    }
   private void computeQuiz()
    {
     percent=getQuiz()*0.40;
     System.out.print("\nPercent: "+percent+"%" );
    }
   private void setExamScores()
    {
      Scanner read = new Scanner(System.in);
      System.out.println("\n\nEnter 3 Exam Scores (Maximum = 100): ");
      System.out.print(" First Periodical Test Scores: ");
      p1=read.nextInt();
      System.out.print(" Second Periodical Test Scores: ");
      p2=read.nextInt();
      System.out.print(" Final Periodical Test Scores: ");
      p3=read.nextInt();
      total1= (p1+p2+p3)/3; 
      System.out.print("Average: "+total1);      
    }
   private void computeExam()
    {
     percent1=getExam()*0.60;
     System.out.print("\nPercent: "+percent1+"%" );
    }
   private double getExam()
    {
    return total1;
    }
   private void computePercent()
    {
      double Fgrade = getPercent1()+getPercent();
      System.out.print("\nFinal Grade: "+Fgrade+ "%");
    }
   private double getPercent1()
    {
       return percent1;
    }
   private double getPercent()
    {
       return percent;
    }
   private void displayName()
    {
       System.out.print("\n\n******************************************\n");
       System.out.print("Name: "+ name);
    }
   public void computeRemarks()
    {
        String grade = "";
        double Fgrade=getPercent1()+getPercent();
        grade=(Fgrade>75)?"Passed":" Failed ";
        System.out.print("\nRemarks: "+grade);
        System.out.print("\n******************************************");
    }
   public static void main(String[] args)
    {   AverageCalculator compute= new AverageCalculator();
        compute.setName();
        compute.setQuiz();
        compute.computeQuiz();
        compute.setExamScores();
        compute.computeExam();
        compute.displayName();
        compute.computePercent();
        compute.computeRemarks();
    }
}
