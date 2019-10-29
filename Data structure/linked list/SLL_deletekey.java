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
	
	

	static void deleteKey(int key){
		Node temp = head, prev = null;
		//if head contains the key
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}

		//if key not found jump prev to current(temp) element and temp(current) to next element
		while(temp!= null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}

		if(temp == null) return;
		prev.next = temp.next;
		return;
		
	}

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		head.next = second;
		second.next = third;
		push(5);
		deleteKey(2);
		printList(head);
	}
}