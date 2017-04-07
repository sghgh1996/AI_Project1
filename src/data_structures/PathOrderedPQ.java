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

	private ArrayList<Node> list;
	
	public PathOrderedPQ() {
		super();
		list = new ArrayList<Node>();
	}

	@Override
	public Node peek() {
		if(getMinimumCostIndex() != -1)
			return list.get(getMinimumCostIndex());
		return null;
	}

	@Override
	public Node pop() {
		if(getMinimumCostIndex() != -1){
			Node result = list.get(getMinimumCostIndex());
			list.remove(getMinimumCostIndex());
			return result;
		}
		return null;
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
		for (Node list_node : list) {
			if(list_node.getState().equals(node.getState())){
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

	private int getMinimumCostIndex(){
		if(list.isEmpty())
			return -1;
		
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


