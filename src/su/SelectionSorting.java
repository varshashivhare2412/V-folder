package su;

public class SelectionSorting {
	
	  	public static void main(String[] args) {
	  		 int arr[]= {24,42,34,56,21,12};
	  		 System.out.print("Array before sorting : ");
	  		 for(int i=0; i<arr.length;i++) {
	  		 System.out.print(arr[i]+" ");
	  		 }
	  		 
	  		 swap (arr);
	  		 System.out.println();
	  		 System.out.print("Array before sorting : ");
	  		 for (int j = 0; j < arr.length; j++) {
	  		 System.out.print(arr[j]+" ");
	  		 }
	  	}
	  public static void swap(int arr[])	
	  {
	  	for (int i = 0; i < arr.length-1; i++) 
	  	{
	  		for (int j = i+1; j < arr.length; j++) 
	  		{
	  			if(arr[i]>arr[j]) 
	  			{
	  			arr[i]=arr[i]+arr[j];
	  			arr[j]=arr[i]-arr[j];
	  			arr[i]=arr[i]-arr[j];
	  			}
	  		}
	  	}
	  }

}
 