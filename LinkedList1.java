/*** Classe LinkedList1***/
public class LinkedList1 {
/**
* The nested class Node
*/
 private static class Node {
 String value;
 Node next;
 }
// Instance variable
/**
* A pointer to the first node in the linked list. If the list is empty, the value is null.
*/
private Node head;
//Instance méthods
 /**
 * Searches the list for a specified item.
 * @param obj the item that is to be searched for
 * @return true if obj is one of the items in the list or false if not
 */
 public boolean find(String obj) {
 Node p; // A pointer for traversing the list.
 p = head; // Start by looking at the head of the list.
 if(p!= null) {
			while(p.next != null && !p.value.equals(obj)) {
				p = p.next;
			}
			return p.value.equals(obj);
		} else {
			return false;
		}
 } // end of find()
/**
 * Remove a specified item (obj) from the list, if that item is present.
 */
		 public boolean remove(String obj) {
			boolean a=false;
				 if ( head == null ) {
					 // The list is empty.
					throw new NullPointerException("empty list");
				 }else if ( head.value.equals(obj) ) {
					 // obj is the first item of the list. 
					head=head.next;
					a=true;
				}else {
					Node p;
					p=head.next;
					Node previous=head;
					while(p!=null) {
						if(p.value.equals(obj)) {
							previous.next=p.next;
							return true;
						}
						previous=p;
						p=p.next;
					}
				}
		return false;
		} // end of remove()
 
/**
 * Add a specified item (obj ) to the list, keeping the list in order.
 *
 */
 public void add(String obj) {
 Node newNode; // A Node to contain the new item.
 newNode = new Node();
 newNode.value = obj; // newNode.next is null.
 if ( head == null ) {
 // The new item is the first (and only) one in the list.
	 head=newNode;
	 head.next=null;
}else if ( head.value.compareTo(obj)>=0) {
 // The new item is less than the first item in the list,
 // so it has to be inserted at the head of the list.
 Node h=head;
 head=newNode;
 head.next=newNode.next;
 newNode.next=h;
}else {
	Node prev = head;
    Node curr = head;
    while (curr != null && obj.compareTo(curr.value) >= 0) {
        prev = curr;
        curr = curr.next;
    }
    newNode.next = prev.next;
    prev.next = newNode;
    curr = newNode;
}
 } // end of add()

 /**
 * Returns an array that contains all the elements in the list.
 * If the list is empty, the return value is an array of length zero.
 */
 public String[] getList() {
 int count; // For counting elements in the list.
 Node p; // For traversing the list.
 String[] elements;
 count = 0;
 p = head;
 while (p != null) {
	 count++;
	 p=p.next;
	 }
 elements= new String[count];
 Node k=head;
 for(int i=0;i<count;i++) {
		 elements[i]=k.value;
		 k=k.next;
 }
 return elements;
 } // end of getList()
} // end of LinkedList1 class