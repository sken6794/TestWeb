package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.test.dto.FileDTO;
import com.test.dto.MemberDTO;

public class FileDAO {
	
private static FileDAO instance = new FileDAO();
	
	private FileDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	public static FileDAO getInstance() {
		return instance;
	}
	
	private String url ="jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "JSP";
	private String upw = "JSP"; 
	
	
	
	public int upload(String filename, String filerealname) {
		String sql = "INSERT INTO FILETEST VALUES (?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filename);
			pstmt.setString(2, filerealname);
			return pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getMember의 메소드 오류");
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return -1;
	}
	
	public List<FileDTO> getFile() {
		String sql = "select * from filetest";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FileDTO> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				FileDTO dto = new FileDTO(rs.getString(1), rs.getString(2));
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getMember의 메소드 오류");
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}
}
