package animationFoo;

public class House extends Character {

	@Override
	byte[][] render(byte[][] byteScreen, int iX, int iY) {
		byteScreen[iX + 2][iY] = '/'; byteScreen[iX + 3][iY] = '\\';
		byteScreen[iX + 1][iY + 1] = '/'; byteScreen[iX + 3][iY + 1] = '_'; byteScreen[iX + 4][iY + 1] = '\\';
		byteScreen[iX][iY + 2] = '/'; byteScreen[iX + 2][iY + 2] = '|'; byteScreen[iX + 3][iY + 2] = '+'; byteScreen[iX + 4][iY + 2] = '|'; byteScreen[iX + 5][iY + 2] = '\\';
		byteScreen[iX][iY + 3] = '|'; byteScreen[iX + 2][iY + 3] = '_'; byteScreen[iX + 5][iY + 3] = '|'; 
		byteScreen[iX][iY + 4] = '|'; byteScreen[iX + 1][iY + 4] = '|'; byteScreen[iX + 2][iY + 4] = '.'; byteScreen[iX + 3][iY + 4] = '|'; byteScreen[iX + 5][iY + 4] = '|';
		byteScreen[iX][iY + 5] = '|'; byteScreen[iX + 1][iY + 5] = '|'; byteScreen[iX + 3][iY + 5] = '|'; byteScreen[iX + 5][iY + 5] = '|';
		
		return byteScreen;
	}

}
