/**
 * 
 */

/**
 * @author Nishith
 *
 */
public class Nurse extends HospitalEmployee {
	int numOfPatients;

	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients = numOfPatients;
	}

	public void work() {
		System.out.println(getName() + " works for the hospital. "+ getName() +" is a nurse with "+ this.numOfPatients +" patients.");
	}
	
	@Override
	public String toString() {
		return "" + getName() + " " + getNumber() + " " + numOfPatients + ".";
	}
}
