package results.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultQueries implements IQueries {
	private static final String URL="jdbc:derby://localhost:1527/student";
	private static final String USERNAME = "binaya";
    private static final String PASSWORD = "binaya";
    private static final String TABLE_NAME = "MARKS";
    
    private Connection connection = null;
    private PreparedStatement selectResultById = null;
    private PreparedStatement selectResultInRange = null;
    private PreparedStatement selectAllResult = null;
    private PreparedStatement updateRecord = null;
	
	public ResultQueries() {
		try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            selectResultById = connection.prepareStatement("Select * From marks where studentId= ?");
            selectResultInRange = connection.prepareStatement("Select * From marks where total>= ? AND total <=?");
            selectAllResult = connection.prepareStatement("Select * From marks");
            updateRecord = connection.prepareStatement("UPDATE marks SET exam = ?, total = ? WHERE studentId = ?");
            if(connection!=null)
            	System.out.println("Connection succeeded");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}

	public List<Result> getAllResults() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Result> getResultsForStudent(String s) throws SQLException {
		List<Result> result=null;
		ResultSet resultset=null;
		selectResultById.setString(1,s);
		resultset=selectResultById.executeQuery();
		result=new ArrayList<Result>();
		while(resultset.next()) {
			result.add(new Result(resultset.getString("studentId"), resultset.getInt("assignment1"), resultset.getInt("assignment2"), resultset.getInt("exam"), resultset.getInt("total"), resultset.getString("grade")));
		}
		return result;
	}

	public List<Result> getResultsInRange(int t1, int t2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateExamAndTotalMarks(String sid, int exam, int total) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
