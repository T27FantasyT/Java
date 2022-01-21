import java.time.LocalDate;

public class Document extends Knowledge{
    private LocalDate publishingYear;
    private double memoryCapacity;
    private String picture;
    private int totalDownloaded;

    public Document(int id, String name, String[] type, String publishingCompany, LocalDate publishingYear, double memoryCapacity, String picture, int totalDownloaded) {
        super(id, name, type, publishingCompany);
        this.publishingYear = publishingYear;
        this.memoryCapacity = memoryCapacity;
        this.picture = picture;
        this.totalDownloaded = totalDownloaded;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
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

    public int getTotalDownloaded() {
        return totalDownloaded;
    }

    public void setTotalDownloaded(int totalDownloaded) {
        this.totalDownloaded = totalDownloaded;
    }

    @Override
    public String toString() {
        return super.toString() + " - Năm xuất bản: " + publishingYear.getYear() + " - Dung lượng " + memoryCapacity + " - Ảnh: " + picture + " - Lượt tải xuống:  " + totalDownloaded;
    }
}
