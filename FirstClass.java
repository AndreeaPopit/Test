package Test;

/**
 * Created by Andreea on 25.10.2014.
 *
 * Print salary based on pay and hours worked
 *
 */
public class FirstClass {
    private static void pay(int WorkedHours, int Overtime, double MinimWage, double Wage, int MaxWork){
        if (Wage < MinimWage || (WorkedHours+Overtime) > MaxWork){
            System.out.println("Your boss must be sued!");
        }
        else{
            double salary ;
            salary = Wage*WorkedHours + (1.5*Wage)*Overtime;
            System.out.println("Your salary is " + salary);
        }
    }
    public static void main(String[] arguments){
        pay(20,10,8.0,10.0,60);
    }
}
