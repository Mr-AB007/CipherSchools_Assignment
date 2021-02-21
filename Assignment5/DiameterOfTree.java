//print the Diametre of tree

class BinaryTree {
    TreeNode root;
 
 
    int diameter(TreeNode root)
    {
        // base case if tree is empty
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
 
        return Math.max(lheight + rheight + 1,
                        Math.max(ldiameter, rdiameter));
    }
 
  
    int diameter() { return diameter(root); }
 
    
    static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;
 
        
        return (1
                + Math.max(height(node.left),
                           height(node.right)));
    }
 
    // Driver Code
    public static void main(String args[])
    {
       
        root = new Node(1);
       root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
       root.left.right = new Node(5);
 
        // Function Call
        System.out.println(
            "The diameter: "
            + diameter());
    }
}
