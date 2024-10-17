public class Employee {

    String fullName;
    int age;
    double salary;
    int experience;


    public void checkAge() {
        if (this.age < 18) {
            System.out.println(fullName + " иштөөгө жашы жете элек.");
        } else {
            System.out.println(fullName + " иштөөгө жарактуу.");
        }
    }


    public double calculateThreeMonthSalary() {
        return this.salary * 3;
    }


    public static void printExperiencedEmployees(Employee[] employees) {
        System.out.println("5 жылдан ашык тажрыйбасы бар жумушчулар:");
        for (Employee employee : employees) {
            if (employee.experience > 5) {
                System.out.println(employee.fullName + " - тажрыйба: " + employee.experience + " жыл");
            }
        }
    }


    @Override
    public String toString() {
        return "Аты-жөнү: " + fullName + ", Жашы: " + age + ", Эмгек акысы: " + salary + ", Иш тажрыйбасы: " + experience + " жыл";
    }


}
