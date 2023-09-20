import java.util.Scanner;
                        //Task 2: Student Grade Calculator
public class GradeCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your fullname:");
        String userInput= sc.nextLine();

        System.out.println("Enter your marks(out of 100)->");
        System.out.print("English:");
        float e=sc.nextFloat();
        System.out.print("Math:");
        float m=sc.nextFloat();
        System.out.print("Science:");
        float s=sc.nextFloat();
        System.out.print("History:");
        float h=sc.nextFloat();
        System.out.print("Geography:");
        float g=sc.nextFloat();
        //Calculation
        float total=(e+m+s+h+g);
        float average=total/5;
        //Display
        System.out.println();
        System.out.println("Your marksheet is ready...");
        System.out.println("Total marks(out of 500):"+total);
        System.out.println("Average Percentage: "+average);
        //Grade Calculation
        if(average>=90&& average<=100){
            System.out.println("Grade:A");
        }else if(average>=81 ){
            System.out.println("Grade:B");
        }else if(average>=71 ){
            System.out.println("Grade:C");
        }else if(average>=51 ){
            System.out.println("Grade:D");
        }else{
            System.out.println("Grade:E\n Need to study more.");
        }
        System.out.println();
        System.out.println("-----------------------------Thank You-----------------------------");
    }
}
