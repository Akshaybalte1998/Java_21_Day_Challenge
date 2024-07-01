package comm.sort;

public class Mergesort 
{
	
	private static void printArray(int[] arr) 
	{
        System.out.print("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();	
	}
	private static void mergesort(int[] arr, int low, int high) 
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			System.out.println("first half:\tarr[0]:"+arr[low]+" \t arr["+mid+"]:"+arr[mid]);
			mergesort(arr,low,mid);
			System.out.println("second half:\tarr["+(mid+1)+"]:"+arr[mid+1]+"\t arr["+high+"]:"+arr[high]);
			mergesort(arr,mid+1, high);
		}
		else
		{
			return;
		}	
	}
	public static void main(String[] args) 
	{
		 int arr[] = { 12, 11, 13, 5, 6, 7 };

	        printArray(arr);
	        mergesort(arr,0,arr.length-1);
	        printArray(arr);
	}

	

	
}
