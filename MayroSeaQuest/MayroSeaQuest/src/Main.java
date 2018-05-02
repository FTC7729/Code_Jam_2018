
public class Main {
	
	enum GAME_MODE  {
			CALIBRATION,
			INTRO,
			DIRECTIONS,
			SUBMARINE_RACE,
			TEXT_ADVENTURE,
			END
	}
	
	public  GAME_MODE enumGameMode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main epicGame = new Main();
		
		

	} // main
	
	Main () {
		this.enumGameMode = GAME_MODE.CALIBRATION;
	} // Main

	public void gameLoop() {
		switch (this.enumGameMode) {
		case CALIBRATION:
			break;
		case INTRO:
			break;
		case DIRECTIONS:
			break;
		case SUBMARINE_RACE:
			break;
		case TEXT_ADVENTURE:
			break;
		case END:
		default:
				break;
		
		} // gameLoop switch

	} // gameLoop
	
} // Main Class
