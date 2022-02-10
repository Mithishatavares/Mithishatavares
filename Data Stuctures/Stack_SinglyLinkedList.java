import java.util.*;

public class stack
{   int data; 
    stack next;
	public static void main(String[] args) 
	{
    stack s = new stack();
    Scanner sc = new Scanner(System.in);

 while(true)
	{
	 
		System.out.println("\n Enter your choice: ");
		System.out.println("1. PUSH");
		System.out.println("2. POP ");
		System.out.println("3. PEEK ");
		System.out.println("4. COUNT");
		
		System.out.println("5. FIND ");		
		System.out.println("6. REPLACE ");
		System.out.println("7. DISPLAY");
		System.out.println("8. Exit");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		  case 1:
			  System.out.println("Enter data to be pushed: ");
			  int data = sc.nextInt();
		      s.push(data);
		    break;
		  case 2 :
			  s.pop();
			  break;
		  case 3:
			  s.peek();
			  break;
		  case 4:
			  s.count();
			  break;
		  case 5:
			  System.out.println("Enter data to be searched: ");
			  int key = sc.nextInt();
			  s.find(key);
			  break;
		  case 6:
			  System.out.println("Enter data to be replaced: ");
			  int data1= sc.nextInt();
			  System.out.println("Enter new data ");
			  int data2 = sc.nextInt();
			  s.replace(data1, data2);
			  break;
		  case 7:
			  s.display();
			  break;
		  case 8:
			  System.exit(0);
			  break;
		}	
	}
}


stack top = null; 
int count = 0; 

public void push(int data)
{   
	if(top==null)
	{   stack t = new stack();
        t.data = data;
        top = t;
		t.next = null;
		count = count +1;
	}
	else
	{   
		stack t = new stack();
	    t.data = data;
		t.next = top;
		top = t;
		count = count +1;
	}
	
}

public void pop()
{
	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else
	{  
		System.out.println(+top.data +" is popped");
		top = top.next;
		count = count - 1;
	}
}

public void peek()
{
	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else 
	{
		System.out.println(+top.data +" is peeked");
	}
}

public void count()
{
	System.out.println(+count +" elements are present in stack");
}

public void find(int data)
{
	int pos=1,flag = 1;
	stack c = top;
	for(c = top;c!=null;c =c.next)
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
		System.out.println(+c.data +" is found in stack " +pos);
	}
	else
	{
    System.out.println("Element not found!!");
	} 
}

public void replace(int data,int newdata)
{
	stack c = top;
	int flag = 0;
	for(c =top; c!=null; c = c.next)
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
	stack c = top;
	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else 
	{
		for(c = top; c!=null;c =c.next)
		{
			System.out.println(+c.data);
		}
		
	}
	
}
}
	
