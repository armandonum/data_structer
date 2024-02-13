package arm.binaryTrees;

public class BinaryTree implements IBinaryTrees{
    BTNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new BTNode(data);
    }


    @Override
    public void insert(int data) {
        root = insertRec(root, data);
    }


    @Override
    public boolean search(int data) {
        return searchRec(root, data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNodeRec(root, data);
    }

    @Override
    public void delete(int data) {

    }

    @Override
    public int size() {
        return getsize(root);
    }

    @Override
    public int[] inOrder(BTNode node) {
        if (node == null) {
            return new int[0];
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
        return new int[0];
    }

    @Override
    public int[] preOrder(BTNode node) {
        if (node == null) {
            return new int[0];
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
        return new int[0];
    }

    @Override
    public int[] postOrder(BTNode node) {
        if (node == null) {
            return new int[0];
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
        return new int[0];
    }

    @Override
    public int height() {
        return height(root);
    }






    private BTNode insertRec(BTNode root, int data) {
        if (root == null) {
            return new BTNode(data);

        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    private static boolean searchRec(BTNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    private static BTNode getNodeRec(BTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            return getNodeRec(root.left, data);
        } else {
            return getNodeRec(root.right, data);
        }
    }

    private int getsize(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getsize(root.left) + getsize(root.right);
    }

    private static int height(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

}


