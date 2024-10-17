
public class Main {
    public static void main(String[] args) {



        //Task 1. Employee OOP

        Employee[] employees = new Employee[10];


        employees[0] = new Employee();
        employees[0].fullName = "Амина";
        employees[0].age = 17;
        employees[0].salary = 30000;
        employees[0].experience = 2;

        employees[1] = new Employee();
        employees[1].fullName = "Алина";
        employees[1].age = 25;
        employees[1].salary = 50000;
        employees[1].experience = 6;

        employees[2] = new Employee();
        employees[2].fullName = "Ажара";
        employees[2].age = 30;
        employees[2].salary = 60000;
        employees[2].experience = 10;

        employees[3] = new Employee();
        employees[3].fullName = "Данияр";
        employees[3].age = 22;
        employees[3].salary = 40000;
        employees[3].experience = 3;

        employees[4] = new Employee();
        employees[4].fullName = "Самир";
        employees[4].age = 18;
        employees[4].salary = 35000;
        employees[4].experience = 1;

        employees[5] = new Employee();
        employees[5].fullName = "Даир";
        employees[5].age = 35;
        employees[5].salary = 80000;
        employees[5].experience = 15;

        employees[6] = new Employee();
        employees[6].fullName = "Айла";
        employees[6].age = 13;
        employees[6].salary = 45000;
        employees[6].experience = 5;

        employees[7] = new Employee();
        employees[7].fullName = "Таля";
        employees[7].age = 19;
        employees[7].salary = 32000;
        employees[7].experience = 7;

        employees[8] = new Employee();
        employees[8].fullName = "Рася";
        employees[8].age = 20;
        employees[8].salary = 29000;
        employees[8].experience = 4;

        employees[9] = new Employee();
        employees[9].fullName = "Платон";
        employees[9].age = 40;
        employees[9].salary = 100000;
        employees[9].experience = 20;


        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\nТандоо (1 - жаш текшерүү, 2 - 3 айлык акысын эсептөө, 3 - тажрыйбалуу жумушчуларды көрсөтүү, 4 - чыгуубуз): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Employee employee : employees) {
                        employee.checkAge();
                    }
                    break;
                case 2:
                    for (Employee employee : employees) {
                        System.out.println(employee.fullName + " үчүн 3 айлык акы: " + employee.calculateThreeMonthSalary());
                    }
                    break;
                case 3:
                    Employee.printExperiencedEmployees(employees);
                    break;
                case 4:
                    System.out.println("Программадан чыгуу.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Туура эмес тандадыныз.");
                    break;
            }
        }




    }
}