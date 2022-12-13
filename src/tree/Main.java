package tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        char c;

        do {
            System.out.println("Choose one:");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Count");
            System.out.println("4. Empty Check");

            int tes = input.nextInt();
            input.nextLine();

            switch (tes) {
                case 1:
                    System.out.println("\nInsert integer element:");
                    tree.insert(input.nextInt());
                    break;

                case 2:
                    System.out.println("\nSearch integer element:");
                    System.out.println("Search result: " + tree.search(input.nextInt()));
                    break;

                case 3:
                    System.out.println("\nNodes " + tree.countNode());
                    break;

                case 4:
                    System.out.println("\nIs empty " + tree.isEmpty());
                    break;

                default:
                    System.out.println("\nGada pilihan " + tes + " bego!");
                    break;
            }
            System.out.println("\nPostorder: ");
            tree.postorder();
            System.out.println("\nPreorder: ");
            tree.preorder();
            System.out.println("\nInorder: ");
            tree.inorder();

            System.out.println("\nMo lanjut ga?");

            c = input.next().charAt(0);
        } while (c == 'Y' || c == 'y');
    }
}
