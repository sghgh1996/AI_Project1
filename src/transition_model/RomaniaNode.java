package transition_model;

/**
 * this is state for Romania routing problem.
 * @author Sadjad
 *
 */
public class RomaniaNode extends Node {
	
	public RomaniaNode(String romania_state) {
		super(romania_state);
	}
	
	@Override
	public boolean equals(Object obj) {
		String city = (String) getState();
		String object = (String) ((Node)obj).getState();
		return city.equals(object);
	}
}
