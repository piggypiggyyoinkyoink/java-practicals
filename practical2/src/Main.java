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
class BankAccount{
    static int totalAccounts = 0;
    private int accountNumber;
    private double balance;
    public BankAccount(double balance){
        if (balance < 0){
            balance = 0;
        }
        this.balance = balance;
        totalAccounts++;
        this.accountNumber = totalAccounts;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if (amount > this.balance){
            return;
        } else{
            this.balance -= amount;
        }
    }
    public void displayInfo(){
        System.out.println("Account number: "+this.accountNumber+", Balance: £"+this.balance);
    }
    public static void displayTotalAccounts(){
        System.out.println("Total number of accounts: "+totalAccounts);
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

        // Exercise 2
        BankAccount rich = new BankAccount(999999);
        BankAccount broke = new BankAccount(0.01);
        rich.deposit(1000);
        broke.withdraw(5);
        rich.displayInfo();
        broke.displayInfo();
        BankAccount.displayTotalAccounts();
    }
}