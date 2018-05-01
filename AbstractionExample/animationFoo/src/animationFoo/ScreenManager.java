package animationFoo;

import java.util.Scanner;

public class ScreenManager {
	
	public int iWidth;
	public int iHeight;
	
	public static int iMaxWidth = 80;
	public static int iMaxHeight = 24;
	
	protected Scanner myScanner;
	
	ScreenManager() {
		this.iWidth = iMaxWidth;
		this.iHeight = iMaxHeight;
	} // ScreenManager
	
	public void init(Scanner myScanner) {
		this.myScanner = myScanner;
	} // init

	private void printCalibrationWidth() {
		for (int i = 0; i < iMaxWidth; i++) {
			System.out.print("+");
		}	
		System.out.print("\n");
	} // printCalibrationWidth
	
	private void printCalibrationHeight() {
		for (int i = 0; i < (iMaxHeight - 2); i++) {
			if ( i == (iMaxHeight / 2) ) {
				System.out.println("| Please resize your window so the pluses are at the top and the bottom");
			} else {
				System.out.println('|');
			}
		} // loop to width
	} // printCalibrationHeight
		
	private void printCalibrationText() {
		printCalibrationWidth();
		printCalibrationHeight();
		printCalibrationWidth();
	} // printCalibrationText
	
	public void calibrateScreen() {
		printCalibrationText();
		String strNextLine = myScanner.nextLine();
		while ( strNextLine.length() < 0 ) {
			System.out.print('.');
			strNextLine = myScanner.nextLine();
		} // while waiting for input
			
	} // CalibrateScreen
}
