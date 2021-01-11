package ru.ncedu.java.task.oop.Book;

import java.util.Arrays;


public class Book  {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name,Author[] authors,double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name,Author[] authors,double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + name + ", authors=" +
                 Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Author a : authors){
            stringBuilder.append(a.getName()+", ");
        }
        String authorName = stringBuilder.substring(0,stringBuilder.length()-2);
        return authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 &&
                qty == book.qty &&
                name.equals(book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(authors);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }
}

