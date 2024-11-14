   /*a)Write a Java program to search for an element in 
   a given list of  elements using binary search mechanism. */
	class BinarySearchExample1{  
        public static int binarySearch(int arr[], int first, int last, int key){  
            if (last>=first){  
                int mid = first + (last - first)/2;  
                if (arr[mid] == key){  
                return mid;  
                }  
                if (arr[mid] > key){  
                return binarySearch(arr, first, mid-1, key);//search in left subarray  
                }else{  
                return binarySearch(arr, mid+1, last, key);//search in right subarray  
                }  
            }  
            return -1;  
        }  
        public static void main(String args[]){  
            int arr[] = {10,20,30,40,50};  
            int key = 30;  
            int last=arr.length-1;  
            int result = binarySearch(arr,0,last,key);  
            if (result == -1)  
                System.out.println("Element is not found!");  
            else  
                System.out.println("Element is found at index: "+result);  
        }  
    }
//b) Write a Java program to sort for an element in a given list of elements using bubble sort
class BubbleSortExample
{
	static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		int temp = 0;  
        for(int i=0; i < n; i++)
		{
			for(int j=1; j < (n-i); j++)
			{
				if(arr[j-1] > arr[j])
				{  
                //swap elements  
                  temp = arr[j-1];  
                  arr[j-1] = arr[j];  
                  arr[j] = temp;  
                }             
            }  
        }
    }
	public static void main(String[] args) 
	{
		int arr[] ={3,60,35,2,45,320,5};
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);//sorting array elements using bubble sort  
        
		System.out.println("Array After Bubble Sort");
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}        
    } 
}  	