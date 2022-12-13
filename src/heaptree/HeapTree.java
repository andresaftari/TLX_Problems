package heaptree;

public class HeapTree {
    private final int[] heap;
    private final int flag;
    private final int max;

    private int size;

    public HeapTree(int max, int flag) {
        this.size = 0;
        this.flag = flag;
        this.max = max;
        this.heap = new int[max];
    }

    // Deklarasi parent node
    private int parentNode(int index) {
        return (index - 1) / 2;
    }

    // Deklarasi left node
    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    // Deklarasi right node
    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    // Display Heaptree
    public void displayHeap() {
        for (int i = 0; i < size; i++) {
            if (heap[i] != Integer.MAX_VALUE) System.out.print(heap[i] + " ");
            else System.out.print("-- ");
        }
        System.out.println();

        int blanks = 32, itemEachRow = 1, column = 0, currentIndex = 0;

        String delimeter = "-----------------------------------------------------------------";
        System.out.println(delimeter);

        while (size > 0) {
            if (column == 0) for (int i = 0; i < blanks; i++) {
                System.out.print(' ');
            }

            System.out.print(heap[currentIndex]);

            if (++currentIndex == size) break;
            if (++column == itemEachRow) {
                blanks /= 2;
                itemEachRow *= 2;
                column = 0;
                System.out.println();
            } else for (int i = 0; i < blanks * 2 - 2; i++) System.out.print(' ');
        }
        System.out.println("\n" + delimeter);
    }

    // Insert
    public void insert(int node) {
        // Kalo size nya masih 0, isi datanya (indexnya ditambah 1)
        if (size == 0) {
            heap[size++] = node;
        } else {
            heap[size] = node;
            heapifyUp(size++);
        }
    }

    // Heapsort
    public void heapSort() {
        for (int i = 0; i < max; i++) {
            System.out.print(remove() + "\t");
        }
        System.out.println();
    }

    // Heapify ke bawah untuk sorting
    private int remove() {
        int temp = heap[0];

        heap[0] = heap[--size];
        heapifyDown(0);

        return temp;
    }

    // Menjalankan pengurutan parent (Heapify) ke atas
    private void heapifyUp(int index) {
        int temp = heap[index];
        int parent = parentNode(index);

        if (this.flag == 0) {
            while (index > 0 && heap[parent] < temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentNode(index);
            }
        } else {
            while (index > 0 && heap[parent] > temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentNode(index);
            }
        }

        heap[index] = temp;
    }

    // Menjalankan pengurutan parent (Heapify) ke bawah
    private void heapifyDown(int index) {
        int leftIndex, rightIndex;
        int maxChildIndex, minChildIndex;

        int temp = heap[index];

        if (flag == 0) {
            while (index < (size / 2)) {
                leftIndex = leftChild(index);
                rightIndex = rightChild(index);

                if (rightIndex < size && heap[leftIndex] < heap[rightIndex]) {
                    maxChildIndex = rightIndex;
                } else {
                    maxChildIndex = leftIndex;
                }

                if (heap[maxChildIndex] <= temp) break;

                heap[index] = heap[maxChildIndex];
                index = maxChildIndex;
            }
        } else {
            while (index < (size / 2)) {
                leftIndex = leftChild(index);
                rightIndex = rightChild(index);

                if (rightIndex < size && heap[leftIndex] > heap[rightIndex]) {
                    minChildIndex = rightIndex;
                } else {
                    minChildIndex = leftIndex;
                }

                if (heap[minChildIndex] >= temp) break;

                heap[index] = heap[minChildIndex];
                index = minChildIndex;
            }
        }
        heap[index] = temp;
    }
}
