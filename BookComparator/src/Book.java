public class Book implements Comparable<Book>{

    private String name;
    private String author;

    private int pageNum;
    private int publishDate;

    public Book(String name,String author,int pageNum,int publishDate){
        this.name = name;
        this.author = author;
        this.pageNum = pageNum;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book b2) {
        return (this.getName()).compareTo(b2.getName());
    }
}
