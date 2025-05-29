class Book implements Comparable<Book>{
    String name;
    String author;
    int pages;

    Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        
        Book other = (Book) obj;
        return (this.author.equals(other.author) && 
        this.name.equals(other.name) && 
        this.pages == other.pages) ? true : false;
    }

    @Override
    public int compareTo(Book other){
        return Integer.compare(this.pages, other.pages);
    }
}
public class Books {
    public static void main(String[] args) {
        Book book1 = new Book("HP 1","JK" , 20);
        Book book2 = new Book("HP 1","JK" , 20);
        Book book3 = new Book("HP 2","JK" , 30);

        System.out.println(book1.equals(book2)+" "+book1.equals(book3));
        if(book3.compareTo(book1) >0)
            System.out.println("Book 3 is larger than book 1");
        else if (book3.compareTo((book1)) <0){
            System.out.println("Book 3 is smaller than book 1");
        }
        else{
            System.out.println("Book 3 and book 1 are of same size");
        }
    }

    
}
