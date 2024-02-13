package arm.binaryTrees;

public class BTNode {
    public int data;
    BTNode left;
    BTNode right;


    public BTNode(int data){
        this.data = data;
        left = null;
        right = null;

    }
    public boolean isLeafNode(){
        return left == null && right == null;
    }
}
