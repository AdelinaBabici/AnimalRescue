public class Food {
    private String nameFood;
    private double price;
    private int quantity;
    private int dateOfExp;
    private boolean inStock;

    private Food(String nameFood, double price, int quantity, int dateOfExp, boolean inStock){
        this.nameFood= nameFood;
        this.price = price;
        this.quantity = quantity;
        this.dateOfExp = dateOfExp;
        this.inStock = inStock;
    }
}
