package BinarySearch;

import java.util.ArrayList;

public class BTrees {
public static Node root;
	
	ArrayList<String> aa=new ArrayList();
	public BTrees(){
		this.root = null;
	}
	
	public boolean find(String id){
		Node current = root;
		while(current!=null){
			if(current.name.equals(id)){
				return true;
			}
		else if(current.name.length()>id.length()){
			current = current.left;
		}
		else
		{
			current = current.right;
		}
	}
		return false;
	}
public boolean delete(String id){
	aa.remove(id);
	Node parent = root;
	Node current = root;
	boolean isLeftChild = false;
	try {
		while(!current.name.equals(id)){
			parent = current;
			if(current.name.length()>id.length()){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
//if i am here that means we have found the node
//Case 1: if node to be deleted has no children
	if(current.left==null && current.right==null){
		if(current==root){
			root = null;
		}
		if(isLeftChild ==true){
			parent.left = null;
		}else{
			parent.right = null;
		}
}
//Case 2 : if node to be deleted has only one child
	else if(current.right==null){
		if(current==root){
			root = current.left;
		}else if(isLeftChild){
			parent.left = current.left;
		}else{
			parent.right = current.left;
		}
	}
	else if(current.left==null){
		if(current==root){
			root = current.right;
		}else if(isLeftChild){
			parent.left = current.right;
		}else{
			parent.right = current.right;
		}
	}else if(current.left!=null && current.right!=null){
	//now we have found the minimum element in the right sub tree
	Node successor = getSuccessor(current);
	if(current==root){
		root = successor;
	}else if(isLeftChild){
		parent.left = successor;
	}
	else{
		parent.right = successor;
	}
		successor.left = current.left;
	}
		return true;
	}
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
	//check if successor has the right child, it cannot have left child for sure
	// if it does have the right child, add it to the left of successorParent.
	// successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
	public String insert(String name){
		Node newNode = new Node(name);
		if(root==null)
		{
			root = newNode;
			return name;
		}
		Node current = root;
		Node parent = null;
	while(true){
		
	parent = current;
	if(name.length()<current.name.length()){
	current = current.left;
	
	if(current==null){
	parent.left = newNode;
	return name;
	}
	}else{
	current = current.right;
	
	if(current==null){
	parent.right = newNode;
	return name;
	}
	}
	}
	}
	public void display(Node root){
	
	if(root!=null){
	display(root.left);
	//System.out.print(" " + root.name);
	aa.add(root.name);
	display(root.right);
	}
	
	}
	public void displaypre(Node root){
		
		if(root!=null){
		aa.add(root.name);
		display(root.left);
		display(root.right);
		}
		
		}
	public void displaypost(Node root){
		
		if(root!=null){
		display(root.left);
		display(root.right);
		aa.add(root.name);
		}
		
		}
	public static void main(String arg[]){
		BTrees b = new BTrees();
		b.insert("Noman");
		b.insert("Arbaaz");
		b.insert("Asjad");
		b.insert("Qadeer");
		b.insert("Saad");
		b.insert("Sikenadr");
		b.display(root);
		
	
	}
	}
	class Node{
	String name;
	Node left;
	Node right;
	public Node(String name){
	this.name = name;
	left = null;
	right = null;
	}
	}