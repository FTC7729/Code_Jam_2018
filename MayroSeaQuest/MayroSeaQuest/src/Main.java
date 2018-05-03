
public class Main {
	
	enum GAME_MODE  {
			CALIBRATION,
			INTRO,
			DIRECTIONS,
			SUBMARINE_RACE,
			TEXT_ADVENTURE,
			CREDITS,
			END
	}
	
	public  GAME_MODE enumGameMode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main epicGame = new Main();
		
		epicGame.gameLoop(); // This runs the game for us

	} // main
	
	Main () {
		this.enumGameMode = GAME_MODE.CALIBRATION;
	} // Main

	public void gameLoop() {
		boolean bLoop = true; 
		
		while (bLoop) {
		
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
			case CREDITS:
				break;
			case END:
			default:
				// Game is over, let's break out of the while loop
				bLoop = false;
				break;
			
			} // gameLoop switch
		} // bLoop

	} // gameLoop
	
} // Main Class
