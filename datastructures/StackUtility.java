package com.bridgelabz.datastructures;
//Node Implementation of the Stack using LinkedList 
class Node1{
 char data;          //character value to store the parenthesis values
 Node1 nextNode;      //Link to the next node
 
 public Node1(char value){
 data = value;
 nextNode = null;
 }
}
 
//Stack Utility
class StackUtility{
 Node1 head = null;         //Header or Top Node of the Stack
 
 //Push operation of the Stack
 public void push(char value){
 Node1 newNode = new Node1(value);
 newNode.nextNode = head;
 head = newNode;
 }
 
 //Pop operation of the Stack
 public char pop()
 {
   if(head == null)
   {
     System.out.println("UnderFlow! The Stack is Empty !");
     return 0;
   } 
   else
   {
     char currentValue = head.data;
     head = head.nextNode;
     return currentValue;
   }
 }
 
 //Peek operation i.e. returns the First element
 public char peek()
 {
  if(head == null)
  {
   //System.out.println("UnderFlow! The Stack is Empty !");
   return 0;
  }
  else
  {
   return head.data;
  }
 }
 
 //isEmpty function to check whether the stack is empty or not.
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
