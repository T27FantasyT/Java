public class Product{
    public int id;
    public String name;
    public int quantity;
    public String calculationUnit;
    public long costPrice;
    public long sellPrice;
    public int sellQuantity;

    public Product(int id, String name, int quantity, String calculationUnit, long costPrice, long sellPrice, int sellQuantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.calculationUnit = calculationUnit;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.sellQuantity = sellQuantity;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", calculationUnit='" + calculationUnit + '\'' +
                ", costPrice=" + costPrice +
                ", sellPrice=" + sellPrice +
                ", sellQuantity=" + sellQuantity;
    }
}