package TPdanJurnal.jurnal05;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(true);
        Node a = new Node(0, "A");
        Node b = new Node(1, "B");
        Node c = new Node(2, "C");
        Node d = new Node(3, "D");
        Node e = new Node(4, "E");
        Node f = new Node(5, "F");
        Node g = new Node(6, "G");
        Node h = new Node(7, "H");
        Node i = new Node(8, "I");

        graph.addEdge(a, d);
        graph.addEdge(a, b);
        graph.addEdge(a, e);
        graph.addEdge(d, g);
        graph.addEdge(g, h);
        graph.addEdge(h, i);
        graph.addEdge(i, f);
        graph.addEdge(f, c);
        graph.addEdge(f, h);
        graph.addEdge(c, b);
        graph.addEdge(b, e);
        graph.addEdge(e, h);
        graph.addEdge(e, f);

        graph.printEdges();
    }
}
