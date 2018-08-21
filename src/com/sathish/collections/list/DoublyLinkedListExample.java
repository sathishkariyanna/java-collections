package com.sathish.collections.list;

import java.util.NoSuchElementException;

/**
 * 
 * @author Sathish
 *
 * @param <E>
 */
public class DoublyLinkedListExample<E> {

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedListExample() {
		size = 0;
	}

	private class Node {
		E element;
		Node next;
		Node prev;

		public Node(E element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}
	}

	/**
	 * returns the size of the linked list
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * return whether the list is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * adds element at the starting of the linked list
	 * 
	 * @param element
	 */
	public void addFirst(E element) {
		Node tmp = new Node(element, head, null);
		if (head != null) {
			head.prev = tmp;
		}
		head = tmp;
		if (tail == null) {
			tail = tmp;
		}
		size++;
		System.out.println("adding: " + element);
	}

	/**
	 * adds element at the end of the linked list
	 * 
	 * @param element
	 */
	public void addLast(E element) {

		Node tmp = new Node(element, null, tail);
		if (tail != null) {
			tail.next = tmp;
		}
		tail = tmp;
		if (head == null) {
			head = tmp;
		}
		size++;
		System.out.println("adding: " + element);
	}

	/**
	 * this method walks forward through the linked list
	 */
	public void iterateForward() {

		System.out.println("iterating forward..");
		Node tmpNode = head;
		while (tmpNode != null) {
			System.out.println(tmpNode.element);
			tmpNode = tmpNode.next;
		}
	}

	/**
	 * this method walks backward through the linked list
	 */
	public void iterateBackward() {

		System.out.println("iterating backword..");
		Node tmpNode = tail;
		while (tmpNode != null) {
			System.out.println(tmpNode.element);
			tmpNode = tmpNode.prev;
		}
	}

	/**
	 * this method removes element from the start of the linked list
	 * 
	 * @return
	 */
	public E removeFirst() {
		if (size == 0)
			throw new NoSuchElementException();
		Node tmpNode = head;
		head = head.next;
		head.prev = null;
		size--;
		System.out.println("deleted: " + tmpNode.element);
		return tmpNode.element;
	}

	/**
	 * this method removes element from the end of the linked list
	 * 
	 * @return
	 */
	public E removeLast() {
		if (size == 0)
			throw new NoSuchElementException();
		Node tmpNode = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		System.out.println("deleted: " + tmpNode.element);
		return tmpNode.element;
	}

	public static void main(String a[]) {

		DoublyLinkedListExample<Integer> doubleLinkedList = new DoublyLinkedListExample<Integer>();
		doubleLinkedList.addFirst(20);
		doubleLinkedList.addFirst(30);
		doubleLinkedList.addLast(15);
		doubleLinkedList.addLast(100);
		doubleLinkedList.addLast(80);

		doubleLinkedList.iterateForward();
		doubleLinkedList.removeFirst();
		doubleLinkedList.iterateBackward();
		doubleLinkedList.removeLast();

	}
}
