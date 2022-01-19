public class TextBook extends Knowledge{
    private String publishingYear;
    private int quantity;
    private int pageQuantity;
    private String authorName;

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public TextBook(int id, String name, String[] type, String publishingCompany, String publishingYear, int quantity, int pageQuantity, String authorName) {
        super(id, name, type, publishingCompany);
        this.publishingYear = publishingYear;
        this.quantity = quantity;
        this.pageQuantity = pageQuantity;
        this.authorName = authorName;



    }

    @Override
    public String toString() {
        return super.toString() + publishingYear + quantity + pageQuantity + authorName;
    }
}
