public class SchoolBook extends Library{
    private int pageQuantity;
    private boolean isNew;
    private int numberOfBorrowed;

    public SchoolBook(int id, String name, String publishingCompany, String publishingYear, int quantity, int pageQuantity, boolean isNew, int numberOfBorrowed) {
        super(id, name, publishingCompany, publishingYear, quantity);
        this.pageQuantity = pageQuantity;
        this.isNew = isNew;
        this.numberOfBorrowed = numberOfBorrowed;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public String isNew() {
        if (isNew){
            return "sach moi";
        } else return " sach cu";

    }

    public int getNumberOfBorrowed() {
        return numberOfBorrowed;
    }

    public void location(String location){
        System.out.println("Vị trí sách ở: "+ location);
    }

    public int inventory(){
        return getQuantity()-getNumberOfBorrowed();
    }


    @Override
    public String toString() {
        return super.toString() + " Số trang là: " + pageQuantity + " tồn kho là: " + inventory() +"Tinh trang sach: " + isNew();
    }
}
