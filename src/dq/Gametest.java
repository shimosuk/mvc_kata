package dq;

import junit.framework.TestCase;

public class Gametest extends TestCase {
	public void testAttack(){
		Attack three = new Attack(3);
		Attack attack = three.attack(1);
		assertEquals(3, attack.amount);
		attack = three.attack(2);
		assertEquals(6, attack.amount);
	}
	public void testStatus(){
		Status hp = new Status(10);
		assertEquals(10,hp.hitpoint);
		Status attack = hp.attack(3);
		assertEquals(7,attack.hitpoint);
		assertEquals(3, attack.hitpoint);
	}
}
