/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Member {
    protected String name;
    protected int nemberId;
    protected List<Book> booksBorrowed;

    public Member(String name, int nemberId) {
        this.name = name;
        this.nemberId = nemberId;
        this.booksBorrowed = new ArrayList<>();
    }
    
    public void borrowBook(Book book){
        if (booksBorrowed.size() < maxbooks() && !book.isBorrowed()){
            booksBorrowed.add(book);
            book.borrow();
            System.out.println(name + " borrowed " + book.getTitle());
        }
        else{
            System.out.println("can't borrow this book");
        }
        
    }
    
    public void returnBook(Book book){
        booksBorrowed.remove(book);
        book.returnBook();
        System.out.println( book.getTitle() + " is returned");
    }
    
    public int maxbooks(){
        return 3;
    }
    
    
}
