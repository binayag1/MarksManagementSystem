package results.model;

import java.awt.List;
import java.sql.SQLException;

public interface IQueries {
//	defining abstract methods 
	List getAllResults() throws SQLException;
	List getResultsForStudent(String s) throws SQLException;
	List getResultsInRange(int t1,int t2) throws SQLException;
	int updateExamAndTotalMarks(String sid,int exam,int total) throws SQLException;
	
	

}
