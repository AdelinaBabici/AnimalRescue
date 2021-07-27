public abstract class Room {

    private String color;
    private String furniture;
    private int comfortLvLOfFurniture;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getComfortLvLOfFurniture() {
        if(comfortLvLOfFurniture > 6){
            return " foarte comod";
        }else{
            return "incomod";
        }

    }

    public void setComfortLvLOfFurniture(int comfortLvLOfFurniture) {
        this.comfortLvLOfFurniture = comfortLvLOfFurniture;
    }
}
