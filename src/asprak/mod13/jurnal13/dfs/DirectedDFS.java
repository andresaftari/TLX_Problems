package asprak.mod13.jurnal13.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DirectedDFS {
    public final DFS graph = new DFS();

    // Used to continue traverse the second and more level of the Graph
    public void startDFS(NodeDFS startNode) {
        startNode.visits();
        System.out.print(startNode.name + " ");

        Queue<NodeDFS> allAdjacents = graph.adjMap.get(startNode);

        if (allAdjacents == null) return;

        for (NodeDFS adjacent : allAdjacents) {
            if (!adjacent.isVisited) startDFS(adjacent);
        }

        graph.adjMap.keySet().forEach(it -> {
            if (!it.isVisited) startDFS(it);
        });
    }
}

class Main {
    public static void main(String[] args) {
        DirectedDFS dfs = new DirectedDFS();
        
        NodeDFS a = new NodeDFS("A");
        NodeDFS b = new NodeDFS("B");
        NodeDFS c = new NodeDFS("C");
        NodeDFS d = new NodeDFS("D");
        NodeDFS e = new NodeDFS("E");
        NodeDFS f = new NodeDFS("F");
        NodeDFS g = new NodeDFS("G");
        NodeDFS h = new NodeDFS("H");
        NodeDFS i = new NodeDFS("I");

        dfs.graph.addEdge(a, b);
        dfs.graph.addEdge(a, d);
        dfs.graph.addEdge(a, e);
        dfs.graph.addEdge(b, e);
        dfs.graph.addEdge(c, b);
        dfs.graph.addEdge(d, g);
        dfs.graph.addEdge(e, f);
        dfs.graph.addEdge(e, h);
        dfs.graph.addEdge(f, c);
        dfs.graph.addEdge(f, h);
        dfs.graph.addEdge(g, h);
        dfs.graph.addEdge(h, i);

        System.out.println("DFS Traversal : ");
        dfs.startDFS(a);
    }
}

class DFS {
    Map<NodeDFS, LinkedList<NodeDFS>> adjMap = new HashMap<>();

    private void edgeMaker(NodeDFS src, NodeDFS dest) {
        LinkedList<NodeDFS> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    void addEdge(NodeDFS src, NodeDFS dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
    }
}

class NodeDFS {
    String name;
    boolean isVisited;

    NodeDFS(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}
