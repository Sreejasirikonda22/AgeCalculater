
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculater{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();

        System.out.println("Your age is: " + age);
    }
}