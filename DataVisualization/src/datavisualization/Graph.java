
package datavisualization;

public class Graph {
    int x;
    int y;
    
    Graph(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    int graphValueX = x - 1000;
    int graphValueY = y - 1000; 
    
    public int getInfoX() {
        int infoX = graphValueX;
        return infoX;
    }
    
    public int getInfoY() {
        int infoY = graphValueY;
        return infoY;
    }
}
