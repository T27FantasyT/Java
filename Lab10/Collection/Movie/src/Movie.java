public class Movie {
    private int id;
    private String title;
    private int releaseYear;
    private String category;
    private int length;
    private int view;

    public Movie(int id, String title, int releaseYear, String category, int length, int view) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.category = category;
        this.length = length;
        this.view = view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", category=" + category +
                ", length=" + length +
                ", view=" + view +
                '}';
    }

}
