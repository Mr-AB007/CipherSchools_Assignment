

class TreeNode
{
    int key;
    Node left, right;

    public TreeNode(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
    // Root of Binary Tree
    TreeNode root;

    BinaryTree()
    {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void postorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        postorder(node.left);

        // then recur on right subtree
        postorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void inorder(Node node)
    {
        if (node == null)
            return;

        inorder(node.left);

        System.out.print(node.key + " ");

        inorder(node.right);
    }

    void preorder(Node node)
    {
        if (node == null)
            return;

        System.out.print(node.key + " ");

        preorder(node.left);

        preorder(node.right);
    }

    void postorder()  {     postorder(root);  }
    void inorder()    {     inorder(root);   }
    void preorder()   {     preorder(root);  }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder ");
        tree.preorder();

        System.out.println("\nInorder ");
        tree.inorder();

        System.out.println("\nPostorder ");
        tree.postorder();
    }
}
