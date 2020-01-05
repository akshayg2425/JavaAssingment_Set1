package Assingment1;



public class A1 {

	//ASSignment 3
	public static void main(String[] args) 
	{ 
		A2 maxdif = new A2(); 
		int arr[] = {2,3,4,2,3}; 
		System.out.println("Maximum differnce is " + 
								maxdif.maxDiff(arr, 5)); 
		
		
	} 
		// Java program to find Maximum difference 
		// between two elements such that larger 
		// element appears after the smaller number 
		
		
			/* The function assumes that there are at least two 
			elements in array. 
			The function returns a negative value if the array is 
			sorted in decreasing order. 
			Returns 0 if elements are equal */
			int maxDiff(int arr[], int arr_size) 
			{ 
				int max_diff = arr[1] - arr[0]; 
				int i, j; 
				for (i = 0; i < arr_size; i++) 
				{ 
					for (j = i + 1; j < arr_size; j++) 
					{ 
						if (arr[j] - arr[i] > max_diff) 
							max_diff = arr[j] - arr[i]; 
					} 
				} 
				return max_diff; 
			} 

			/* Driver program to test above functions */
		
		

		// This code has been contributed by Mayank Jaiswal 

		
		
		
		
		
		
	/*	public  A1 Methode()
		{
			
			
			int[] newarray = new int[5];
			
			newarray [0] = 2 ;
			newarray [1] = 3 ;
			newarray [2] = 4 ;
			newarray [3] = 2 ;
			newarray [4] = 3 ;
			
			
			
			
			
			
		int size = newarray.length;
		
		int maxdiff = newarray[1] - newarray[0];
		
		for(int i = 0 ; i< size ; i++)
		{
			for(int j = i + 1 ;j < size; j++)
			{
				
				if (newarray[j] - newarray[i] > maxdiff)
				{
					maxdiff = newarray[j] - newarray[i];
					if(newarray[j] > newarray[i])
					{
						return j;
					}
					else
					{
						return i;
					}
						
				}
			
			}
			
		}
		
		}*/
	//	System.out.println(Arrays.toString(newarray));
		
/*		int digit = newarray[0] - newarray[1];   
		int digit1 = newarray[1] - newarray[2];
		int digit2 = newarray[2] - newarray[3];
		int digit3 = newarray[3] - newarray[4];
		*/
		
		// System.out.println(digit); 
		
		
		
		
	}


