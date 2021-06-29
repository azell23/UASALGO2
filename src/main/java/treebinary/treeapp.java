package treebinary;
public class treeapp {
    public static void main(String[] args) {
        binary tree=new binary();
        
        node node;
        
        node = new node(50);
        tree.insert(node);
        
        node = new node(30);
        tree.insert(node);
        
        node = new node(20);
        tree.insert(node);
        
        node = new node(40);
        tree.insert(node);
        
        node = new node(70);
        tree.insert(node);
        
        System.out.print("Traversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println("\nHildan Rizky ramadhan");
    }
}
