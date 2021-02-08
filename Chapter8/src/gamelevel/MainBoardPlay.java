package gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alLevel = new AdvancedLevel();
		player.upgradeLevel(alLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
