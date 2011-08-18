package tddquest;

public class Cure {

	public int amount;

	public Cure(int amount) {
		this.amount = amount;
	}

	public Cure cure(int variable) {
		return new Cure(amount * variable);
	}

}
