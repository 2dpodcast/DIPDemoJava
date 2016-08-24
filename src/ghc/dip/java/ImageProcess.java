package ghc.dip.java;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageProcess {

	private Image createImageWithText(){
		BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
		
		Graphics g = bufferedImage.getGraphics();
		
		g.drawString("ghc", 20, 20);
		
		return bufferedImage;
	}
}
