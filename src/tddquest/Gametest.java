package tddquest;

import junit.framework.TestCase;

public class Gametest extends TestCase {

	/* ATTACK test */
	public void testAttack() {
		Attack damage = new Attack(3);
		Attack attack = damage.attack(1);
		assertEquals(3, attack.amount);
		attack = damage.attack(2);
		assertEquals(6, attack.amount);
	}

	/* CURE test */
	public void testCure() {
		Cure recov = new Cure(3);
		Cure cure = recov.cure(1);
		assertEquals(3, cure.amount);
		cure = recov.cure(2);
		assertEquals(6, cure.amount);
	}

	/* HP test */
	public void testHitPoint() {
		HitPoint hp = new HitPoint(10);
		HitPoint mhp = new HitPoint(20);
		assertEquals(10, hp.hitpoint);
		assertEquals(20, mhp.hitpoint);
	}

	/* STATUS test */

}
