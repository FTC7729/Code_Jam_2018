
public abstract class Sprite {
	
	int	iX, iY; // location of sprite
	
	public Sprite() {
		iX = 0;
		iY = 0;
	}
	
	public Sprite(int iStartX, int iStartY) {
		this.init(iStartX, iStartY);
	}
	
	public boolean init(int iStartX, int iStartY) {
		iX = iStartX;
		iY = iStartY;
		
		return true;
	}

	abstract char[][] render(char[][] charSprite, int iX, int iY);

}
