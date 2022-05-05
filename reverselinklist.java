class ReverseLinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;
		}
	}
	public void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			new_node.next = head;
			head = new_node;
		}
	}
	
	void display()
	{
		
	}
	
	public static void main(String args[])
	{
		ReverseLinkedList rl = new ReverseLinkedList();
		
		rl.insert(3);
		rl.insert(2);
		rl.insert(1);
		
		rl.display();
		
	}
}