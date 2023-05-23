//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary. 

class Employee {
  private String name;
  private String jobTitle;
  private double salary;

  public Employee(String name, String jobTitle, double salary) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  public void raiseSalary(double percentage) {
    salary = salary + (salary * percentage / 100);
  }

  public void printEmployeeDetails() {
    System.out.println("Name: " + name);
    System.out.println("Job Title: " + jobTitle);
    System.out.println("Salary: " + salary);
  }
}

public class Q_6_INFT221101056 {
  public static void main(String[] args) {

    Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
    Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
    System.out.println("\nEmployee Details:");
    employee1.printEmployeeDetails();
    employee2.printEmployeeDetails();

    employee1.raiseSalary(8);
    employee2.raiseSalary(12);

    System.out.println("\nAfter raising salary:");
    System.out.println("\n8% for 'Franziska Waltraud':");
    employee1.printEmployeeDetails();
    System.out.println("\n12% for 'Hubertus Andrea':");
    employee2.printEmployeeDetails();
  }
}