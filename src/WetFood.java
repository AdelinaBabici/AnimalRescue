import java.time.LocalDate;

public class WetFood extends Food{

    public WetFood(String nameFood, double price, int quantity, LocalDate dateOfExp, boolean inStock, int calorieIntake) {
        super(nameFood, price, quantity, dateOfExp, inStock, calorieIntake);
    }

    public WetFood() {
    }

    @Override
    public int getCalorieIntake() {

        return super.getCalorieIntake();
    }

    @Override
    public void setCalorieIntake(int calorieIntake) {
        super.setCalorieIntake(calorieIntake);
    }

    @Override
    public String getNameFood() {
        return super.getNameFood();
    }

    @Override
    public void setNameFood(String nameFood) {
        super.setNameFood(nameFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public LocalDate getDateOfExp() {
        return super.getDateOfExp();
    }

    @Override
    public void setDateOfExp(LocalDate dateOfExp) {
        super.setDateOfExp(dateOfExp);
    }

    @Override
    public boolean isInStock() {
        return super.isInStock();
    }

    @Override
    public void setInStock(boolean inStock) {
        super.setInStock(inStock);
    }
}
