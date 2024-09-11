//CGPA CALCULATOR

import java.util.Scanner;
public class CGPA_Calculator {
    
    public static void main(String[] args){
    
    System.out.println("!!Fill all your subject's marks in their respective sections!! ");
    System.out.println();    
    System.out.print("Enter your Mathematics marks out of 100: ");
    Scanner marks1 =  new Scanner(System.in);
    int sub1 = marks1.nextInt();
    System.out.print("Enter your Physics marks out of 100: ");
    Scanner marks2 = new Scanner(System.in);
    int sub2 = marks2.nextInt();
    System.out.print("Enter your Chemistry marks out of 100: ");
    Scanner marks3 = new Scanner(System.in);
    int sub3 = marks3.nextInt();
    System.out.print("Enter your English marks out of 100: ");
    Scanner marks4 =  new Scanner(System.in);
    int sub4 = marks4.nextInt();
    System.out.print("Enter your Optional Subject marks out of 100 (if no optional subject, enter 0): ");
    Scanner marks5 =  new Scanner(System.in);
    int sub5 = marks5.nextInt();
    System.out.print("Enter total number of subjects you've scored above 0: ");
    Scanner subjects = new Scanner(System.in);
    int totalsub = subjects.nextInt();
    double cgpa = ((sub1 + sub2 + sub3 + sub4 + sub5) / (totalsub * 10));
    System.out.println("You've obtained "+ cgpa + " CGPA");

    }
    
}
