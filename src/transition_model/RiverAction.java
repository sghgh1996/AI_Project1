package transition_model;

public class RiverAction extends Action {

	/**
	 * It is the number of missioner that are going the other side.
	 */
	private int missioner;
	/**
	 * It is the number of cannibal that are going the other side.
	 */
	private int cannibal;
	private String dir;
	
	public RiverAction(int missioner, int cannibal) {
		this.cannibal = cannibal;
		this.missioner = missioner;
	}

	public int getCannibal() {
		return cannibal;
	}

	public int getMissioner() {
		return missioner;
	}
}
