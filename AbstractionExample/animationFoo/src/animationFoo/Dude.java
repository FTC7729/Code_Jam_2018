package animationFoo;

public class Dude extends Character {
	
	public int iX;
	public int iY;
	
	Dude () {
		this.iX = 0;
		this.iY = 0;
	}
	
	void render(int iX, int iY) {
		
		// Go to the y coordinate
		for ( int i = 0; i < this.iY; i++) {
			System.out.print("\n");
		}
		
		// Go to the x coordinate
		for ( int i = 0; i < this.iX; i++) {
			System.out.print(' ');
		}
		
		// Draw dude
		System.out.println("o");
		for (int i = 0; i < this.iX; i++) {
			System.out.print(' ');
		}
		System.out.println("+");
	} // renderDude

	@Override
	byte[][] render(byte[][] byteScreen, int iX, int iY) {
		byteScreen[iX + 0][iY + 0] = ' ';
		byteScreen[iX + 1][iY + 0] = '@';
		byteScreen[iX + 2][iY + 0] = ' ';
		
		byteScreen[iX + 0][iY + 1] = '/';
		byteScreen[iX + 1][iY + 1] = '|';
		byteScreen[iX + 2][iY + 1] = '\\';
		
		byteScreen[iX + 0][iY + 2] = ' ';
		byteScreen[iX + 1][iY + 2] = '|';
		byteScreen[iX + 2][iY + 2] = ' ';

		byteScreen[iX + 0][iY + 3] = '/';
		byteScreen[iX + 1][iY + 3] = ' ';
		byteScreen[iX + 2][iY + 3] = '\\';
		
		//   ☺ 
		//  /|\
		//   |
		//  / \

		return null;
	}

}
