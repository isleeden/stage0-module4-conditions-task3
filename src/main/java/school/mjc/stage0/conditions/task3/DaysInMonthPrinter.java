package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(1 <= month <= 12) {
            int[] days = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
            System.out.println(days[1 + month]);
        } else {
            System.out.println("wrong number!");
        }
    }
}
