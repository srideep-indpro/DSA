package Tree.bst;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
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

    public static Node insert(Node root, int value){
       /* Beginning Step. if root is null,
          Create the node,
          make the newly created node the Root
          return
        */
       if(root == null){
           root = new Node(value);
           return root;
       }
       /*
          if root data is bigger than the value,
          insert at left subtree
        */
       if(root.data > value){
          root.left = insert(root.left, value);
       }

       /*
          if root data is lesser than the value,
          insert at left subtree
        */
        if(root.data < value){
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0 ;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.print(root.right.data);
    }
}
