package transition_model;

/**
 * this is Action for Romania routing problem.
 * @author Sadjad
 *
 */
public class RomaniaAction extends Action {

	/**
	 * This is the action for this problem.<br>
	 * Going from one city to the other cities.<br>
	 * It is an integer variable and means the city number.
	 */
	private String go;
	public RomaniaAction(String go_to_action) {
		this.go = go_to_action;
	}
	
	public String getGo() {
		return go;
	}
}
