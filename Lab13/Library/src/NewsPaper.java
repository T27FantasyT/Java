public class NewsPaper extends Knowledge{
    private String releaseDate;
    private int quantity;
    private int pageQuantity;

    public NewsPaper(int id, String name, String[] type, String publishingCompany, String releaseDate, int quantity, int pageQuantity) {
        super(id, name, type, publishingCompany);
        this.releaseDate = releaseDate;
        this.quantity = quantity;
        this.pageQuantity = pageQuantity;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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

    @Override
    public String toString() {
        return super.toString() + releaseDate + quantity + pageQuantity;
    }
}
