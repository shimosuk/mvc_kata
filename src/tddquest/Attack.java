package tddquest;

public class Attack extends Status{

	int amount;

	Attack(int amount) {
		this.amount = amount;
	}

	Attack attack(int variable) { // variableには乱数を予定。
		return new Attack(amount * variable);
	}

}
