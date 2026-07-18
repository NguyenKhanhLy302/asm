/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author Admin
 */
public class Book {

   
    private String title;
    private String author;
    private String ISBN;
    private String desciption = "This book hasn't have any description yet.";
    private boolean isBorrowed;
    

    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public String getDesciption() {
        return desciption;
    }
    
    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
    
    
    
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void borrow(){
        this.isBorrowed = true;
    }
    
    public void returnBook(){
        this.isBorrowed = false;
    }
}
