import java.io.*; 
class NearestSmaller{ 


static void Smaller(int []arr, int n) 
{ 
	
	// Always print empty or '_' 
	// for first element 
	System.out.print( "_, "); 

	// Start from second element 
	for (int i = 1; i < n; i++) 
	{ 
		// look for smaller 
		// element on left of 'i' 
		int j; 
		for(j = i - 1; j >= 0; j--) 
		{ 
			if (arr[j] < arr[i]) 
			{ 
				System.out.print(arr[j] + ", "); 
				break; 
			} 
		} 
		if (j == -1) 
		System.out.print( "_, ") ; 
	} 
} 

	// Driver Code 
	public static void main (String[] args) 
	{ 
		int []arr = {5, 3, 0, 2, 4}; 
		int n = arr.length; 
		Smaller(arr, n); 
	} 
} 
