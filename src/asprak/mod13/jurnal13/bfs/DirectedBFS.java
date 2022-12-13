package asprak.mod13.jurnal13.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DirectedBFS {
    public final BFS graph = new BFS();

    public void beginBFS(NodeBFS startNodes) {
        if (startNodes == null) return;

        Queue<NodeBFS> queue = new LinkedList<>(); // Temp Queue
        queue.add(startNodes);

        while (!queue.isEmpty()) {
            NodeBFS nodes = queue.remove();
            if (nodes.isVisited) continue;

            Queue<NodeBFS> allAdjacent = graph.adjMap.get(nodes); // Vertex Queue

            nodes.visits();
            System.out.print(nodes.name + " ");

            if (allAdjacent == null) continue;

            for (NodeBFS adjacents : allAdjacent) {
                if (!adjacents.isVisited) queue.add(adjacents);
            }
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        DirectedBFS bfs = new DirectedBFS();

        NodeBFS a = new NodeBFS("A");
        NodeBFS b = new NodeBFS("B");
        NodeBFS c = new NodeBFS("C");
        NodeBFS d = new NodeBFS("D");
        NodeBFS e = new NodeBFS("E");
        NodeBFS f = new NodeBFS("F");
        NodeBFS g = new NodeBFS("G");
        NodeBFS h = new NodeBFS("H");
        NodeBFS i = new NodeBFS("I");

        bfs.graph.addEdge(a, b);
        bfs.graph.addEdge(a, d);
        bfs.graph.addEdge(a, e);
        bfs.graph.addEdge(b, e);
        bfs.graph.addEdge(c, b);
        bfs.graph.addEdge(d, g);
        bfs.graph.addEdge(e, f);
        bfs.graph.addEdge(e, h);
        bfs.graph.addEdge(f, c);
        bfs.graph.addEdge(f, h);
        bfs.graph.addEdge(g, h);
        bfs.graph.addEdge(h, i);

        System.out.println("BFS Traversal : ");
        bfs.beginBFS(a);
    }
}

class BFS {
    Map<NodeBFS, LinkedList<NodeBFS>> adjMap = new HashMap<>();

    private void edgeMaker(NodeBFS src, NodeBFS dest) {
        LinkedList<NodeBFS> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    public void addEdge(NodeBFS src, NodeBFS dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
    }
}

class NodeBFS {
    String name;
    boolean isVisited;

    NodeBFS(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}
