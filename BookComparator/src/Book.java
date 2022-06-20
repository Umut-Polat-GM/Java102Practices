public class Book {

    private String name;
    private int pageNum;

    public Book(String name, int pageNum, String author, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDate = publishDate;
    }

    private String author;

    private int publishDate;



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


}
