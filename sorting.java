import java.util.*;

public class sorting
{  static Scanner sc = new Scanner(System.in);
	static void bubble()
	{
       
		System.out.println("Enter size of list");
         int N = sc.nextInt();
         int A[] = new int[N+1];
         int B[] = new int[N+1];
         int i,j,temp=0;
         
         System.out.println("Enter elements of list");
         
         for(i=0;i<N;i++)
         {
             A[i]= sc.nextInt();
         }
         for(i=0;i<N;i++)
         {
             B[i]= A[i];
         }
         for(i=0;i<N-1;i++)
         {
             for(j=0;j<N-1-i;j++)
             {
                 if(A[j] > A[j+1])
                 {
                     temp = A[j];
                     A[j] = A[j+1];
                     A[j+1]= temp;
                  }
             }
         }
         System.out.print("The original list is: ");
         for(i=0;i<N;i++)
         {
        	 System.out.print(+B[i]+ " " );
         }
         System.out.println();
         System.out.print("The sorted list using bubble sort is: ");
         for(i=0;i<N;i++)
         {
        	 System.out.print(+A[i] +" " );
         }
    }
	
	
	static void mergesort (int A[ ] , int start , int end )
	   {
	           if( start < end ) {
	           int mid = (start + end ) / 2 ;           
	           mergesort (A, start , mid ) ;             
	           mergesort (A,mid+1 , end ) ;              

	         
	          merge(A,start , mid , end );   
	   }                    
	}    
	
	static void merge(int A[ ] , int start, int mid, int end)
	{
			 
			int p = start ,q = mid+1;
         
			int Arr[]= new int [end-start+1];
			int k=0;

			for(int i = start ;i <= end ;i++) {
			    if(p > mid)      
			       Arr[ k++ ] = A[ q++] ;

			   else if ( q > end) 
			       Arr[ k++ ] = A[ p++ ];

			   else if( A[ p ] < A[ q ])    
			      Arr[ k++ ] = A[ p++ ];

			   else
			      Arr[ k++ ] = A[ q++];
			 }
			  for( p=0 ; p< k ;p ++) {
			   
	
			     A[ start++ ] = Arr[ p ] ;                          
			  }
			}
		
			
	
		  static int quickpartition(int array[], int low, int high)
		  {
		    int pivot = array[high];
		    int i = (low - 1);

		  
		    for (int j = low; j < high; j++) {
		      if (array[j] <= pivot) {

		        i++;

		       
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }

		    }

		    
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;

		   
		    return (i + 1);
		  }

		  static void quickSort(int array[], int low, int high) {
		      if (low < high) {
		      int pi = quickpartition(array, low, high);
		    
		      quickSort(array, low, pi - 1);
		      quickSort(array, pi + 1, high);
		    }
		 
		  }
		
 


	
	public static void main(String[]args)
	{   
		
		
		while(true)
		{
			System.out.println("\n Enter your choice: ");
			System.out.println("1. BUBBLE SORT");
			System.out.println("2. MERGE SORT ");
			System.out.println("3. QUICK SORT ");
			System.out.println("4. EXIT ");
			
		    int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
		bubble();
		break;
		
		
	
        case 2:
 	    int a[] = {6,7,8,9,3,4,2,1};
 	    
 	    System.out.print("The origanl list is: ");
 	    for(int i =0; i< a.length; i++){
 	        System.out.print(a[i]+" ");
 	    }
 	   System.out.println();
 	    mergesort(a,0,a.length-1);
 	    System.out.print("The sorted list using merge sort is: ");
 	    for(int i =0; i< a.length; i++){
             System.out.print(a[i]+" ");
 	   }
	    break;
	    
		case 3: 
			int b[] = {7,3,9,6,4,1};
	 	    
	 	    System.out.print("The origanl list is: ");
	 	    for(int i =0; i< b.length; i++){
	 	        System.out.print(b[i]+" ");
	 	    }
	 	   System.out.println();
	 	    quickSort(b,0,b.length-1);
	 	    System.out.print("The sorted list using quick sort is: ");
	 	    for(int i =0; i< b.length; i++){
	             System.out.print(b[i]+" ");
	 	   }
		
		break;
		
		case 4: System.exit(0);
		}
		
		}}}
