package transition_model;

public class RiverNode extends Node {

	/**
	 * 
	 * @param state
	 * State is a 2'D array that the first element is number of missioner,<br>
	 * and the second element is the number of cannibal.<br>
	 * Any element is the number of them in one side of the river.<br>
	 */
	public RiverNode(int[] state) {
		super(state);
	}
	
	@Override
	public boolean equals(Object obj) {
		int[] state = (int[]) getState();
		int[] input = (int[]) ((Node)obj).getState();
		if(state[0] != input[0] || state[1] != state[1])
			return false;
		
		return true;
	}
}
