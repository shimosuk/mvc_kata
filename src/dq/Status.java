package dq;

public class Status {

	public int hitpoint;

	public Status(int i) {
		hitpoint = i;
	}

	public Status attack(int i) {
		return new Status(hitpoint - i);
	}

}
