/**
 * 
 */

/**
 * @author Nishith
 *
 */
public class Surgeon extends HospitalEmployee {
	 String Operating ;
	 Boolean True  ;
	
	

	public Surgeon(String name, int number,String operating, Boolean true1) {
		super (name,number);
		Operating = operating;
		True = true1;
	}

	public void work() {
		System.out.println (getName() + " works for the hospital. "+ getName() +" is operating now.");		
	}
	
	@Override
	public String toString() {
		return ""+getName()+ " "+ getNumber()+" " + Operating + " Operating : "  +  True + ".";
	}

}
