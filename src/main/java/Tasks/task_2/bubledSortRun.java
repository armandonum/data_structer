package Tasks.task_2;

public class bubledSortRun {

    public void run (){
        int[] array={28,11,12,7,4,23,15};
        bubledSort sort=new bubledSort();

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" - ");
        }
        sort.orderbubled(array,array.length);


        System.out.println();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" - ");
        }
    }


}
