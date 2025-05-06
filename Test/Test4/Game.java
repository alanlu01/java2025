package ntou.cs.java2023.t4.chianyih;
import java.security.SecureRandom;
//Basic Version
public class Game {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();

		Role role1 = new Role("Captain America", 500 + random.nextInt(500), 100 + random.nextInt(156),
				20 + random.nextInt(80));
		Role role2 = new Role("Iron Man", 500 + random.nextInt(500), 100 + random.nextInt(156),
				20 + random.nextInt(80));
		System.out.printf("%s%n%s%n", role1, role2);

		Battle battle = new Battle(role1, role2);
		battle.play();
	}
}
