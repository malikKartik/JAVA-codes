class LinkedList{
	static Node head;
	static class Node{
		int data;
		Node next;

		//constructor
		Node(int d){
			data = d;
			next = null;
		}
	}


	static void printList(Node head){
	Node n = head;
	while(n != null){
		System.out.print(n.data + " ");
		n = n.next;
		}
	}

	static void push(int new_data){
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}
	
	

	static void deletePos(int pos){
		//if linked list is empty
		if(head == null)return;

		Node temp = head;


		if(pos == 0){
			head = temp.next;
			return;
		}

		for(int i=0 ; temp!=null && i<pos-1;i++)
			temp = temp.next;

		if(temp == null || temp.next == null)
			return;
		
		Node next = temp.next.next;

		temp.next = next;
		
	}

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		head.next = second;
		second.next = third;
		push(5);
		printList(head);
		System.out.println();
		deletePos(2);
		printList(head);
	}
}