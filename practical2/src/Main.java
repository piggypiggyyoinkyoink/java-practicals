class Employee{
    private String name;
    private double salary;
    private static String company;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public static void setCompanyName(String newCompanyName){
        company = newCompanyName;
    }
    public void displayInfo(){
        System.out.println("Name: "+this.name+", Salary: £"+this.salary+", Company: "+company);
    }
}

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Employee joseph = new Employee("Joseph", 1.99);
        Employee.setCompanyName("Morons, Incorporated");
        Employee obama = new Employee("Obama", 10000000);
        joseph.displayInfo();
        obama.displayInfo();
    }
}