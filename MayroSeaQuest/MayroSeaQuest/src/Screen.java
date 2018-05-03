

public class Screen {
	
	protected int iWidth;
	protected int iHeight;
	
	public Screen() {
		iWidth = 0;
		iHeight = 0;
	} // Screen
	
	public void init(int iWidth, int iHeight) {
		this.iWidth = iWidth;
		this.iHeight = iHeight;
	} // init
	
	public void clearScreen() {
		for (int i = 0; i < iHeight; i++) {
			System.out.print("\n");
		}
	} // clearScreen
	
	public void printScreen(char[][] charScreen) {
		for (int iY = 0; iY < iHeight; iY++) {
			for (int iX = 0; iX < iWidth; iX++) {
				System.out.print(charScreen[iX][iY]);
			} // iX
			System.out.print('\n');
		} // iY
	} // printScreen

}
