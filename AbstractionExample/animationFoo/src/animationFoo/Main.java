package animationFoo;

import java.util.Scanner;

public class Main {

	protected Scanner	myScanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main	mainAnimation = new Main();
		ScreenManager	smManager = new ScreenManager();
		Screen			myScreen = new Screen();
		Dude			myDude = new Dude();
		House			myHouse = new House();
		BadDude			myBadDude = new BadDude();
		byte[][] 		byteScreen;
		
		smManager.init(mainAnimation.myScanner);
		smManager.calibrateScreen();
	    byteScreen = new byte[smManager.iWidth][smManager.iHeight];
		myScreen.init(smManager.iWidth, smManager.iHeight);
		myScreen.clearScreen();
		
//		byteScreen = drawBackground();
		myHouse.render(byteScreen, 1, 1);
		myDude.render(byteScreen, 8, 2);
		myBadDude.render(byteScreen, 13, 2);
		
		myScreen.printScreen(byteScreen);
		
		/*
		int iLeftRight = 0;
		while ( true ) {
			while ( iLeftRight < smManager.iWidth ) {
				myDude.iX++;
				myScreen.clearScreen();
				myDude.renderDude();
			}
			while ( iLeftRight > 0 ) {
				myDude.iX--;
				myScreen.clearScreen();
				myDude.renderDude();
			}
		}
		*/

	} // main
	
	public Main() {
		this.myScanner = new Scanner(System.in);
	} // Main
	
	public void close() {
		this.myScanner.close();
	}
	
	protected  byte[][] drawBackground() {
		byte[][] myByteScreen = { 
				{' '},
				{' ',' ','*','*'},
				{' ','*','*','*','*'},
				{' ','*','*','*','*'},
				{' ',' ','*','*',' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','=','=','='},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','=','=','=','=','.','.','.'},
				{' ',' ','=','=','=',' ',' ',' ',' ',' ',' ',' ',' ',' ','=','=','=','.','.','.','.','.','.','.'},
				{'=','=','.','.','.','=','=','=',' ',' ',' ',' ','=','=','.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','=','=','=','=','.','.','.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'}
		};
		
		return myByteScreen;
	} // drawBackground
	
	private char getKeypress() {
		char	cReturn = 0;
		
		cReturn = (char)myScanner.nextByte();
		
		return cReturn;
	} // getKeypress
	

} // Main class
