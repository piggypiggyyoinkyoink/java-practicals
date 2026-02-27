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

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Book book1 = new Book("Example Title", "Jonathan", 5.99);
        Book book2 = new Book("A shit book", "piggypiggyyoinkyoink", 0.01);
        System.out.println("Book 1:" + book1.get_title()+ " " + book1.get_author() + " " + book1.get_price());
        System.out.println("Book 2:" + book2.get_title()+ " " + book2.get_author() + " " + book2.get_price());
    }
}