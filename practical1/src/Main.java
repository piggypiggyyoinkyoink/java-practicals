class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String get_title(){
        return this.title;
    }
    public String get_author(){
        return this.author;
    }
    public double get_price(){
        return this.price;
    }
}

class Car{
    private String brand;
    private int speed;
    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void accelerate(int increase){
        this.speed += increase;
    }
    public void brake(int decrease){
        this.speed -= decrease;
        if (this.speed < 0){
            this.speed = 0;
        }
    }
    public void displayInfo(){
        System.out.println("Brand: "+this.brand+", Speed: "+this.speed);

    }
}
class Student{
    private String name;
    private int age;
    private double grade;
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }
    public void displayInfo(){
        System.out.println("Name: "+this.name+", Age: "+this.age+", Grade: "+this.grade);
    }
}

class BankAccount{
    private String name;
    private double balance;
    public BankAccount(String name, double balance){
        if (balance < 0){
            balance = 0;
        }
        this.balance = balance;
        this.name = name;
    }
    public BankAccount(String name){
        this.name = name;
        this.balance = 0.0;
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
    public double getBalance(){
        return this.balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Book book1 = new Book("Example Title", "Jonathan", 5.99);
        Book book2 = new Book("A shit book", "piggypiggyyoinkyoink", 0.01);
        System.out.println("Book 1:" + book1.get_title()+ " " + book1.get_author() + " " + book1.get_price());
        System.out.println("Book 2:" + book2.get_title()+ " " + book2.get_author() + " " + book2.get_price());
        // Exercise 2
        Car vroom_vroom = new Car("Nissan Micra", 5);
        vroom_vroom.accelerate(2);
        vroom_vroom.brake(6);
        vroom_vroom.displayInfo();
        // Exercise 3
        Student reginald = new Student("Reginald", 19, 67);
        Student bamfred = new Student("Bamfred", 21);
        reginald.displayInfo();
        bamfred.displayInfo();
        // bonus
        BankAccount money = new BankAccount("jonathan", 500);
        money.deposit(67);
        money.withdraw(100);
        money.withdraw(1000);
        double balance = money.getBalance();
        System.out.println("Current Balance: £"+ balance);
    }
}