package org.example;

public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }

    private int sumOfNodes(Node node){
        if (node == null) return 0;
        else
            return node.value + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    public int sumOfNodes()
    {
        return sumOfNodes(root);
    }
    void constructTree()
    {
        root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(1);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(10);
        root.right.left.right = new Node(3);
    }
}
