/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


/**
 *
 * @author Admin
 */
public class Librarymanagement {

  
    
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        ioMethod a = new ioMethod();
        List<Book> bookList = new ArrayList<Book>();
        List<String> notify = new ArrayList<String>();
        int choice;
        
        a.loadfile(bookList);
         Scanner sc = new Scanner(System.in);
         do{
             
         a.display();
         choice = sc.nextInt();
         
         switch (choice){
             case 1:
                 do{
                 a.clear();
                 a.bookOption();
                 choice = sc.nextInt();
                 sc.nextLine(); 
                 ////////////////////////////////////////////////////////////////////////////
                 //lua chon trong book option
                 switch(choice){
                     case 1://display book                       
                         break;
                     case 2://add book
                         a.clear();
                         //C. Ngan làm phan add
                                System.out.println("\n================================");
                                System.out.println("          ADD NEW BOOK");
                                System.out.println("================================");

                                System.out.print("Book ID: ");
                                String id = sc.nextLine();

                                System.out.print("Book title: ");
                                String title = sc.nextLine();

                                System.out.print("Author: ");
                                String author = sc.nextLine();

                                Book newBook = new Book(id, title, author, false);

                                bookList.add(newBook);
                                a.clear();
                                //phan notify cua Ly
                                notify.add(String.format("*A new book added to the library* \n"
                                        + "Book detail:\n"
                                        + "Id: %s\n" 
                                        + "title: %s\n" 
                                        + "Author: %s",id,title,author));
                                ////////////////////////////////////////////////////
                                System.out.println("\nBook added successfully!");
                                System.out.println("--------------------------------");
                                System.out.println("Book ID    : " + id);
                                System.out.println("Book title : " + title);
                                System.out.println("Author     : " + author);
                                System.out.println("--------------------------------");              
                         break;                
                     case 3:
                         break;
                     case 4:
                         break; 
                         
                 }
                 }while(choice>0);
                 choice = 10;
                 break;
            /////////////////////////////////////////////////////////////////////////////////////////
            //thay doi ve members  
             case 2:
                 do{
                 a.clear();
                 a.memberOption();
                 choice = sc.nextInt();
                 
                 switch(choice){
                     case 1:
                         break;
                     case 2:
                         break;
                     case 3:
                         break;
                     case 4:
                         break;
                     case 5:
                         break;
                                 
                 }
                 }while(choice>0);
                 choice = 10;
                 break;
             case 3:
                break;
        } 
         sc.close();
      
    }while(choice>0);
         a.updatefile(bookList);
    }

    }
    
    
    

