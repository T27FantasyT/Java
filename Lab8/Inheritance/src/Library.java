public class Library {
    private int id;
    private String name;
    private String publishingCompany;
    private String publishingYear;
    private int quantity;

    public Library(int id, String name, String publishingCompany, String publishingYear, int quantity) {
        this.id = id;
        this.name = name;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
