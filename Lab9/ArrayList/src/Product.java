public class Product {
    private int id;
    private String name;
    private long sellPrice;
    private int quantity;
    private Type type;
    private int sellQuantity;

    public Product(int id, String name, long sellPrice, int quantity, Type type, int sellQuantity) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.type = type;
        this.sellQuantity = sellQuantity;
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

    public long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(long sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSellQuantity() {
        return sellQuantity;
    }

    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }

    @Override
    public String toString() {
        return "id: "+ id + " - Tên: " + name + " - Giá bán: " + sellPrice + " - Số lượng: " + " - Loại mặt hàng: " + type.getValue() + " - Số lượng bán: " + sellQuantity;
    }
}
