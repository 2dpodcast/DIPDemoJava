package ghc.files;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FileOpt {

	public FileOpt() {
		// TODO Auto-generated constructor stub
	}
	
	public static void downloadFile(String urlIn,String fileNameOut){
		try{            
            URL url = new URL(urlIn);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream(fileNameOut);
            byte[] buffer = new byte[2048];
            
            int length = 0;
            
            while ((length = inputStream.read(buffer)) != -1) {
               //System.out.println("Buffer Read of length: " + length);
               outputStream.write(buffer, 0, length);
            }
            
            inputStream.close();
            outputStream.close();
            
         }catch(Exception e){
            System.out.println("FileDownloadException: " + e.getMessage());
         }
	}

}
