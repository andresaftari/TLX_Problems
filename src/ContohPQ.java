import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ContohPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Character> queue = new LinkedList<>();

        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(90);
        priorityQueue.add(10);
        priorityQueue.add(10);
        priorityQueue.add(40);
        priorityQueue.add(50);

        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }
    }
}
