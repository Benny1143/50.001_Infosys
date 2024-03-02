package Algo;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node a = new Node("a",7);

    }
}

class Node {
    Node parent;
    Node left;
    Node right;
    int value;
    String key;
    Node (String key, int value) {
        this.key = key;
    }
    public void setLeft(Node leftnode) {
        left = leftnode;
        leftnode.parent = this;
    }
    public void setRight(Node rightNode) {
        right = rightNode;
        rightNode.parent = this;
    }
}
