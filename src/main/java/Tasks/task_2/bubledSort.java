package Tasks.task_2;

public class bubledSort {
 public static void orderbubled(int [] array,int n){
     int aux;

         for(int i=1;i<n;i++){
             if(array[i]< array[i-1]){
                 aux=array[i];
                 array[i]=array[i-1];
                 array[i-1]=aux;
             }
         }
         if(n==0){
             return;
         }
            orderbubled(array,n-1);

 }
}
