package asprak.mod13.modul13;

public class NodeAdjacent {
    private final int data;
    private boolean isVisited = false;

    public NodeAdjacent(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
