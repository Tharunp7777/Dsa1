package Dsa1;

public class BinaryTreeYT{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){

            this.data=data;
            this.left=null;
            this.right=null;
            
        }
        
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node BulidTree(int nodes[]){
            idx++;
            if(nodes [idx]==-1){
                return null;
            }
            Node newNode=new Node( nodes[idx]);
            newNode.left=BulidTree(nodes);
            newNode.right=BulidTree(nodes);
            return newNode;


        }

    }
    
    public static void preorder(Node root){
        if(root==null){
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root==null){
            System.out.print(-1 + " ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = BinaryTree.BulidTree(nodes);
        System.out.println(root.data);
        preorder(root);
        
    }

}