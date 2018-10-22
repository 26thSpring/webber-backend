package com.spring.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.DatatypeConverter;

public class UploadImgFile {


	public String uploadImg(String photo, String filePathImg,String nickname) {
		String[] photos=photo.split(",");
		String imgString=photos[1];
		System.out.println("이미지 자른거::" + imgString);
		CheckFileName checkFile=new CheckFileName();
		
		String fileName=checkFile.getCheckFileName(filePathImg, nickname,".png");
		System.out.println("저장될 파일이름"+fileName);
		filePathImg+="\\"+fileName;
			byte[] imageBytes = DatatypeConverter.parseBase64Binary(imgString);
			
			

			 File file = new File(filePathImg);
		        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
		            outputStream.write(imageBytes);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		/*File file=null;
		MultipartHttpServletRequest mhsr=(MultipartHttpServletRequest) req;
		Iterator<String> iterator=mhsr.getFileNames();//Iterator 갯수 체크
		MultipartFile mf=null; 
		
	    CheckFileName checkFile=new CheckFileName();
	    		
	    String fileName	   ="";
		String orgFileName ="";
		String fileExt	   ="";
		String sFileName   ="";
		int i=0;
				
		while (iterator.hasNext()) {
			mf=mhsr.getFile(iterator.next());
			HashMap<String,Object> hashmap=new HashMap();
			if(!mf.isEmpty()) {
				fileName=mf.getOriginalFilename();
				orgFileName=fileName.substring(0, fileName.lastIndexOf("."));
						
				fileExt=fileName.substring(fileName.lastIndexOf("."));
				if(fileExt.equals("jpg")||fileExt.equals("png")) {
					return null;
				}
				//중복파일 존재하면 번호추가 후 실제 파일명 처리;
				sFileName=checkFile.getCheckFileName(filePathImg,orgFileName,fileExt);
						
						
						file=new File(filePathImg+"\\"+sFileName);
						i+=1;
						try {
							mf.transferTo(file);//실제파일명으로 저장
							
						}catch(IOException e) {
							System.out.println("오류: "+e.getMessage());
							e.printStackTrace();
						}
					}
					
				}*/
		return fileName;
	}
}
