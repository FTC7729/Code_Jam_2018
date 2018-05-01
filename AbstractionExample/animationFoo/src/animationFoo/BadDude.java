package animationFoo;

public class BadDude extends Character {

	@Override
	byte[][] render(byte[][] byteScreen, int iX, int iY) {
		byteScreen[iX + 0][iY + 0] = ' ';
		byteScreen[iX + 1][iY + 0] = (byte) '©';
		byteScreen[iX + 2][iY + 0] = ' ';
		
		byteScreen[iX + 0][iY + 1] = '/';
		byteScreen[iX + 1][iY + 1] = '|';
		byteScreen[iX + 2][iY + 1] = '/';
		
		byteScreen[iX + 0][iY + 2] = ' ';
		byteScreen[iX + 1][iY + 2] = '|';
		byteScreen[iX + 2][iY + 2] = ' ';
		
		byteScreen[iX + 0][iY + 3] = '/';
		byteScreen[iX + 1][iY + 3] = ' ';
		byteScreen[iX + 2][iY + 3] = 'L';
		
		return null;

	}

}
