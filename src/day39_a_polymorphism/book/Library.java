package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {



    JavaTextBook book1 = new JavaTextBook("Java Programming");
    book1.size = 10.2;

    EBook book2 = new JavaTextBook("Java P-2");
    book2.open();
        ((JavaTextBook)book2).isFun = false;
        // Casted the reference from the parent
        // EBook to the child reference of JavaTextBook and that allows
        // us to access the fn variable

        Book book3 = new JavaTextBook("Gold tips");

        Downloadable book4 = new JavaTextBook("kdf");


    }}
