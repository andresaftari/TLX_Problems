package asprak.mod13.modul13.bfs;

import asprak.mod13.modul13.NodeAdjacentChar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedBFS {
    private final Queue<NodeAdjacentChar> queue = new LinkedList<>(); // daftar Queue
    static ArrayList<NodeAdjacentChar> nodes = new ArrayList<>(); // daftar Vertex

    public ArrayList<NodeAdjacentChar> listTetangga(int[][] matrix, NodeAdjacentChar currentNode) {
        int index = -1;

        ArrayList<NodeAdjacentChar> tetangga = new ArrayList<>();

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == currentNode.getData()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = 0; i < matrix[index].length; i++) {
                if (matrix[index][i] == 1) {
                    tetangga.add(nodes.get(i));
                }
            }
        }
        return tetangga;
    }

    public void bfs(int[][] matrix, NodeAdjacentChar currentNode) {
        queue.add(currentNode);
        currentNode.setVisited(true);

        while (!queue.isEmpty()) {
            NodeAdjacentChar element = queue.poll();
            System.out.print(element.getData() + "_");

            ArrayList<NodeAdjacentChar> tetangga = listTetangga(matrix, element);

            for (NodeAdjacentChar node : tetangga) {
                if (node != null && !node.isVisited()) {
                    queue.add(node);
                    node.setVisited(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        DirectedBFS adj = new DirectedBFS();

        NodeAdjacentChar node1 = new NodeAdjacentChar('A');
        NodeAdjacentChar node2 = new NodeAdjacentChar('B');
        NodeAdjacentChar node3 = new NodeAdjacentChar('C');
        NodeAdjacentChar node4 = new NodeAdjacentChar('D');
        NodeAdjacentChar node5 = new NodeAdjacentChar('E');
        NodeAdjacentChar node6 = new NodeAdjacentChar('F');
        NodeAdjacentChar node7 = new NodeAdjacentChar('G');
        NodeAdjacentChar node8 = new NodeAdjacentChar('H');
        NodeAdjacentChar node9 = new NodeAdjacentChar('I');

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);

        // Diganti jadi Map sama aingggg :)
        int[][] matriks = {
                //1  2  3  4  5  6  7  8  9
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, //1
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, //2
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, //3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, //4
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, //5
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, //6
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, //7
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, //8
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, //9
        };

        System.out.print("Traversal Graph : ");
        adj.bfs(matriks, node1);
        System.out.println();
    }
}