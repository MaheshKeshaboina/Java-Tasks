public class Sorting {
    
    public static void printArray(int arr[]){
        int arr[]={7,3,8,2,1};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }
    System.out.println();
    public static void maiun(String args[]){
    
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        printArray(arr);
    }
}
    
     
