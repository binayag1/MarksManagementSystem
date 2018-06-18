package results.model;

import java.util.List;
import java.sql.SQLException;

public interface IQueries {
//	defining abstract methods 
	List<Result> getAllResults() throws SQLException;
	List<Result> getResultsForStudent(String s) throws SQLException;
	List<Result> getResultsInRange(int t1,int t2) throws SQLException;
	int updateExamAndTotalMarks(String sid,int exam,int total) throws SQLException;
}
