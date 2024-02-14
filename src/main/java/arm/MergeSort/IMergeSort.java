package arm.MergeSort;

public interface IMergeSort {
 int size();
void mergeSort(int []arr,int[] helper, int low,int high);
void merge(int []arr,int[] helper, int low,int middle,int high);

    void quickSort(int[] array2);
}
