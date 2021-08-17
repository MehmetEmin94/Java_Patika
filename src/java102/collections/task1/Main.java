package java102.collections.task1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book_1=new Book("def",50,"kim","2012");
        Book book_2=new Book("abc",150,"kim kim","1999");
        Book book_3=new Book("klm",250,"this","1912");
        Book book_4=new Book("xyz",750,"who","2000");
        Book book_5=new Book("prs",320,"who who","2015");

        TreeSet<Book> treeSet=new TreeSet<>();
        treeSet.add(book_1);
        treeSet.add(book_2);
        treeSet.add(book_3);
        treeSet.add(book_4);
        treeSet.add(book_5);


        for (Book b:treeSet) {
            System.out.println(b.getBookName());
        }

    }
}
