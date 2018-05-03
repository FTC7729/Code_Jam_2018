
public class Submarine extends Sprite {

	@Override
	char[][] render(char[][] charSprite, int iX, int iY) {
		
		charSprite  [iX+1][iY+1] = '/'; charSprite [iX+2][iY+1] = '+'; 
		charSprite [iX+3][iY+1] = '_'; charSprite [iX+4][iY+1] = '_'; 
		charSprite [iX + 1][iY+2] = '|'; charSprite [iX+4][iY+2] = 'o';
		charSprite [iX +5][iY+2] = '\\'; charSprite [iX + 1][iY+3] = '\\';
		charSprite [iX + 1][iY+3] = '_'; charSprite [iX][iY+2] = '+';
		charSprite [iX+3][iY+3] = '_'; charSprite [iX+4][iY+3] = '+';
		charSprite [iX+5][iY+3] = '/';

		return charSprite;
	}
	

}
