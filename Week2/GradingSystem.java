import java.util.Scanner;

public class GradingSystem{

    public static String evaluatemarks(int marks){
        if(marks>100 || marks<0){
            return "Invalid";
        }
        else if(marks>=80){
            return "Distinction";
        }
        else if(marks>=70){
            return "Merit";
        }
        else if(marks>=50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=input.nextInt();
        
        System.out.println(evaluatemarks(marks));
        input.close();
    }
}