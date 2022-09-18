public class Cloth extends Product {

    String size;
    String material;

    public Cloth(Long id, String productName, double price, double weight, String color, int productCount) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
