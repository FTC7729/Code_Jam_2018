package utilityFunctions;

public class Utilities {
	
	public void pause(int iDuration) {
		try {
			Thread.sleep(iDuration);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		} 
	} // pause

} // class Utilies
