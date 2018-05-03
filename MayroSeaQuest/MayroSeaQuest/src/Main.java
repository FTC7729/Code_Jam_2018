import java.util.Scanner;

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
	
	protected Scanner	myScanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main epicGame = new Main();
		
		epicGame.gameLoop(); // This runs the game for us

	} // main
	
	Main () {
		this.enumGameMode = GAME_MODE.CALIBRATION;
		this.myScanner = new Scanner(System.in);
	} // Main

	public void gameLoop() {
		boolean bLoop = true; 
		
		ScreenManager myScreenManager = new ScreenManager();
		myScreenManager.init(this.myScanner);
		
		while (bLoop) {
		
			switch (this.enumGameMode) {
			case CALIBRATION:
				myScreenManager.calibrateScreen(); // Blocking call waits for user input
				this.enumGameMode = enumGameMode.INTRO;
				break;
			case INTRO:
				this.enumGameMode = enumGameMode.DIRECTIONS;
				break;
			case DIRECTIONS:
				this.enumGameMode = enumGameMode.SUBMARINE_RACE;
				break;
			case SUBMARINE_RACE:
				this.enumGameMode = enumGameMode.TEXT_ADVENTURE;
				break;
			case TEXT_ADVENTURE:
				this.enumGameMode = enumGameMode.CREDITS;
				break;
			case CREDITS:
				this.enumGameMode = enumGameMode.END;
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
