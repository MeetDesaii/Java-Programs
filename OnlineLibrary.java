/* Create a Online Library. Use Library Class and Use Constructor and Methods to Create Online Library.
   Create addBook(), showAvailableBook(), issueBook(), returnBook() Methods in Library Class Using Java.
 */

package com.CodeByMeet;

class Library{
    String [] Books;
    int noOfBooks;
    Library(){
        this.Books=new String [100];           // We are Storing Books in Array using Constructor...
    }
    public void addBook(String BookName){
        this.Books[noOfBooks]=BookName;        // LOGIC --> To Store Book in Index of Array...
        noOfBooks++;
        System.out.println(BookName+" --- Book Has Been Added !");
    }
    public void showAvailableBooks(){
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t----------Available Books----------\n");
        for (String Book : this.Books) {
            if(Book == null){
                continue;         // If We're Using continue keyword so It'll Skip null.
            }
            System.out.println("*  "+Book);
        }
    }
    public void issueBook(String Book){
        for(int i=0;i<this.Books.length;i++){
            if(this.Books[i].equalsIgnoreCase(Book)){                 // LOGIC --> If That Book equals with Available Books so It Will Print about Issued.
                System.out.println("\n\n" + this.Books[i] + " --- Book Has Been Issued !");
                this.Books[i] = null;         // After Issued That Book will be Null.
                return;
            }
        }
    }
    public void returnBook(String Book){
        this.Books[noOfBooks]=Book;
        noOfBooks++;
        System.out.println("\n\n" + Book + " --- Book Has Been Returned !");
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\t\t\t----------Welcome in the Online Library----------\n");
        Library PublicLibrary = new Library();
        PublicLibrary.addBook("Harry Potter by J.K. Rowling");
        PublicLibrary.addBook("Think and Grow Rich");
        PublicLibrary.showAvailableBooks();
        PublicLibrary.issueBook("Harry Potter by J.K. Rowling");
        PublicLibrary.showAvailableBooks();
        PublicLibrary.returnBook("Harry Potter by J.K. Rowling");
        PublicLibrary.showAvailableBooks();
    }
}
