package heaptree;

public class Main {
    public static void main(String[] args) {
        HeapTree heapTree = new HeapTree(10, 0);

        heapTree.insert(23);
        heapTree.insert(43);
        heapTree.insert(12);
        heapTree.insert(50);
        heapTree.insert(5);
        heapTree.insert(17);
        heapTree.insert(8);
        heapTree.insert(60);
        heapTree.insert(11);
        heapTree.insert(3);

        System.out.println("Hasil: ");
        heapTree.displayHeap();

        System.out.println("Hasil HeapSort: ");
        heapTree.heapSort();
    }
}
