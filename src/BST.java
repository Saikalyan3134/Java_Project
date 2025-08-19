import java.util.Scanner;


public class BST {
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
    Node root;

    void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insert(root.left, data);
        else if (data > root.data) root.right = insert(root.right, data);
        return root;
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    Node search(Node root, int data) {
        if (root == null || root.data == data) return root;
        if (data < root.data) return search(root.left, data);
        return search(root.right, data);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Binary Search Tree Main Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Traversal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    tree.insert(value);
                    System.out.println(value + " inserted.");
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    Node result = tree.search(tree.root, value);
                    if (result != null)
                        System.out.println("Found: " + result.data);
                    else
                        System.out.println("Not Found.");
                    break;
                case 3:
                    int tChoice;
                    do {
                        System.out.println("\n--- Traversal Sub-Menu ---");
                        System.out.println("1. Inorder");
                        System.out.println("2. Preorder");
                        System.out.println("3. Postorder");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        tChoice = sc.nextInt();

                        switch (tChoice) {
                            case 1:
                                System.out.print("Inorder Traversal: ");
                                tree.inorder(tree.root);
                                System.out.println();
                                break;
                            case 2:
                                System.out.print("Preorder Traversal: ");
                                tree.preorder(tree.root);
                                System.out.println();
                                break;
                            case 3:
                                System.out.print("Postorder Traversal: ");
                                tree.postorder(tree.root);
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice! Try again.");
                        }
                    } while (tChoice != 4);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
