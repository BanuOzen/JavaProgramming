package day43_Abstraction.car.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

       //Person person = new Person("Josh", 35, 'M');

      //  Employee employee = new Employee("Ali",30,"SDET",145000);

        Tester tester = new Tester("Ali", 30, 'M', 42,"SDET",145000);
        Developer developer = new Developer("Alex", 28, 'M',32,"Web Developer",110000);
        Teacher teacher =new Teacher("Angel",28,'F', 22,"English Teacher",130000);
        Driver driver = new Driver("John", 34, 'M', 42, "Lyft Driver", 125000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("=============================");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("=======================================");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        System.out.println("========================================");

        driver.work();
        driver.sleep();
        driver.eat();





    }
}
