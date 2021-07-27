
import java.time.LocalDate;


public  abstract class Food {
    private String nameFood;
    private double price;
    private int quantity;
    private LocalDate dateOfExp;
    private boolean inStock;
    private int calorieIntake;



    public Food(String nameFood, double price, int quantity, LocalDate dateOfExp, boolean inStock, int calorieIntake) {
        this.nameFood = nameFood;
        this.price = price;
        this.quantity = quantity;
        this.dateOfExp = dateOfExp;
        this.inStock = inStock;
        this.calorieIntake = calorieIntake;
    }

    public Food(){

    }

    public int getCalorieIntake() {
        return calorieIntake;
    }

    public void setCalorieIntake(int calorieIntake) {
        this.calorieIntake = calorieIntake;
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

    public LocalDate getDateOfExp() {
        return dateOfExp;
    }

    public void setDateOfExp(LocalDate dateOfExp) {
        this.dateOfExp = dateOfExp;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
