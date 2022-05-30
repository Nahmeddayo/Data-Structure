package LinkedList;

import javafx.scene.Group;
import javafx.scene.control.TextArea;

class Slinkedlist{
	
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.addF("Noman", 123456789, 23);
		li.addF("Asjad", 12, 20.5);
		li.addF("Arbaaz", 12, 15);
		li.display();
		
		
		System.out.println(li.search("Noman"));
		System.out.println(li.search(123456789));
		System.out.println(li.search(20.5));
	}
}
class Node1{
	
	public Node1 next;
	String name;
	int cnic;
	double age;
	Node1(){
		name="";
		cnic=0;
		age=0;
	}
	Node1(String name,int cnic,double age,Node1 n){
		this.age =age;
		next= n;
		this.name=name;
		this.cnic=cnic;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public double getAge() {
		return age;
	}
	public int getCnic() {
		return cnic;
	}
	
}
class LinkedList{
	
	Node1 head;
	Node1 tail;
	LinkedList(){
		head = tail=null;
	}
	void addF(String name,int cnic,double age) {
		
		
		if(search(cnic)==false) {
		
		
		Node1 node = new Node1(name,cnic,age,head);
		head= node;
		if(tail==null) {
			tail=node;	
		}
		}
		
			
	}
	String removeFirst() {
		if(head!=null) {
			head=head.next;
			return "Removed First\n";
		}
		else 
			return "linkedlist is Empty\n";
		
	}
	void addlast(String name,int cnic,double age) {
		Node1 nod= new Node1(name,cnic,age,null);
		if(tail==null) {
			head= tail=nod;
		}
		else {
			tail.next=nod;
			tail=nod;
		}
			
		               
	}
	void removelast() {
		Node1 n=head;
		while(n.next!=tail) {
			n=n.next;
		}
		n.next=null;
		tail=n;
	}
	void display() {
		Node1 n=head;
		while(n!=null) {
	//		System.out.println(n.data);
			System.out.println(" Name:"+n.name+"\tCNIC:"+n.getCnic()+"\tAge:"+n.getAge()+"");
			n= n.next;
			
		}
	}
	void display2(Group root, TextArea text) {
		Node1 n=head;
		while(n!=null) {
	//		System.out.println(n.data);
		//	System.out.println(" Name:"+n.name+"\tCNIC:"+n.getCnic()+"\tAge:"+n.getAge()+"");
			text.appendText(" Name:"+n.name+"\tCNIC:"+n.getCnic()+"\tAge:"+n.getAge()+"\n");
			n= n.next;
			
		}
		if(n==null) {
		text.appendText("\nNOne to show");
		}
	}
	String search(double age) {
		Node1 n=head;
		String data="\nRecord not found";
		while(n!=null) {
			if(n.getAge()==age)
			data= "\n[Found]-- Name:"+n.getName()+"\t\tCNIC:"+n.getCnic()+"\t\tAge:"+n.getAge()+"";
			n= n.next;
		}
		return data;
	}
	String search(String srch) {

		Node1 n=head;
		String data="Record not found\n";
		while(n!=null) {
			if(n.name.equals(srch))
			data= "\n[Found]-- Name:"+n.getName()+"\t\tCNIC:"+n.getCnic()+"\t\tAge:"+n.getAge()+"";
			
			n= n.next;
		}
		return data;
	}
	boolean search(int cnic) {
		Node1 n=head;
		String data="\nRecord not found";
		
		while(n!=null) {
			if(n.getCnic()==cnic)
				return true;
			n= n.next;
		}
		return false;
	}
	String searchf(String srch) {

		Node1 n=head;
		
		while(n!=null) {
			if(n.name.equals(srch))
			
			n= n.next;
		}
		return "";
	}
}


