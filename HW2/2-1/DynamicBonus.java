package ntou.cs.java2025;
public class DynamicBonus implements Bonus {

	@Override
	public int getBonus(int salary) {
		return (int)(salary * 0.1);
	}

}
