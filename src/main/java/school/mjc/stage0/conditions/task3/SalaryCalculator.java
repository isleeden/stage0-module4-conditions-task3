package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(0 < salary && salary <= 10000) {
            System.out.println(salary * 0.85);
        } else if (10000 < salary && salary <= 20000) {
            System.out.println(salary * 0.82);
        } else if (salary > 20000) {
            System.out.println(salary * 0.80);
        } else {
            System.out.println("wrong input!");
        }
    }
}
