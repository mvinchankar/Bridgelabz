package com.bridgelabz.datastructures;

public class DequeueUtility<T> {
	 private Node<T> front;
	 private Node<T> rear;
	 
/**
 * Node class Implementation to caretion of Node 
 * @param <T>
 */
 static class Node<T>{
  T data;
  // next node in the list
  Node<T> next;
  // previous node in the list
  Node<T> prev;
 
  /**
   * TO Display the data
   */
  public void displayData(){
   System.out.print(data + " ");
  }
 }
 // constructor
 public DequeueUtility() {
  front = null;
  rear = null;
 }
	 
 /**
  * isEmpty method to check the queue empty or not
  * @return
  */
 public boolean isEmpty(){
  return front == null;
 }

 
 /**
  * insertFirst method to insert the elements in Dequeue
  * @param data
  */
 public void insertFirst(T data){
  //Create a new node
  Node newNode = new Node();
  newNode.data = data;
 
  if(isEmpty())
  {                                                           // if first insertion tail should
	 rear = newNode;                                          // also point to this node
  }
  else
  {
   front.prev = newNode;
  }
  newNode.next = front;
  front = newNode;
 }
	 
/**
 * insertAtLast method to insert the element at last
 * @param data
 */
 public void insertLast(T data)
 {
   Node newNode = new Node();
   newNode.data = data;
 
   if(isEmpty())
   {
    front = newNode;
   }
   else
   {
    rear.next = newNode;
    newNode.prev = rear;
   }
   rear = newNode;
 }
 
 /**
  * removeFirst method to remove element at First
  * @return
  */
 public Node removeFirst()
 {
  if(front == null)
  {
   throw new RuntimeException("Deque is empty");
  }
  Node first = front;
  if(front.next == null)
  {
   rear = null;
  }
  else
  {
   /*
    * previous of next node (new first) becomes null
    */
   front.next.prev = null;
  }
  front = front.next;
  return first;
 }

 
 /**
  * removeLast method to remove the element at last
  * @return
  */
 public T removeLast()
 {
  if(rear == null)
  {
   throw new RuntimeException("Deque is empty");
  }
  Node last = rear;
  if(front.next == null)
  {
   front = null;
  }
  else
  {
   /*
    * next of previous node (new last) becomes null
    */
   rear.prev.next = null;
  }
  rear = rear.prev;
 /*
  * System.out.println(last.data);
  */
   T data = (T) last.data;
 
  
  return data;
 }
 
 /**
  * getFirst method to get first element 
  * @return
  */
 public T getFirst()
 {
  if(isEmpty())
  {
   throw new RuntimeException("Deque is empty");
  }
  T data =front.data;
  System.out.println(front.data);
  return data;
 }
 
 /**
  * method to get last element
  * @return
  */
 public T getLast(){
  if(isEmpty())
  {
   throw new RuntimeException("Deque is empty");
  }
  T data =rear.data;
  return data;
 }
 
 /**
  * Method for forward traversal
  */
 public void displayForward(){
  Node current = front;
  while(current != null){
   current.displayData();
   current = current.next;
  }
  System.out.println("");
 }
 
 /**
  * Method to traverse and display all nodes
  */
 public void displayBackward(){
  Node current = rear;
  while(current != null){
   current.displayData();
   current = current.prev;
  }
  System.out.println("");
 }

}