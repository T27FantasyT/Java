import java.time.LocalDate;

public class TextBook extends Knowledge{
    private LocalDate publishingYear;
    private int quantity;
    private int PagesQuantity;
    private String author;

    public TextBook(int id, String name, String[] type, String publishingCompany, LocalDate publishingYear, int quantity, int pagesQuantity, String author) {
        super(id, name, type, publishingCompany);
        this.publishingYear = publishingYear;
        this.quantity = quantity;
        PagesQuantity = pagesQuantity;
        this.author = author;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPagesQuantity() {
        return PagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        PagesQuantity = pagesQuantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " - Năm xuất bản: " + publishingYear.getYear() + " - Số lượng:  " + quantity + " - Số trang: " + PagesQuantity + " - Tác giả: " + author;
    }
}
