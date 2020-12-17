import java.awt.Color;
import java.awt.Rectangle;


public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private int initialXPosition, initialYPosition;
	private Color colour;
	// getter methods
	public int getXPosition() {
		return xPosition;
	}
	public int getYPosition() {
		return yPosition;
	}
	public int getXVelocity() {
		return xVelocity;
	}
	public int getYVelocity() {
		return yVelocity;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColour() { return colour; }
	
	//setter methods
	public void setInitialPosition (int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}
	public void resetToInitialPosition() {
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	public void setXPosition(int newX) {
		xPosition = newX;
	}
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	public void setXPosition(int newX, int panelWidth) {
		if (newX < 0) {
			newX = 0;
		} else if (newX > panelWidth) {
			newX = panelWidth;
		}
		xPosition = newX;
	}
	public void setYPosition(int newY, int panelHeight) {
		if (newY < 0) {
			newY = 0;
		} else if (newY >= panelHeight) {
			newY = panelHeight;
		}
		yPosition = newY;
	}
	public void setXVelocity(int newXVelocity) {
		xVelocity = newXVelocity;
	}
	public void setYVelocity(int newYVelocity) {
		yVelocity = newYVelocity;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public void setColour(Color newColour) {
		colour = newColour;
	}
	public Rectangle getRectangle() {
		return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
	}
}
