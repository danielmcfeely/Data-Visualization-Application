package datavisualization;


public class Data {
    private String category;
    private int value;
    
    Data(String category, int value) {
    this.category = category;
    this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public int getValue() {
        return value;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Category=" + category + ", Value=" + value + '}';
    }
    
    
}
