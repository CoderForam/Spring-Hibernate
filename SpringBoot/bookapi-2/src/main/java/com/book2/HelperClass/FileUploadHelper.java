package com.book2.HelperClass;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	public final String UPLOAD_DIR="C:\\Users\\chaitanya.k\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\bookapi-2\\src\\main\\resources\\static\\image";
	public boolean uploadFile(MultipartFile f)
	{
		boolean fa=false;
		
		
		try {
			
			//
			InputStream inputStream = f.getInputStream();
			byte data[]=new byte[inputStream.available()];
			inputStream.read(data);
			
			//write
			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+"\\"+f.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			
			fa=true;
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		return fa;
	}

}
