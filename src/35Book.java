class Book {
    static int totalNoBooks;

    static {
        totalNoBooks = 0;

    }

    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    {// object init

        totalNoBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unkown", "unkown");

    }

    static int getTotalNoBooks() {
        return totalNoBooks;
    }

    public static void main(String[] args) {
        // Book designOfThings = new Book("1", "the wing of fire", "Author");
        Book designOfTings = new Book("1", "the wing of fire", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoBooks());
        designOfTings.borrowedBook();
        myBook.borrowedBook();
        designOfTings.borrowedBook();
        designOfTings.returnBook();
        designOfTings.returnBook();
    }

    void borrowedBook() {
        if (isBorrowed) {
            System.out.println("Book is alrady borrowd");
        } else {
            this.isBorrowed = true;
            System.out.println("enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoy the book,please drope your review");
        } else {
            System.out.println("this book is aleady in the library");
        }
    }

}





