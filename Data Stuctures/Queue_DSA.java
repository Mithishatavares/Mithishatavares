import java.util.*;

public class que {

	static int max_cap=10,key,item,size=0,i;
    static int queue[]= new int[10];
    static int rear = -1,front = -1; //empty queue
	public static void main(String[] args) 
	{
		
		int choice;
     do
		{
   System.out.print("Type no. of your choice.\n 1.Enqueue\n2.Dequeue\n3.Peek\n4.Search\n5.Count\n6.Replace\n 7.Display\n 8.Exit\n");
   Scanner sc = new Scanner(System.in);
   choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1:
                insert();
                //display();
                break;
            case 2:
                delete();
                break;
            case 3:
            	peek();
            	break;
            case 4:	
            	search();
            	break;
            case 5:
            	size();
                break;
            case 6:
            	replace();
            	break;
            case 7:
                display();
                break;
            case 8:
            	System.exit(0);
            	break;
            default: System.out.println("Invalid user choice");	
		    }
		}
       while(true);
	}
	
	public static void insert()
    {
		if(rear>=max_cap)
        {
            System.out.println("The queue is full");
        }
        else
        {   front = 0; 
        	rear = rear +1;
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("Enter element to be inserted ");
        	 item = sc.nextInt();
        	 queue[rear] = item;
        	 size = size+1;
        }
		 for(int i=0; i<=rear; i++)
	        {  
	            System.out.println(queue[i] + " ");
	        }
    
       }
	public static void delete()
	    {
	        if(front==-1)
	        {
	            System.out.println("Your queue is empty");
	        }
	        else
	        {
	            front=front+1;
	            item = queue[0];
	            size--;
	            System.out.println("The deleted element is "+item);
	        }
	    }
	 
	public static void display()
	    {
	        System.out.println("Elements present in queue:");
	        for(int i=front; i<=rear; i++)
	        {
	            System.out.println(queue[i]);
	        }
	    }   
	        
	        public static void peek()
		    {
	        	if(front==-1)
	        	{
		            System.out.println("Your queue is empty");
		        }
	        	else
	        	{
	        	 System.out.println("Element peeked " +queue[front]);
		        }    
		        
		    }    
	        
	        public static void search()
		    {
	        	Scanner sc = new Scanner(System.in);
	        	 System.out.println("Enter element to be searched: ");
	        	 key = sc.nextInt(); 
	        	 for(i = 0;i<max_cap; i++)
	        	 {
	        		 if(queue[i]==key)
	        		 {
	        			 System.out.println(+key +" is found at position " +i); 
	        		 }
	        	 } 
	        	 
	         }    
            
	        public static void size()
		    {
	        	if(front==-1)
	        	{
		            System.out.println("Your queue is empty");
		        }
	        	else
	        	{
	        	 System.out.println("Size of queue is " +size);
		        }    
		    }
	        	
	        
	        public static void replace()
		    {
	        	Scanner sc = new Scanner(System.in);
	        	 System.out.println("Enter old element to be replaced: ");
	        	 key = sc.nextInt(); 
	        	 System.out.println("Enter new element: ");
	        	 item = sc.nextInt(); 
	        	 
	        	 for(i = 0;i<max_cap; i++)
	        	 {
	        		 if(queue[i]==key)
	        		 {
	        			queue[i]=item;
	        			for(i=0;i<max_cap;i++)
	        			{
	        			System.out.println(+queue[i]);
	        			}
	        		 }
	        	 } 
		    }    
}
