package tddquest;

public class Attack {

	int amount;

	Attack(int amount) {
		this.amount = amount;
	}

	Attack attack(int variable) { // variable�ɂ͗�����\��B
		return new Attack(amount * variable);
	}

}
