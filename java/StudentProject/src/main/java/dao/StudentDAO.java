package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.MajorDTO;
import dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	private DBManager manager;

	private StudentDAO() {
		manager = DBManager.getInstance();
	}

	public static StudentDAO getInstance() {
		if (instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		// 전체 학생 정보를 리스트에 담아서 리턴
		// 1. sql문 작성
		String sql = "SELECT * FROM student s";
		// 2. PreparedStatement 생성
		try (PreparedStatement pstmt = manager.getConnection().prepareStatement(sql)) {
			// 3. SQL 실행
			try(ResultSet rs = pstmt.executeQuery()){
				// 4. ResultSet으로 결과를 조회하면서 list에 StudentDTO 추가
				while(rs.next()) {
					String sno = rs.getString("sno");
					String sname = rs.getString("sname");
					double score = rs.getDouble("score");
					String mname = rs.getString("mname");
					
					list.add(new StudentDTO(sno, sname, score, null, null, mname));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}

	public int deleteStudent(String sno) {
		int count = 0;
		String sql = "delete from student where sno = ?";
		try (PreparedStatement pstmt = manager.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, sno);
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public ArrayList<MajorDTO> selectAllMajor() {
		ArrayList<MajorDTO> list = new ArrayList<MajorDTO>();
		String sql = "SELECT * FROM major";
		try (PreparedStatement pstmt = manager.getConnection().prepareStatement(sql)) {
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					String mno = rs.getString("mno");
					String mname = rs.getString("mname");
					
					list.add(new MajorDTO(mno, mname));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}

	public int insertStudent(StudentDTO dto) {
		int count = 0;
		String sql = "insert into student(sno,sname,score,gender,mno) values(?,?,?,?,?)";
		try(PreparedStatement pstmt = 
				manager.getInstance().getConnection().prepareStatement(sql)){
			pstmt.setString(1, dto.getSno());
			pstmt.setString(2, dto.getSname());
			pstmt.setDouble(3, dto.getScore());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getMno());
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public StudentDTO selectStudent(String sno) {
		StudentDTO student = null;
		System.out.println(sno);
		String sql = "SELECT * FROM student where sno = ?";
		try (PreparedStatement pstmt = manager.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, sno);
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					String sname = rs.getString("sname");
					double score = rs.getDouble("score");
					String gender = rs.getString("gender");
					String mno = rs.getString("mno");
					
					student = new StudentDTO(sno, sname, score, gender, mno, null);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(student);
		return student;
	}

	public int updateStudent(StudentDTO dto) {
		int count = 0;
		String sql = "update student set sname = ?, score = ?, gender = ?, "
				+ "mno = ? where sno = ?";
		try(PreparedStatement pstmt = 
				manager.getInstance().getConnection().prepareStatement(sql)){
			pstmt.setString(1, dto.getSname());
			pstmt.setDouble(2, dto.getScore());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getMno());
			pstmt.setString(5, dto.getSno());
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}
}







