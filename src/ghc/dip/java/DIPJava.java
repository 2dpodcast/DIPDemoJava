package ghc.dip.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DIPJava {
	
	protected static BufferedImage readImg(String pathImg){	
		try {
			File input = new File(pathImg);
			BufferedImage bufferedImage = ImageIO.read(input);
			return bufferedImage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}    
	}
	
	protected static void writeImg(String pathImg,BufferedImage image,String format){	
        try {
        	File ouptut = new File(pathImg);
			ImageIO.write(image, format, ouptut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
