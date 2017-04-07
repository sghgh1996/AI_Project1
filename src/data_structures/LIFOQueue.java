package data_structures;

import java.util.LinkedList;

import transition_model.Node;

public class LIFOQueue extends Queue {
	/**
	 * Linked-list is the DS for implementing FIFO Q.
	 */
	private LinkedList<Node> list;
	
	public LIFOQueue() {
		super();
		list = new LinkedList<Node>();
	}

	@Override
	public Node peek() {
		return list.peek();
	}

	@Override
	public Node pop() {
		return list.poll();
	}

	@Override
	public void push(Node state) {
		list.addFirst(state);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean contains(Node node) {
		for (Node list_node : list) {
			if(list_node.equals(node)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printQ() {
		for (Node node : list) {
			System.out.printf(" %s ",node.getState());
		}
		System.out.println();
	}
	
	@Override
	/**
	 * Returns the element at the specified position in this list.
	 * @param state
	 */
	public Node getElement(Object state){
		for (Node node : list) {
			if(node.getState().equals(state))
				return node;
		}
		return null;
	}
}
