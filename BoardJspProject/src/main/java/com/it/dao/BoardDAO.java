package com.it.dao;

import java.util.*;  //List
import java.sql.*;  //Connection, PreparedStatment,ResultSet

public class BoardDAO {
	private Connection conn =null;
	private PreparedStatement ps = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USENAME = "root";
	private final String PASSWORD = "1234";
	

	//드라이브 등록
	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이브 메모리 할당
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Mysql 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL,USENAME,PASSWORD); 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Mysql 해제
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//1.목록출력
	//게시물 정보 한개 : BoardVO, 게시물 여러개 : (List)
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> list = new ArrayList<BoardVO>();
	
		try {
			//1.연결
			getConnection();
			//2.sql문장 작성
			int rowsize= 10;
			int start = (rowsize*page) - rowsize;
			String sql = "select no, subject, name, DATE FORMAT(regdate, '%Y-%m-%d'), hit"
					+ "from jspBoard order by no desc limit ?, ?"; //limit기능은 어디부터 어디까지 데이터를 가져와라
			                                                       //오라클엔 없는 기능. mysql엔 있음.
			//3.전송
			ps = conn.prepareStatement(sql);
			//4.데이터 채우기
			ps.setInt(1, start);
			ps.setInt(2, rowsize);
			//5.실행
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
			//6.닫기
			rs.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	//2.홈페이지()
	public int boardTotalPage() {
		int total = 0;
		
		try {
			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard";
			
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			rs.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return total;
	}
	
	
}
