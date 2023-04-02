package Practice_code;

public class BinaryTreeLeftView {

    Node1 root;
    static int max_level = 0;

    public void leftViewUtil(Node1 node1, int level) {

        if (node1 == null)
            return;

        if (max_level < level) {
            System.out.println(node1.data+" ");
            max_level = level;
        }

        leftViewUtil(node1.left, level + 1);
        leftViewUtil(node1.right, level + 1);
    }


    public void leftView() {
        max_level = 0;
        leftViewUtil(root, 1);
    }


    public static void main(String[] args) {

        BinaryTreeLeftView tree = new BinaryTreeLeftView();
        tree.root = new Node1(10);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(7);
        tree.root.left.right = new Node1(8);
        tree.root.right.left = new Node1(12);
        tree.root.right.right = new Node1(15);

        tree.leftView();

    }
}



class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        this.data = item;
        left = right = null;
    }
}
