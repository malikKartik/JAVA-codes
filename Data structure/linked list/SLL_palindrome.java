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

	static boolean isPalindrome(Node head){
		int[] arr = new int[getLen()];
		int count = 0;
		Node temp = head;

		while(temp != null){
			arr[count] = temp.data;
			count++;
			temp = temp.next;
		}
		for(int i = 0;i<getLen()/2;i++){
			if(arr[i]!=arr[getLen()-i-1]){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		push(2);
		push(2);
		push(1);
		printList(head);
		System.out.println();
		System.out.println(getLen());
		if(isPalindrome(head)){
			System.out.println("Is palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		
	}
}