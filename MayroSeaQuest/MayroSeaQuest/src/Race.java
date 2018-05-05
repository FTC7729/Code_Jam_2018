import java.util.Scanner;

public class Race {
	
	enum STATE_HORIZONTAL {
		LEFT,
		STATIONARY,
		RIGHT
	}
	enum STATE_VERTICAL {
		UP,
		DOWN
	}
	
	protected Scanner	myScanner;
	protected STATE_HORIZONTAL	enumHorizontal;
	protected STATE_VERTICAL	enumVertical;
	protected Submarine	mySubmarine;
	
	public Race() {
		mySubmarine = new Submarine();
		mySubmarine.init(0,12);
	}
	
	public void init(Scanner myScanner) {
		this.myScanner = myScanner;
		this.enumHorizontal = STATE_HORIZONTAL.STATIONARY;
		this.enumVertical = STATE_VERTICAL.UP;
	} // init
	
	public void raceLoop() {
		boolean bLoop = true;
		
		myScanner.useDelimiter("");
		
		while ( bLoop ) {
			GetInput();
			UpdateSubPosition();
			
		} // while bLoop
	} // Race Loop
	
	protected void GetInput() {
		while (this.myScanner.hasNext()) {
			String	strDirection = this.myScanner.next();
			switch( strDirection ) {
			case "W":
				// Move up
				this.enumVertical = STATE_VERTICAL.UP;
				break;
			case "A":
				// Move left
				this.enumHorizontal = STATE_HORIZONTAL.LEFT;
				break;
			case "D":
				// Move right
				this.enumHorizontal = STATE_HORIZONTAL.RIGHT;
				break;
			case "S":
				// Move down
				this.enumVertical = STATE_VERTICAL.DOWN;
				break;
			} // switch keypress
		} // while hasnext
	} // GetInput
	
	protected void UpdateSubPosition() {
		switch (this.enumVertical){
			case UP:
				this.mySubmarine.iY++;
				break;
			case DOWN:
				this.mySubmarine.iY--;
				break;
		} // Vertical movement
		switch (this.enumHorizontal) {
			case LEFT:
				this.mySubmarine.iX--;
				break;
			case RIGHT:
				this.mySubmarine.iX++;
				break;
		}// Horizontal movement
				
	} // UpdateSubPosition
	
}
