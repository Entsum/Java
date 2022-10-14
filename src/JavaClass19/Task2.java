package JavaClass19;

public class Task2 {

    /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    public void main(String[] args) {

        Book headOfFirstJava=new Book("headOfFirstJava", "Kathy",12,11235646);
        Book dataStructures=new Book("headOfFirstJava", "Kathy",12);
    }
    class Book {
        String name;
        String author;
        int noOfCh;
        int ISBN;

        public Book(String name, String author, int noOfCh, int ISBN) {
            /*
            this.name = name;
            this.author = author;
            this.noOfCh = noOfCh;
            this.ISBN = ISBN;
            */
            this(name, author, noOfCh);
            this.ISBN=ISBN;

        }

        private Book(String name, String author, int noOfCh) {

            this.name = name;
            this.author = author;
            this.noOfCh = noOfCh;

        }
    }
}
