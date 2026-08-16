import java.util.Scanner;

public class LeapYear {

public static boolean leapyear(int year){
    if(year%4==0){
        return true;
    }
    else{
        return false;
    }
}    

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year=input.nextInt();
    if(leapyear(year)){
        System.out.println(year +" is a leap year !");
    }
    else{
        System.out.println(year + " is NOT a leap year !");
    }
    input.close();

}
}
