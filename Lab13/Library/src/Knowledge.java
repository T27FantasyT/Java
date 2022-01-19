import java.util.Arrays;

public class Knowledge {
    private int id;
    private String name;
    private String[] type;
    private String publishingCompany;

    public Knowledge(int id, String name, String[] type, String publishingCompany) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.publishingCompany = publishingCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + Arrays.toString(type) +
                ", publishingCompany='" + publishingCompany + '\'' +
                '}';
    }
}
