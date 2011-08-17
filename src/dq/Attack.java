package dq;

public class Attack {

	int amount;

	Attack(int amount) {
//		System.out.println("*");
		this.amount=amount;
	}

	Attack attack(int i) {
//		System.out.println("**");
		return new Attack(amount*i);
	}
	
}
