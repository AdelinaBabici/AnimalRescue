public class Food {
    private String nameFood;
    private double price;
    private int quantity;
    private int dateOfExp;
    private boolean inStock;


    public Food(){

    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDateOfExp() {
        return dateOfExp;
    }

    public void setDateOfExp(int dateOfExp) {
        this.dateOfExp = dateOfExp;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
