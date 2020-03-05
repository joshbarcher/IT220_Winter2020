package bst;

public class TestBST
{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(8);
        tree.add(4);
        tree.add(18);
        tree.add(42);
        tree.add(23);
        tree.add(10);

        System.out.println("Size of tree: " + tree.size());
    }
}
