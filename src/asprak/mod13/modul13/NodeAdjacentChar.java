package asprak.mod13.modul13;

public class NodeAdjacentChar {
    private final char data;
    private boolean isVisited = false;

    public NodeAdjacentChar(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}