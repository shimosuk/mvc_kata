package tddquest;

public class Attack extends Status{

	int amount;

	Attack(int amount) {
		this.amount = amount;
	}

	Attack attack(int variable) { // variable�ɂ͗�����\��B
		return new Attack(amount * variable);
	}

}
