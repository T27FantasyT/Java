import java.time.LocalDate;

public class NewsPaper extends Knowledge{
    private LocalDate publishingDate;
    private int quantity;
    private int pagesQuantity;

    public NewsPaper(int id, String name, String[] type, String publishingCompany, LocalDate publishingDate, int quantity, int pagesQuantity) {
        super(id, name, type, publishingCompany);
        this.publishingDate = publishingDate;
        this.quantity = quantity;
        this.pagesQuantity = pagesQuantity;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Ngày xuất bản: " + publishingDate + " - Số lượng: " + quantity + " - Số trang: " + pagesQuantity;
    }
}
