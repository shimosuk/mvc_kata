package dq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DQgame {

	private static int hp = 10;// staticは確認のため
	private static int mhp;

	public static void main(String[] args) throws IOException {
		DQgame pg = new DQgame();
		pg.PlayGame();
	}

	public void PlayGame() throws IOException {
		for (;;) {
			System.out.println("-------------------------");
			System.out.println(" ピカ充が現れた。");
			System.out.println("-------------------------");
			mhp = 12;
			String s = null;

			for (;;) {
				/* player */
				if (PrintStatus() == null)
					break;

				s = PrintAction();
				if (s == null)
					break;
				PlayerAction(s);

				if (mhp <= 0)
					break;

				/* monster */
				if (PrintStatus() == null)
					break;
				MonsterAction();
				if (hp <= 0)
					break;

			}
			if (hp <= 0 || s == null)
				break;

			System.out.println("*****************");
			System.out.println(" ピカ充を倒した！");
			System.out.println("*****************");
		}
		System.out.println("Game Over");

	}

	// random
	private int RandomAmount(int max, int min) {
		for (;;) {
			Random rnd = new Random();
			int random = rnd.nextInt(10);
			if (random <= max && random >= min)
				return random;
		}
	}

	private String PrintAction() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+----------------+");
		System.out.println("| [ 1 ]:なぐる             |");
		System.out.println("| [ 2 ]:きずぐすり      |");
		System.out.println("| [etc]:ぼーっとする  |");
		System.out.println("+----------------+");

		String s = in.readLine();
		return s;

	}

	private String EnterPush() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		return s;

	}

	private String PrintStatus() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--Status----");
		System.out.println(" サト氏");
		System.out.println(" HP:" + hp);
		System.out.println(" ピカ充");
		System.out.println(" HP:" + mhp);
		System.out.println("------------");
		System.out.println("※please enter");
		String s = in.readLine();

		return s;
	}

	private void MonsterAction() {
		System.out.println("*******************");
		System.out.println("ピカ充のターン");
		int act = RandomAmount(9, 0);
		int amount = RandomAmount(4, 0);
		if (amount == 0)
			System.out.println("ミス!");
		else if (act <= 7) {
			hp -= amount;
			System.out.println("サト氏に" + amount + "のダメージ");
		} else {
			mhp += amount;
			System.out.println("ピカ充は" + amount + "回復した。");
		}
		System.out.println("*******************");
	}

	private void PlayerAction(String s) {
		System.out.println("*******************");
		System.out.println("サト氏のターン");
		int amount = RandomAmount(4, 0);
		if (amount == 0)
			System.out.println("ミス!");
		else if (s.equals("1")) {
			mhp -= amount;
			System.out.println("ピカ充へ" + amount + "のダメージ");
		} else if (s.equals("2")) {
			hp += amount;
			System.out.println("HP" + amount + "回復した。");
		}
		System.out.println("*******************");
	}

}
