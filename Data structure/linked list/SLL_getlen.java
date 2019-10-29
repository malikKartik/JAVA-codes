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
	
	

	static int getLenRec(Node node){
		if(node == null) return 0;

		return 1 + getLenRec(node.next);
	}

	static int getLen(){
		return getLenRec(head);
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
		System.out.println(getLen());
		
	}
}