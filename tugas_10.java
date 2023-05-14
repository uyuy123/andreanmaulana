public class tugas_10 {
    public static void main(String[] args) throws Exception{
        // Bubble sort
        int[] arr = {64,34,25,122,22,11,90};
        bubbleSort(arr, "asc");
        System.out.println("Array setelah diurutkan ascending:");
        printArray(arr);
        
        int[] arr2 = {64,34,25,122,22,11,90};
        bubbleSort(arr2, "desc");
        System.out.println("Array setelah diurutkan descending:");
        printArray(arr2);
        
        // Insertion sort
        int[] arr3 = {64,34,25,122,22,11,90};
        insertionSort(arr3, "asc");
        System.out.println("Array setelah diurutkan ascending:");
        printArray(arr3);  
        
        int[] arr4 = {64,34,25,122,22,11,90};
        insertionSort(arr4, "desc");
        System.out.println("Array setelah diurutkan descending:");
        printArray(arr4);
        
        // Selection sort
        int[] arr5 = {64,34,25,122,22,11,90};
        selectionSort(arr5, "asc");
        System.out.println("Array setelah diurutkan ascending:");
        printArray(arr5);
        
        int[] arr6 = {64,34,25,122,22,11,90};
        selectionSort(arr6, "desc");
        System.out.println("Array setelah diurutkan descending:");
        printArray(arr6);
        
    }  
    
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0;i< n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] arr, String param){
        int n = arr.length;
        for(int i = 0; i < n -1;i++){
            for(int j = 0;j < n-1; j++){
                if (param=="asc" && arr[j] > arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else if (param=="desc" && arr[j] < arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void insertionSort(int[] arr, String param){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            if (param=="asc"){
                while (j>=0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j = j-1;
                }
            } else if (param=="desc"){
                while (j>=0 && arr[j] < key){
                    arr[j+1] = arr[j];
                    j = j-1;
                } 
            }
            arr[j+1] = key;
        }
    }
    
    public static void selectionSort(int[] arr, String param){
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++){
            pos = i;
            if (param=="asc"){
                for (int j = i+1;j < arr.length; j++){
                    if (arr[j] < arr[pos]){
                        pos = j;
                    }
                }
            } else if (param=="desc"){
                for (int j = i+1;j < arr.length; j++){
                    if (arr[j] > arr[pos]){
                        pos = j;
                    }
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
}
