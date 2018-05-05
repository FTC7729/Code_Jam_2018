
public class Submarine extends Sprite {

	@Override
	char[][] render(char[][] charSprite, int iX, int iY) {
		
		charSprite  [this.iX+1][this.iY+1] = '/'; charSprite [this.iX+2][this.iY+1] = '+'; 
		charSprite [this.iX+3][this.iY+1] = '_'; charSprite [this.iX+4][this.iY+1] = '_'; 
		charSprite [this.iX + 1][this.iY+2] = '|'; charSprite [this.iX+4][this.iY+2] = 'o';
		charSprite [this.iX +5][this.iY+2] = '\\'; charSprite [this.iX + 1][this.iY+3] = '\\';
		charSprite [this.iX + 1][this.iY+3] = '_'; charSprite [this.iX][this.iY+2] = '+';
		charSprite [this.iX+3][this.iY+3] = '_'; charSprite [this.iX+4][this.iY+3] = '+';
		charSprite [this.iX+5][this.iY+3] = '/';

		return charSprite;
	}
	

}
