package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(1 <= month && month <= 12) {
            int[] days = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
            System.out.println(days[month - 1]);
        } else {
            System.out.println("wrong number!");
        }
    }
}
