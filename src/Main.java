import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class Main {
    public static boolean isLeap(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String installSystem(int os, int yearProd) {
        int currentYear = LocalDate.now().getYear();
        String msg = "Установите %sверсию приложения для %s по ссылке";
        String osName = os == 0 ? "iOS" : "Android";
        String version = yearProd >= 2015 ? "" : "облегченную ";
        return String.format(msg, version, osName);


    }

    public static int countDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days++;
        } else if (deliveryDistance <= 60) {
            days += 2;
        } else if (deliveryDistance <= 100) {
            days += 3;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2012;
        System.out.println(isLeap(year));

        System.out.println("Задание 2");
        //       installSystem(1, 2023);
        System.out.println(installSystem(0, 2023));
        System.out.println("Задание 3");
        System.out.println(countDays(95));


    }
}


