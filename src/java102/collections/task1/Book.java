package java102.collections.task1;

import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {
    private String bookName;
    private int pageNum;
    private String authorName;
    private String publishedDate;

    public Book(String bookName, int pageNum, String authorName, String publishedDate) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishedDate = publishedDate;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public int compareTo(Book o) {
        String a=this.getBookName();
        String b=o.getBookName();
        return a.compareTo(b);
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPageNum()-o2.getPageNum();
    }
}
