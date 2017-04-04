package data_structures;

import java.util.ArrayList;

import transition_model.Node;

/**
 * This is a priority Q that is ordered by path cost.<br>
 * it returns the path by minimum cost.
 * @author Sadjad
 *
 */
public class PathOrderedPQ extends Queue {

	ArrayList<Node> list;
	public PathOrderedPQ() {
		super();
		list = new ArrayList<Node>();
	}

	@Override
	public Node peek() {
		return list.get(getMinimumCostIndex());
	}

	@Override
	public Node pop() {
		Node result = list.get(getMinimumCostIndex());
		list.remove(getMinimumCostIndex());
		return result;
	}

	@Override
	public void push(Node node) {
		list.add(node);
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
		return list.contains(node);
	}

	@Override
	public void printQ() {
		for (Node node : list) {
			System.out.println(node.getState());
		}
	}

	private int getMinimumCostIndex(){
		int min = 0;
		for (Node node : list) {
			if(node.getPathCost() < list.get(min).getPathCost())
				min = list.indexOf(node);
		}
		return min;
	}
	
	@Override
	/**
	 * Returns the element at the specified position in this list.
	 * @param index
	 */
	public Node getElement(int index){
		return list.get(index);
	}
}


