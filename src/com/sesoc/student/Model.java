package com.sesoc.student;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class Model {

	
	public static void work(HttpServletRequest request) {
		String path = request.getSession().getServletContext().getRealPath("img");
		MultipartRequest mr;
		try {
			mr = new MultipartRequest(request, path, 30 * 1024*1024, "utf-8", 
					new DefaultFileRenamePolicy());
			
			String profile = mr.getFilesystemName("profile");
			
			URLEncoder.encode(profile, "utf-8");
			
			String name = mr.getParameter("name");
			String stuNum = mr.getParameter("stuNum");
			String perNum = mr.getParameter("perNum");
			String perNum2 = mr.getParameter("perNum2");
			String address = mr.getParameter("address");
			
			
			Bean b = new Bean(name, stuNum, perNum, perNum2, address, profile);
			
			request.setAttribute("b", b);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
