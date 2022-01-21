import java.time.LocalDate;

public class Document extends Knowledge{
    private String publishingYear;
    private double memoryCapacity;
    private String picture;
    private int totalDownload;

    public Document(int id, String name, String[] type, String publishingCompany, String publishingYear, double memoryCapacity, String picture, int totalDownload) {
        super(id, name, type, publishingCompany);
        this.publishingYear = publishingYear;
        this.memoryCapacity = memoryCapacity;
        this.picture = picture;
        this.totalDownload = totalDownload;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getTotalDownload() {
        return totalDownload;
    }

    public void setTotalDownload(int totalDownload) {
        this.totalDownload = totalDownload;
    }

    @Override
    public String toString() {
        return super.toString() + totalDownload + picture + memoryCapacity + publishingYear;
    }
}
