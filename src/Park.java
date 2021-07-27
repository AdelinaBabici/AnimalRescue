public class Park extends PlaceForWalk{

    private String type;
    private String greenSpace;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGreenSpace() {
        return greenSpace;
    }

    public void setGreenSpace(String greenSpace) {
        this.greenSpace = greenSpace;
    }

    @Override
    public String getView() {
        return super.getView();
    }

    @Override
    public void setView(String view) {
        super.setView(view);
    }

    @Override
    public String getDecoration() {
        return super.getDecoration();
    }

    @Override
    public void setDecoration(String decoration) {
        super.setDecoration(decoration);
    }
}
