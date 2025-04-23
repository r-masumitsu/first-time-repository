package lesson5;

public class StoneOnlyTactics implements Tactics {

	@Override
	public int readTactics() {
		//必ずグーを出す
		return Player.STONE;
	}

}
