package results.presenter;

import java.sql.SQLException;
import java.util.List;

import results.model.IQueries;
import results.model.Result;
import results.view.IView;

public class ResultPresenter {
	IQueries queries;
	IView view;
	public ResultPresenter(IView view,IQueries q) {
		this.queries=q;
		this.view=view;
	}
	public ResultPresenter() {
			
	}
	public  void bind(IView v) {
		
	}
	public void clear() {
	}
	
	public void allStudents() throws SQLException {
		String name="";
		List<Result> results=queries.getAllResults();
		System.out.println(results);
		if(results.size()>0) {
			
			
		}
		
	}
	public void specifiedStudent(String student) throws SQLException {
		System.out.println(student);
		String result="";
		List<Result> results=queries.getResultsForStudent(student);
		if(results.size()>0) {
			for(Result record: results) {
				result+=record.getStudentId()+""+ record.getAssignment1()+""+record.getAssignment2();
			}
			view.display(result);
		}
	}
	public void allStudentInRange(int total1,int total2) {
		System.out.println(total1+"  ---"+total2);
	}
	public void updateExamAndTotal(String student,int exam,int total) {
		System.out.println(student+"---"+exam+"---"+total);
	}
	
}
