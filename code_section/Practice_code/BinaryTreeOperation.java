package Practice_code;

import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node1 left, right;

    public Node(int item) {
        this.data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node1 root;

    static int max_level = 0;

    private void leftViewUtil(Node1 node1, int level) {

        if (node1 == null) {
            return;
        }

        if (level > max_level) {
            System.out.println(node1.data+" ");
            max_level = level;
        }

        leftViewUtil(node1.left, level+1);
        leftViewUtil(node1.right, level+1);
    }

    public void leftView() {
        max_level = 0;
        leftViewUtil(root, 1);
    }


    private void rightViewUtil(Node1 node1, int level) {

        if (node1 == null) {
            return;
        }

        if (level > max_level) {
            System.out.println(node1.data+" ");
            max_level = level;
        }

        rightViewUtil(node1.right, level+1);
        rightViewUtil(node1.left, level+1);

    }
    public void rightView() {
        max_level = 0;
        rightViewUtil(root, 1);
    }


    public void completeBinaryTree() {

        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            for (int i=0;i<queue.size();i++) {
                Node1 currentNode1 = queue.poll();
                System.out.println(currentNode1.data+" ");

                if (currentNode1.left != null)
                    queue.add(currentNode1.left);

                if (currentNode1.right != null)
                    queue.add(currentNode1.right);
            }
            System.out.println();
        }
    }
}
public class BinaryTreeOperation {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node1(1);
        binaryTree.root.left = new Node1(2);
        binaryTree.root.right = new Node1(3);
        binaryTree.root.left.left = new Node1(4);
        binaryTree.root.left.right = new Node1(5);
        binaryTree.root.right.left = new Node1(6);
        binaryTree.root.right.right = new Node1(7);

        System.out.println("Left view presentation of binary tree");
        binaryTree.leftView();


        System.out.println("Right view presentation of binary tree");
        binaryTree.rightView();

        System.out.println("Complete binary tree");
        binaryTree.completeBinaryTree();
    }

}
