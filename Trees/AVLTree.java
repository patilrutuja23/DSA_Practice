
import java.util.Scanner;

public class AVLTree {
    public AVLTree() {

    }
    
    public static void main(String[] arg) {
        AVLTree tree = new AVLTree();
        for(int i=0; i<1000; i++) {
            tree.insert(i);
        }
        System.out.println("Height of tree: " + tree.height(tree.root));
    }
    
    public static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
  
    }

    private Node root;

    public int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(value, node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) +1;
        return rotate(node);
    }

    public Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
            // left heavy
            // left-left case
            if(height(node.left.left) - height(node.left.right) > 0) {
                return  rightRotate(node);
            }
            // left right case
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return  rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1) {
            // right heavy
            // right-right case
            if(height(node.right.left) - height(node.right.right) < 0) {
                return  leftRotate(node);
            }
            // right left case
            if(height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.left);
                return  leftRotate(node);
            }
        }
        return node;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

       
        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }

    public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "left child of " + node.value + " : ");
        display(node.right, "right child of " + node.value + " : ");

    }
    
}


    