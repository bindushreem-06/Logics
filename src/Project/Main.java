package Project;

import java.util.Scanner;
//Abstraction
abstract class EmployeeBase{
    abstract void AddEmployee();
    abstract void ViewEmployee();
    abstract void DeleteEmployee();
    abstract void UpdateEmployee();
}
//Encapsulation
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {return name;}
    public int getId() {return id;}
    public double getSalary() {return salary;}
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display() {
        System.out.printf("%-10d %-20s %-10.2f\n", id, name, salary);
    }
}
//Inheritance,Polymorphism and ExceptionHandling
class EmployeeManager extends EmployeeBase{
    private Employee[] employees = new Employee[5];
    private int count = 0;
    Scanner sc = new Scanner(System.in);
    @Override
    void AddEmployee() {
        try{
            if(count >= employees.length){
                System.out.println("Size is full. Cannot add more employees.");
                return;
            }
            System.out.println("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name: ");
            String name = sc.nextLine();
            System.out.println("Enter the Employee Salary: ");
            double salary = sc.nextDouble();
            employees[count] = new Employee(id, name, salary);
            count++;
            System.out.println("Employee added successfully!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to access outside the limit");
        }

    }
    @Override
    void ViewEmployee() {
        if (count == 0) {
            System.out.println("No employee records found!");
            return;
        }
        System.out.println("\n--- Employee List ---");
        System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Salary");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    @Override
    void DeleteEmployee() {
        if (count == 0) {
            System.out.println("No employees to update!");
            return;
        }
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        boolean found = false;

        try {
            for (int i = 0; i < count; i++) {
                if (employees[i].getId() == id) {
                    for (int j = i; j < count - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    employees[count - 1] = null;
                    count--;
                    found = true;
                    System.out.println("Employee deleted successfully!");
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error while deleting employee: " + e.getMessage());
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
    @Override
    void UpdateEmployee() {
        if (count == 0) {
            System.out.println("No employees to update!");
            return;
        }
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new salary: ");
                double newSalary = sc.nextDouble();

                employees[i].setName(newName);
                employees[i].setSalary(newSalary);
                System.out.println("Employee updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }

    }
}
//Main Method
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeBase manager = new EmployeeManager(); // Polymorphism
        boolean running = true;

        while (running) {
            System.out.println("\n====== EMPLOYEE MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice of number option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.AddEmployee();;
                    break;
                case 2:
                    manager.ViewEmployee();;
                    break;
                case 3:
                    manager.UpdateEmployee();
                    break;
                case 4:
                    manager.DeleteEmployee();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }

    }
}
