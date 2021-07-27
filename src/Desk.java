public class Desk extends Room{

    private String accessories;

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getFurniture() {
        return super.getFurniture();
    }

    @Override
    public void setFurniture(String furniture) {
        super.setFurniture(furniture);
    }

    @Override
    public String getComfortLvLOfFurniture() {
        return super.getComfortLvLOfFurniture();
    }

    @Override
    public void setComfortLvLOfFurniture(int comfortLvLOfFurniture) {
        super.setComfortLvLOfFurniture(comfortLvLOfFurniture);
    }
}
