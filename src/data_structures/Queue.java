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

	public abstract Node peek();
	public abstract Node pop(); 
	public abstract void push(Node node);
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract boolean contains(Node node);
}
