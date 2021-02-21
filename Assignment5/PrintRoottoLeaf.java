class   PrintRoottoLeaf
{ 
    TreeNode root; 
       
    
    void printPaths(TreeNode node)  
    { 
        int path[] = new int[1000]; 
        printPathsRecur(node, path, 0); 
    } 
   
    
    static void printPathsRecur(TreeNode node, int path[], int pathLen)  
    { 
        if (node == null) 
            return; 
   
        path[pathLen] = node.data; 
        pathLen++; 
   
        
        if (node.left == null && node.right == null) 
            printArray(path, pathLen); 
        else 
        { 
            
            printPathsRecur(node.left, path, pathLen); 
            printPathsRecur(node.right, path, pathLen); 
        } 
    } 
   

    static void printArray(int ints[], int len)  
    { 
        int i; 
        for (i = 0; i < len; i++)  
        { 
            System.out.print(ints[i] + " "); 
        } 
        System.out.println(""); 
    } 
   
    
    public static void main(String args[])  
    { 
       
        root = new Node(10); 
        root.left = new Node(8); 
        root.right = new Node(2); 
        root.left.left = new Node(3); 
        root.left.right = new Node(5); 
        root.right.left = new Node(2); 
          
        printPaths(tree.root); 
    } 
} 
