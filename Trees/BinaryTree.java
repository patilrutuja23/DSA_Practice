


import java.util.*;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private static Node root;

    public static void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    
    private static void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of left: "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do ou want to enter right of "+ node.value);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter value of right of "+ node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public static void display() {
        display(root, "");
    }

    private static void display(Node node, String indent) {
        if(node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void prettydisplay() {
        prettydisplay(root, 0);
    }

    public static void prettydisplay(Node node, int level){
        if(node == null) {
            return;
        }

        prettydisplay(node.right, level+1);

        if(level != 0) {
            for(int i=0; i<level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }


        prettydisplay(node.left, level+1);

        if(level !=0) {

        }
    }


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettydisplay();
    }
}
