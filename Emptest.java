package day2;

public class Emptest {
    public static void main(String[] args) {


        // Create a new Employee object
        Emp Emp = new Emp("Majed", 50000, 2018);

        // Access the employee's information
        System.out.println("Employee Name: " +Emp.getName());
        System.out.println("Salary: $" + Emp.getSalary() + " per month");
        System.out.println("Hire Year: " + Emp.getHireYear());
        System.out.println("Annual Salary: $" + Emp.getAnnualSalary());
        System.out.println("Service Period: " + Emp.getServicePeriod() + " years");
    }
}