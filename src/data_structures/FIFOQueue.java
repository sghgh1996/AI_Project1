package data_structures;

import java.util.LinkedList;

import transition_model.Node;

/**
 * this Q is first-in-first-out. It uses linked-list to implement the Q.
 * @author Sadjad
 *
 */
public class FIFOQueue extends Queue {

	/**
	 * Linked-list is the DS for implementing FIFO Q.
	 */
	private LinkedList<Node> list;
	
	public FIFOQueue() {
		super();
		list = new LinkedList<Node>();
	}

	@Override
	/**
	 * Retrieves, but does not remove, the head (first element) of this Q.
	 */
	public Node peek() {
		return list.peek();
	}

	@Override
	/**
	 * Retrieves and removes the head (first element) of this Q.
	 */
	public Node pop() {
		return list.poll();
	}

	@Override
	/**
	 * Appends the specified element to the end of this Q. 
	 */
	public void push(Node state) {
		list.addLast(state);
	}

	@Override
	/**
	 * Returns true if this list contains no elements.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	/**
	 * Returns the number of elements in this Q.
	 */
	public int size() {
		return list.size();
	}

	@Override
	public boolean contains(Node node) {
		return list.contains(node);
	}

}
