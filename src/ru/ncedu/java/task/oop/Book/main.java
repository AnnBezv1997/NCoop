package ru.ncedu.java.task.oop.Book;

public class main {
    public static void main(String[] args){
       Author[] authors = {new Author("Jhon Mair"),new Author("Matis Nyuer")};
        Book book = new Book("I.O.S", authors,123);
        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());
    }
}
