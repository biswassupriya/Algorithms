public class BubbleSorting {
    public static void main(String[] args){
        int[] array = {1,20,3,44,52,30,12,17,18,8,10,4,3};
        bubbleSort(array);
        System.out.println("sorted array");
        printArray(array);

    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        //big O notation with n power 2=> O(n Square)
        for(int i = 0;i < n-1; i++){ // nested for loop
            for(int j = 0; j < n-i-1 ; j++)
            if(array[j] > array[j+1])
            {
               //swap tem array and arr[i]
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    public static void printArray(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++)
            System.out.println(array[i]);
        System.out.println();
    }

}
