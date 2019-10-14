/**
 * 
 */
package com.bridgelabz.datastructures;

/*
 * Node Implementation of the Stack using LinkedList 
 */
class Node1<T>
{
	/*
	 * character value to store the parenthesis values
	 */
 T data; 
 /*
  * Link to the next node
  */
 Node1 nextNode;                 
 
 public Node1(T value){
 data = value;
 nextNode = null;
 }
}
 
/**
 * Stack Utility class to implement stack operations
 * @author admin1
 *
 */
class StackUtility<T>{
	/*
	 *   Header or Top Node of the Stack
	 */
 Node1 head = null;             
 
 /**
  * Push operation of the Stack
  */
 public void push(T value)
 {
  Node1 newNode = new Node1(value);
  newNode.nextNode = head;
  head = newNode;
 }
 
 /**
  * Pop operation of the Stack
  * @return
  */
 public int pop()
 {
   if(head == null)
   {
     System.out.println("UnderFlow! The Stack is Empty !");
     return 0;
   } 
   else
   {
     int currentValue = (int) head.data;
     head = head.nextNode;
     return currentValue;
   }
 }
 
 /**
  * Peek operation i.e. returns the First element
  * @return
  */
 public int peek()
 {
  if(head == null)
  {
   //System.out.println("UnderFlow! The Stack is Empty !");
   return 0;
  }
  else
  {
   return (int)head.data;
  }
 }
 
 /**
  * isEmpty function to check whether the stack is empty or not.
  * @return
  */
 public boolean isEmpty()
 {
  if(head == null)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
	 
}

	
	
