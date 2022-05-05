class InsertionSort
{
	
	public static void insertionSort(int n,int a1[])
	{
		int i;
		int j;
		
			int temp = a1[n];
			
		for(j=n-1; j>0; j--)
		{
			if(a1[j]<temp)
			{
				a1[j+1] = a1[j];
			}
		}	
	}
	
	public void display(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(a1[1]+" ");
		}
	}
	
	public static void main(String args[])
	{
		InsertionSort IS = new InsertionSort();
		
		int arr[] = {1,2,4,5,3};
		
		int size = arr.length;
		
		insertionSort(size,arr[]);
		
		IS.display(size);
		
	}
}