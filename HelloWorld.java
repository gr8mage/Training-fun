import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        /*
        double value;
        double dVal;
        String operation;
        try {
            System.out.println("Enter value 1 (double):");
            value = myScanner.nextDouble();
            System.out.println("Enter value 2 (double):");
            dVal = myScanner.nextDouble();            
            System.out.println("Enter operation (1 = add, 2 = subtract, 3 = multiply, 4 =  divide):");
            operation = myScanner.next();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("bad inputs");
            value = 0.0;
            dVal = 0.0;
            operation = "no";
        }
        
        switch(operation.charAt(0)) {
            case '+': 
                System.out.println("Addition: " + value + " + " + dVal + " = " + (value + dVal)); 
                break;
            case '-': 
                System.out.println("Subtract: " + value + " - " + dVal + " = " + (value - dVal)); 
                break;
            case '*': 
                System.out.println("Multiply: " + value + " * " + dVal + " = " + (value * dVal)); 
                break;
            case '/': 
                System.out.println("Divide =  " + value + " / " + dVal + " = " + (value / dVal)); 
                break;
            default: 
                System.out.println("Unknown Operation: " + operation); 
                break; 
        }
        */

        System.out.println("What is your date of birth (form: YYYY-MM-dd)?");
        String bday = myScanner.next();

        LocalDate birth_date = LocalDate.parse(bday);

        LocalDate currentDate = LocalDate.now(); // Get the current date

        // need the current date
        int current_month = currentDate.getMonthValue();
        int current_year = currentDate.getYear();
        int current_day = currentDate.getDayOfMonth();

        System.out.println("It is " + current_month + "/" + current_day + "/" + current_year);
        System.out.println("You were born: " + birth_date.getMonthValue() + "/" + birth_date.getDayOfMonth() + "/" + birth_date.getYear());

        double your_age = (current_year - birth_date.getYear()) + (currentDate.getMonthValue() - birth_date.getMonthValue()) / 12.0 + (currentDate.getDayOfMonth() - birth_date.getDayOfMonth())/30.0;

        double age = currentDate.compareTo(birth_date);

        System.out.println("You are " + your_age + " years old! or " + age);
    }
}
