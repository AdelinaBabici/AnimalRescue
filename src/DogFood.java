import java.time.LocalDate;

public class DogFood extends Food{
    public DogFood(String nameFood, double price, int quantity, LocalDate dateOfExp, boolean inStock) {
        super(nameFood, price, quantity, dateOfExp, inStock);
    }

    public DogFood() {
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

    @Override
    public String toString() {
        return "DogFood{}";
    }
}
