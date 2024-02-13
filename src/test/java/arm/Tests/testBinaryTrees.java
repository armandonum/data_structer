package arm.Tests;


import org.junit.Assert;
import org.testng.annotations.Test;
import arm.binaryTrees.BinaryTree;
public class testBinaryTrees {
    @Test
    public void testBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);
        Assert.assertEquals(7, binaryTree.size());

    }
    @Test
    public void testSearchData() {
        BinaryTree binaryTree = new BinaryTree();
        Assert.assertFalse(binaryTree.search(5));
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);
        Assert.assertTrue(binaryTree.search(5));
        Assert.assertTrue(binaryTree.search(4));
        Assert.assertFalse(binaryTree.search(9));
    }

    @Test
    public void testGetNode(){
        int value=5;
        int value2=3;
        BinaryTree binaryTree2 = new BinaryTree(value);
        Assert.assertEquals(value, binaryTree2.getNode(value).data);
        binaryTree2.insert(value2);
        binaryTree2.insert(7);
        binaryTree2.insert(2);
        binaryTree2.insert(4);

        Assert.assertEquals(3,binaryTree2.getNode(3).data);

    }
}
