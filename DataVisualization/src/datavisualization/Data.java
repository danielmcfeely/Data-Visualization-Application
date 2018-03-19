package datavisualization;


public class Data {
    private String category;
    private int value1;
    private int value2;
    private int value3;
    
    Data(String category, int value1, int value2, int value3) {
    this.category = category;
    this.value1 = value1;
    this.value2 = value2;
    this.value3 = value3;
    }

    public String getCategory() {
        return category;
    }

    public int getValue1() {
        return value1;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setValue1(int value) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
    

    @Override
    public String toString() {
        return  category + "," +  value1 + "," + value2 + "," + value3;
    }
    
    
}
