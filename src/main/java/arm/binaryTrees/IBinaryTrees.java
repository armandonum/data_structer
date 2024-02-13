package arm.binaryTrees;

public interface IBinaryTrees {
    void insert(int data);

    boolean search(int data);

    BTNode getRoot();

    BTNode getNode(int data);

    void delete(int data);
    int size();

    int[] inOrder(BTNode node);
    int[] preOrder(BTNode node);

    int[] postOrder(BTNode node);
    int height();


}
