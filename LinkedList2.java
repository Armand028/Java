/*** Classe LinkedList2***/
public class LinkedList2 {
	 /**
	 * Objects of type Node are linked together into linked lists.
	 */
	
		static int count=0;
		static int coun=0;
		private static class Node {
		int value; // value of an item in the list.
		Node next; // Pointer to the next node in the list.
		}
	
	 /**
	 * Return a new list containing the same items as the list,
	 * but in the reverse order.
	 */	
	 static Node reverse( Node obj ) {
		 Node reverse = null; // reverse will be the reversed list
		 Node p = obj;
		 if(p==null || p.next==null) {
			 return p;
		 	}
			 while (p!= null) {
			 // Push the next node of list onto the front of reverse.
			        Node nex = p.next;		     
			        p.next = reverse;
			        reverse =p;
			        p = nex;
		 }
			 return reverse;
	 }// end reverse()
	/**
	 * Displays the items in the list to which the parameter, first, points.
	 * They are printed on one line, separated by spaces
	 */
	 static void display(Node first){
	 Node p; // For traversing the list.
	 p = first;
	 while(p!=null){
	 System.out.print("  "+p.value);
	 p=p.next;
	 }
	 } // end of display()
	/**
	 * Return the number of zeros that occur in a given linked list of int.
	 */
	static int count( Node head ){
	while(head!=null){
		if(head.value==0){
			coun=coun+1;
		}
		head=head.next;
	}
	return coun;
	} // end of count()
	/**
	 * Return the number of zeros that occur in a given linked list of int. Uses recursion
	 */
	static int countRecursive( Node head ) {
	if(head==null) {
		return count;
		}
	if(head.value==0) {
		count++;
	}
	return countRecursive(head.next);
	} // end countRecursive()
	/*** main program** */
	public static void main(String[] args) {
	
	 Node list = null; // A list, initially empty.
	 Node reverseList; // The reversed list.
	 int count = 0; // The number of elements in the list
	 while (true) {
	 // add a new node onto the head of the list before repeating.
	 count++;
	 if (count == 10)
	 break;
	 Node head = new Node(); // A new node to add to the list.
	 head.value = (int)(Math.random()*100); // A random value.
	 head.next = list;
	 list = head;
	 }
	 // Print the current list ; its reverse and the number of zeros in the list using both methods
	 System.out.print("The list: ");
	 display(list);
	 System.out.println();
	 int a=count(list);
	 int b=countRecursive(list);
	 reverseList = reverse(list);
	 System.out.print("The reversed list: ");
	 display(reverseList);
	 System.out.println();
	 System.out.println();
	 System.out.print("The number of zeros in the list : ");
	 System.out.println(a);
	 System.out.print("The number of zeros in the list, using recursion : ");
	 System.out.println(b);
	 
	} // end of main()
	
} // end of LinkedList2 class