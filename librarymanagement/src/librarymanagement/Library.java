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
public class Library {
    
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void addMember (Member member){
        members.add(member);
    }
    
    public void borrowBook(Member member, Book book){
        member.borrowBook(book);
    }
    
     public void returnBook(Member member, Book book){
        member.returnBook(book);
    }
}
