package ghc.opencv.dipdemo;

import org.opencv.core.Core;
import org.opencv.core.CvType;  
import org.opencv.core.Mat;

public class DIPDemo {

	static{ 
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); 
		//System.loadLibrary("opencv_java249"); 
	}
	
	public DIPDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);  
        System.out.println("m = " + m.dump());  
	}

}
