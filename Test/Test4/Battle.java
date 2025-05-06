package ntou.cs.java2023.t4.chianyih;
public class Battle {

	private Role role1;
	private Role role2;

	public Battle(Role role1, Role role2) {
		this.role1 = role1;
		this.role2 = role2;
	}

	public void play() {
		// TODO
		//printf("%s\n%s\n", role1, role2);
		while(true){
			role1.attack(role2);
			System.out.printf("%s causes damage: %,d\n", role1.getName(),role1.getOffense()-role2.getDefense());
			System.out.printf("%s's HP becomes %d\n", role2.getName(), role2.getHp());
			if(role2.getHp()<=0){
				System.out.printf("%s defeats %s\n", role1.getName(), role2.getName());
				break;
			}
			role2.attack(role1);
			System.out.printf("%s causes damage: %,d\n", role2.getName(),role2.getOffense()-role1.getDefense());
			System.out.printf("%s's HP becomes %d\n", role1.getName(), role2.getHp());
			if(role1.getHp()<=0){
				System.out.printf("%s defeats %s!\n", role2.getName(), role1.getName());
				break;
			}
		}
	

	}
}
