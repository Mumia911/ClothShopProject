public class Boots extends Product {

    int size;
    boolean isNaturalSkin;

    public Boots(Long id, String productName, double price, double weight, String color, int productCount) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = true;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
}
