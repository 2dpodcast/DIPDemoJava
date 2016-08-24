package ghc.dip.opencv;

import org.opencv.core.Core;

public class ImageProcess {

	static{ 
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); 
		//System.loadLibrary("opencv_java249"); 
	}
}
