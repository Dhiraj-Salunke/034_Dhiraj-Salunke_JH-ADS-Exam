class Stack
{
	int ar[];
	int n;
	int top;
	
	Stack(int size)
	{
		n = size;
		ar = [n];
		top1 = n/2;
		top2 = n/2+1;
	}
	
	void push1(int x)
	{
		if(top1> = n)
		{
			System.out.println("Overflow");
		}
		else
		{
			ar[top1--] = x;
		}
	}
	
	void push2(int x)
	{
		if(top2>=n)
		{
			System.out.println("Overflow");
		}
		else
		{
			ar[top2++] = x;
		}
	}
	
	int pop1()
	{
		if(top1>0)
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			int p = ar[top1++];
			return p;
		}
	}
	
	int pop2()
	{
		if(top2>=n/2+1)
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			int p = ar[top2--];
			return p;
		}
	}
	
	public static void main(String args[])
	{
		Stack st = new Stack(10);
		
		
		st.push1(5); 
		st.push2(10); 
		st.push2(15); 
		st.push1(11); 
		st.push2(7); 
		st.push2(40);
	}
}