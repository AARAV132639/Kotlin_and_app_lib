import java.time.LocalDate;
import java.util.*;

//---Book---

class Book{
    private final int id;
    private final String title;
    private final String author;
    private final String isbn;
    private  boolean available;

    public Book(int id, String title, String author, String isbn)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public int getId() {return id;}
    public String getTitle() {return title;}
    public boolean isAvailable() {return available;}
    public void markBorrowed(){available =false;}
    public void markReturned() {available = true;}

    @Override 
    public String toString()
    {
        return "Book{" + "id="+id +",title = "+title + "author= "+ author + " ,isbn= "+isbn+" ,available=" + available+"}";
    }
}

//----Member---

class Member{
    private final int id;
    private final String name;
    private final String email;

    public Member(int id, String name, String email)
    {
        this.id = id;
        this.name= name;
        this.email= email;
    }

    public int getId() {return id; }
    public String getName() {return name;}
    public String getemail() {return email;}

    @Override 
    public String toString()
    {
        return "Member{"+"id="+id+",name="+name+",email="+email+"}";
    }
}

//---loan

class Loan{

    private final int id;
    private final Book book;
    private final Member member;
    private final LocalDate borrowedAt;
    private final LocalDate dueDate;

    private  LocalDate returnedAt;
    private double fine;

    public Loan(int id, Book book, Member member, LocalDate borrowedAt, LocalDate dueDate){
        this.id = id;
        this.book= book;
        this.member = member;
        this.borrowedAt = borrowedAt;
        this.dueDate = dueDate;
        this.fine = 0;
    }

    public void returnBook(LocalDate returnDate)
    {
        this.returnedAt= returnDate;
        this.fine = calculateFine();
    }

    public double calculateFine(){
        LocalDate dateToCalculate = returnedAt!=null?returnedAt:LocalDate.now();

        if(!dateToCalculate.isAfter(dueDate)) return 0;

        long overdueDays= java.time.temporal.ChronoUnit.DAYS.between(dueDate, dateToCalculate);

        return overdueDays*5.0;
    }

    public Book getBook(){return book;}
    public Member getMember(){return member;}
    public LocalDate getDueDate(){return dueDate;}
    public boolean isReturned(){return returnedAt!=null;}
    public double getFine(){ return fine;}

    @Override 
    public String toString(){
        return "Loan{"+"id="+id+",book="+book.getTitle()+member.getName()+",borrowedAt="+borrowedAt+",dueDate="+dueDate+",returnedAt="+returnedAt+",fine="+fine+"}";
    }
}

//---Library---
class Library{
    //private static final int LOAN_PERIOD_DAYS=14;

    private final Map<Integer, Book> books = new HashMap<>();
    private final Map<Integer,Member>members = new HashMap<>();
    private final Map<Integer,Loan>loans = new HashMap<>();

    //private int loanIdCounter = 1;

    //Add a book
    public void addBook(Book book)
    {
        if(books.containsKey(book.getId())) throw new IllegalArgumentException("Book Id already exists");
        books.put(book.getId(),book);
    }

    //Register a member
    public void registerMember(Member member)
    {
        if(members.containsKey(member.getId())) throw new IllegalArgumentException("Member ID alreayd exists");
        members.put(member.getId(),member);
    }

    //Return a book
    public double returnBook(int bookId, int memberId)
    {
        Loan loan = findActiveLoan(bookId, memberId);
        if(loan==null) throw new IllegalStateException("No actve loan found");
    

    LocalDate returnDate = LocalDate.now();
    loan.returnBook(returnDate);
    loan.getBook().markReturned();
    return loan.getFine();

    }

    private Loan findActiveLoan(int bookId, int memberId)
    {
        for(Loan loan: loans.values())
        {
           // if(!loan.isReturned() && loan.getBook().getId()==bookId && loan.getMember().getId==memberId) return loan;

        }
        return null;
    }

    //List of available books
    public List<Book> listAvailableBook(){
        List<Book>result = new ArrayList<>();

        for(Book book: books.values()){
            if(book.isAvailable()) result.add(book);
        }
        return result;
    }

    //List of all loans of a member
    public List<Loan> listMemberLoans(int memberId)
    {
        if(!members.containsKey(memberId)) throw new IllegalArgumentException("Member not found");
        List<Loan>result = new ArrayList<>();

        for(Loan loan: loans.values())
        {
            if(loan.getMember().getId()==memberId) result.add(loan);
        }
        return result;
    }
}

//---Main---

public class LibraryManagementSystem{

    public static void main(String[] args) {
        Library library = new Library();

        //Add books
        library.addBook(
            new Book(1, "Clean code","Rober C.Martin","9780")
        );
        library.addBook(new Book(2, "Psychology", "AaravKumar", "9991"));

        //Register Member
        library.registerMember(new Member(101, "Rahul","rahul@gmail.com"));
        
        System.out.println("Trial of OOPS completed");
        //Borrow book
        //Loan loan = library.borrowBook(1, 101);
        //System.out.println("Book borrowed:");
       // System.out.println(loan);


    }
}