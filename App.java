import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[]=createRandomArray(10);
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        
    }
    public static int[] createRandomArray(int arrayLength){
        Random rd = new Random(); // creating Random object
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(100); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element
      }
      return arr;
    }
        
    
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                                }  
                        }
                    }
                }
                  
            
}
    
