package data_structures;

import transition_model.Node;

/**
 * Any search algorithm needs a queue to store nodes in it.<br>
 * This queue can be FIFO, LIFO, PQ(priority queue) or any thing else.<br>
 * @author Sadjad
 *
 */
public abstract class Queue {

	public Queue() {

	}

	/**
	 * Retrieves, but does not remove, the head (first element) of this Q.
	 */
	public abstract Node peek();
	/**
	 * Retrieves and removes the head (first element) of this Q.
	 */
	public abstract Node pop(); 
	/**
	 * Appends the specified element to the end of this Q. 
	 * @param node
	 */
	public abstract void push(Node node);
	/**
	 * Returns true if this list contains no elements.
	 */
	public abstract boolean isEmpty();
	/**
	 * Returns the number of elements in this Q.
	 */
	public abstract int size();
	/**
	 * Returns true if this list contains the specified element
	 * @param node
	 */
	public abstract boolean contains(Node node);
	public abstract void printQ();
	public abstract Node getElement(int index);
}
