package arm.Tests;
import arm.MergeSort.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testMergeSort {


    @Test
    public void testMergeSort4() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 3, 2, 1, 4, 6, 7, 8};
        int[] helper = new int[arr.length];
        mergeSort.mergeSort(arr, helper, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, arr);
    }

    @Test
    public void testMergeSort5() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 3, 2, 1, 4, 6, 7, 8, 9};
        int[] helper = new int[arr.length];
        mergeSort.mergeSort(arr, helper, 0, arr.length - 1);
    }
}