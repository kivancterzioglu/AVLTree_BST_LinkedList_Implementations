package LinkedList;

import java.util.Random;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
	int value;
	Node next;
	
		Node(int value){
			this.value = value;
		}
	}	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}
	
	
	public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    
    public void makeEmpty() {
        head = null;    
        tail = null;
        length = 0;
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void append(int value) {
    	Node newNode = new Node(value);
    	if(this.length == 0) {
    	  this.head = newNode;
    	  this.tail= newNode;
    	}
    	else {
    		tail.next = newNode;
    		tail = newNode;
    	}
    	length++;
    		
    }
    public Node removeLast() {
    	Node temp = head;
    	Node pre = head;
    	
    	if(this.length == 0) {
    		return null;
    	}
    	while(temp.next != null) {
    		pre = temp;
    		temp = temp.next;
    	}
    	this.tail = pre;
    	tail.next = null;
    	length--;
    	if(length==0) {
    		this.head=null;
    		this.tail=null;
    	}
    	return temp;
    }
    public void prepend(int value) {
    	Node newNode = new Node(value);
    	if(length==0) {
    		head=newNode;
    		tail= newNode;
    	}
    	else {
    		newNode.next = head;
    		head = newNode;
    	}
    	length++;
    }
    
    public Node removeFirst() {
    	
    	if(length==0) {
    		return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
    	}
    	return temp;
    }

	public void searchingRandomNode(int count) {
        int[] numberArray = new int[count+1]; 

        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt();
        }
        
        
        for (int i = 0; i < numberArray.length; i++) {
            contains( numberArray[i]); 
        }
    }

	public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
	
    public Node get(int index) {
    	if(index < 0 || index >=this.length) {
    		return null;
    	}
    	Node temp = head;
    	for(int i=0; i<index; i++) {
    		temp=temp.next;
    	}
    	return temp;
    }
    
    public boolean set(int index, int value) {
    	Node temp = get(index);
    	if(temp != null) {
    		temp.value = value;
    		return true;
    	}
    	return false;
    }
    
    public boolean insert(int index, int value) {
    	
    	if(index < 0 || index >length) {
    		return false; 
    	}
    	else if(index == length) {
    		append(value);
    		return true;
    	}
    	else if (index == 0) {
    		prepend(value);
    		return true;
    	}
    	Node newNode = new Node(value);
    	Node temp = get(index-1);
    	newNode.next = temp.next;
    	temp.next = newNode;
    	length++;
    	return true;
    }
    public Node remove(int index) {
    	if(index < 0 || index >= length)
    		return null;
    	if(index==0)
    		return removeFirst();
    	if(index ==length-1)
    		return removeLast();
    	
    	Node prev = get(index-1);
    	Node temp = prev.next;
    	
    	prev.next = temp.next;
    	temp.next = null;
    	length--;
    	return temp;
    }

    public void insertRandomNode(int count) {
        int[] numberArray = new int[count+1]; // -50'den +50'ye kadar 101 eleman var

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = -(count/2) + i;
        }
        
        // Array'i yazdırma
        System.out.println("Number Array Elemanları:");
        for (int i = 0; i < numberArray.length; i++) {
           append(numberArray[i]);
            
        }
    }

    public void deleteRandomNode(int count) {
        int[] numberArray = new int[count+1]; 

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = -(count/2) + i;
        }
        
        
        for (int i = 0; i < numberArray.length; i++) {
           remove(numberArray[i]);
            
        }
    }

}
