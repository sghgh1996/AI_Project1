package transition_model;

/**
 * this class is a superclass for any state of different problems.<br>
 * for a new problem a new state has to be made.<br>
 * any state is a node in search graph.<br>
 * any node has 4 parameter:<br>
 *      1. State : defined in child classes, it is different for different problems.<br>
 *      2. Parent : is the node that has generated current node.<br>
 *      3. Action : is the action that apply to the parent for generating this child.<br>
 *      4. PathCost : is the cost from the initial node to the current node.<br>
 * @author Sadjad
 *
 */
public abstract class Node {
	
	/**
	 * is the node that has generated current node.
	 */
	protected Node parent;
	/**
	 * is the action that apply to the parent for generating this child.
	 */
	protected Action action;
	/**
	 * is the cost from the initial node to the current node.
	 */
	protected double pathCost;
	/**
	 * this is the state of problems.<br>
	 * it is different in different problems.
	 */
	protected Object state;
	
	protected int depth;
	
	public Node(Object state) {
		this.setState(state);
		this.setDepth(0);
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public double getPathCost() {
		return pathCost;
	}

	public void setPathCost(double pathCost) {
		this.pathCost = pathCost;
	}

	public void setState(Object state) {
		this.state = state;
	}
	
	public Object getState(){
		return state;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
}
