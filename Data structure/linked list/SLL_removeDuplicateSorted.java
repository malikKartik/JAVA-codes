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


	static void printList(){
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

	static void removeDuplis(){
		Node curr = head;
		while(curr != null){
			Node temp = curr;

			while(temp!= null && temp.data == curr.data){
				temp = temp.next;
			}

			curr.next = temp;
			curr = curr.next;
			
		}
	}

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		push(2);
		push(2);
		push(1);
		printList();
		System.out.println();
		System.out.println(getLen());
		removeDuplis();
		printList();
		
	}
}