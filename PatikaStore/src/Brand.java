public class Brand {

    private long id;
    private String title;

    public Brand(String title) {
        this.id = title.hashCode(); //unique id
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}