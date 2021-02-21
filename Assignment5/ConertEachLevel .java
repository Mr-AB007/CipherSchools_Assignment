class ConertEachLevel 
{ 
    TreeNode root; 
       
    
    TreeNode head; 
    
    static TreeNode prev = null; 
   
   
    static void BinaryTree2DoubleLinkedList(TreeNode root)  
    { 
        // Base case 
        if (root == null) 
            return; 
   
        
        BinaryTree2DoubleLinkedList(root.left); 
   
        // Now convert this node 
        if (prev == null)  
            head = root; 
        else
        { 
            root.left = prev; 
            prev.right = root; 
        } 
        prev = root; 
   
        BinaryTree2DoubleLinkedList(root.right); 
    } 
   
   
   static void printList(TreeNode node) 
    { 
        while (node != null)  
        { 
            System.out.print(node.data + " "); 
            node = node.right; 
        } 
    } 
   
    
    public static void main(String[] args)  
    { 
       
       root = new TreeNode(10); 
       root.left = new TreeNode(12); 
       root.right = new TreeNode(15); 
       root.left.left = new TreeNode(25); 
       root.left.right = new TreeNode(30); 
       root.right.left = new TreeNode(36); 
   
        
        BinaryTree2DoubleLinkedList(tree.root); 
           
        // Print the converted List 
        printList(tree.head); 
   
    } 
}
