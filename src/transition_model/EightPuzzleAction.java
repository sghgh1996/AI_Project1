package transition_model;

public class EightPuzzleAction extends Action {

	/**
	 * This is the direction for white cell.
	 * Up : 1 | Right : 2 | Down : 3 | Left : 4
	 */
	private int direction;
	public EightPuzzleAction(int direction) {
		this.direction = direction;
	}
	public int getDirection() {
		return direction;
	}
}
