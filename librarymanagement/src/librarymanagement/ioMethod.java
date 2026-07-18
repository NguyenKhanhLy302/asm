/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ioMethod {
    
    public void clear() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                // Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Linux / macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error while clearing console: " + e.getMessage());
            }
        }
    
    public void updatefile(List<Book> bookList){
         try {
             List<String> output = new ArrayList<String>();
             File file = new File("Books.txt");
             FileWriter write = new FileWriter("Books.txt");
             Scanner sc = new Scanner(file);
             String desciption = "This book hasn't have any description yet.";
             int a=0;
             
             while(sc.hasNextLine()){
                 sc.nextLine();
                 a++;
             }
             
             for (; a<bookList.size();a++){
                    if(bookList.get(a).getDesciption().equals(desciption)){
                    output.add(String.format("%s/%s/%s",bookList.get(a).getTitle(),bookList.get(a).getAuthor(),String.valueOf(bookList.get(a).isIsBorrowed())));        
                    }
                    else{
                    output.add(String.format("%s/%s/%s/%s",bookList.get(a).getTitle(),bookList.get(a).getAuthor(),String.valueOf(bookList.get(a).isIsBorrowed()),bookList.get(a).getDesciption()));        
                    }
                 }
             for(String out: output)
             write.write(out);
         }
         catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
         }
    }
    
    public void loadfile(List<Book> bookList){
         try {
             File file = new File("Books.txt");
             Scanner sc = new Scanner(file);
             
             while(sc.hasNextLine()){
                 String[] DB = sc.nextLine().split("/");
                 Book book = new Book(DB[0],DB[1],DB[2],Boolean.parseBoolean(DB[3]));
                 if(DB.length>5){
                     book.setDesciption(DB[4]);
                 }
                 bookList.add(book);
             }
             
             sc.close();
         }
         catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
      public void display(){
        System.out.println("Welcome to library management system, what do you want to do today?");
        System.out.println("1. Show book options");
        System.out.println("2. Show member options");
        System.out.println("3. Show notifications");
        System.out.println("0. Exit");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your choice: ");
    } 
    public void bookOption(){
         
        System.out.println("Welcome to library management system, what do you want to do today?");
        System.out.println("1. Display all books");
        System.out.println("2. Add books");
        System.out.println("3. Delete/modify book");
        System.out.println("4. Borrow book");
        System.out.println("5. Return book");
        System.out.println("0. Exit");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
    
    public void memberOption(){
         
        System.out.println("Welcome to library management system, what do you want to do today?");

        System.out.println("1. Display members");
        System.out.println("2. Add member");
        System.out.println("3. Delete/modify member's status");
        System.out.println("4. Check borrow status");
        System.out.println("0. Exit");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your choice: ");
    }
}
