public class Book {
    private int id;
    private String title;
    private String author;
    private String gender;

    public Book(int id, String title, String author, String gender) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
