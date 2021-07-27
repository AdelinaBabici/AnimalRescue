public class Yard {
    private int size;
    private String toys;

    public String getSize() {
        if(size > 5){
            return "mare";
        }
        return "mica";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }
}
