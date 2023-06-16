package com.test.dao;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@SuppressWarnings("serial")
@WebServlet("*.upload")

public class UploadServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	//String path = "C:\\Users\\user\\Desktop\\course\\jsp\\apache-tomcat-9.0.75\\wtpwebapps\\TestWeb\\file\\fileimg";
    	String savePath = "/file/fileimg";
    	String realPath = request.getServletContext().getRealPath(savePath);
    	System.out.println(realPath);
    	int sizeLimit = 10*1024*1024;
    	
    	MultipartRequest multi = new MultipartRequest(request, realPath, sizeLimit, "utf-8", new DefaultFileRenamePolicy());
    	
    	String text = multi.getParameter("text");
    	System.out.println(text);
    	String fileName = multi.getFilesystemName("file");
    	String originalName = multi.getOriginalFileName("file");
    	System.out.println(originalName);
    	
    	try {
    		if(fileName==null) {
    			System.out.println("실패");
    		}else {
    			System.out.println("됨?");
    		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}