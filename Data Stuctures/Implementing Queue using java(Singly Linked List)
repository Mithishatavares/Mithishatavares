package sll;

import java.util.Scanner;

public class queue 
{       int data; 
	    queue next;
	    
 public static void main(String[] args) 
 {   Scanner sc = new Scanner(System.in);
     queue q = new queue();
	 while(true)
		{
			System.out.println("\n Enter your choice: ");
			System.out.println("1. ENQUEUE");
			System.out.println("2. DEQUEUE ");
			System.out.println("3. PEEK ");
			System.out.println("4. COUNT");
			
			System.out.println("5. FIND ");		
			System.out.println("6. REPLACE ");
			System.out.println("7. DISPLAY");
			System.out.println("8. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				  System.out.println("Enter data to be pushed: ");
				  int data = sc.nextInt();
			     q.enqueue(data);
			    break;
			  case 2 :
				  q.dequeue();
				  break;
			  case 3:
				  q.peek();
				  break;
			  case 4:
				  q.size();
				  break;
			  case 5:
				  System.out.println("Enter data to be searched: ");
				  int key = sc.nextInt();
				  q.find(key);
				  break;
			  case 6:
				  System.out.println("Enter data to be replaced: ");
				  int data1= sc.nextInt();
				  System.out.println("Enter new data ");
				  int data2 = sc.nextInt();
				  q.replace(data1, data2);
				  break;
			  case 7:
				  q.display();
				  break;
			  case 8:
				  System.exit(0);
				  break;
			  default: System.out.println("Invalid choice ");
			}
			}
			}
 queue head = null, tail = null;
 int size = 0;
 public void enqueue(int data)
 {
	 
	    if(head==null)
		{ queue t = new queue();
	       t.data = data;
			head = tail = t;
			t.next = null;
			size = size +1;
		}
		else
		{   queue t = new queue();
	        t.data = data;
			queue c = head;
			while(c.next!=null)
			{
				c = c.next;
			}
			c.next = t;
			tail = t;
			size = size +1;
		}
		
	}
 
 public void dequeue()
 {
	 if(head==null)
		{
			System.out.println("Queue is empty");
		}
		else
			System.out.println(+head.data +" is dequeued");
		{  head = head.next;
		size = size -1;
	    }
 }
 
 public void peek()
	{
		if(head==null)
		{
			System.out.println("Queue is empty");
		}
		else 
		{
			System.out.println(+head.data +" is peeked");
		}
	}
	
	public void size()
	{
		System.out.println(+size +" elements are present in queue");
	}
	
	public void find(int data)
	{
		int pos=1,flag = 1;
		queue c = head;
		for(c = head;c!=null;c =c.next)
		{
			if(c.data == data)
			{
				flag = 1;
				break;
			} 
			pos = pos +1;
		}
		if(flag == 1)
		{
			System.out.println(+c.data +" is found in queue " +pos);
		}
		else
		{
	    System.out.println("Element not found!!");
		} 
	}
	
	public void replace(int data,int newdata)
	{
		queue c = head;
		int flag = 0;
		for(c =head; c!=null; c = c.next)
		{
			if(c.data==data)
			{   c.data = newdata;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println(+data +" is replaced with " +newdata);
		}
		else
	    {System.out.println("Element not found!!");}
		 
	}
	

	public void display()
	{
		queue c = head;
		if(head==null)
		{
			System.out.println("Queue is empty");
		}
		else 
		{
			for(c = head; c!=null;c = c.next)
			{
				 System.out.print(+c.data +" ");
			}
		}
		
	}
}
