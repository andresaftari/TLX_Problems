package asprak.mod13.modul13.dfs;

import asprak.mod13.modul13.NodeAdjacentChar;
import java.util.ArrayList;
import java.util.Stack;

public class DirectedDFS {
    static ArrayList<NodeAdjacentChar> nodes = new ArrayList<>();

    public ArrayList<NodeAdjacentChar> findNeighbors(int[][] matrix, NodeAdjacentChar node) {
        int index = -1;

        ArrayList<NodeAdjacentChar> tetangga = new ArrayList<>();

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(node)) {
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

    public void dfsStack(int[][] matriks, NodeAdjacentChar node) {
        Stack<NodeAdjacentChar> stack = new Stack<>();
        stack.add(node);

        while (!stack.isEmpty()) {
            NodeAdjacentChar element = stack.pop(); // Pop latest vertex

            // Visit list, return output
            if (!element.isVisited()) {
                System.out.print(element.getData() + " ");
                element.setVisited(true);
            }

            ArrayList<NodeAdjacentChar> tetangga = findNeighbors(matriks, element); // Adjacent List

            for (NodeAdjacentChar n : tetangga) {
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        DirectedDFS adj = new DirectedDFS();

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
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, //1
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, //2
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, //3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, //4
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, //5
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, //6
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, //7
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, //8
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul 10: value 10
        };

        System.out.print("Traversal Graph : ");

        adj.dfsStack(matriks, node1);
        System.out.println();
    }
}