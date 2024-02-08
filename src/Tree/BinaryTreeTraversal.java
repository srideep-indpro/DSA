package Tree;

public class BinaryTreeTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int key){
            data = key;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }



    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

//        System.out.printf("root "+  root);
//        preOrderTraversal(root);
//        inOrderTraversal(root);
        postOrderTraversal(root);
//        System.out.println(root);
    }
}
