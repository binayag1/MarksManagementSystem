package results.model;

public class Result {
	private String studentId;
	private int assignment1;
	private int assignment2;
	private int exam;
	private int total;
	private String grade;

	public Result(String studentId,int assignment1,int assignment2,int exam,int total,String grade) {
		this.studentId=studentId;
		this.assignment1=assignment1;
		this.assignment2=assignment2;
		this.exam=exam;
		this.total=total;
		this.grade=grade;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getAssignment1() {
		return assignment1;
	}

	public void setAssignment1(int assignment1) {
		this.assignment1 = assignment1;
	}

	public int getAssignment2() {
		return assignment2;
	}

	public void setAssignment2(int assignment2) {
		this.assignment2 = assignment2;
	}

	public int getExam() {
		return exam;
	}

	public void setExam(int exam) {
		this.exam = exam;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Result [studentId=" + studentId + ", assignment1=" + assignment1 + ", assignment2=" + assignment2
				+ ", exam=" + exam + ", total=" + total + ", grade=" + grade + "]";
	}
	

}
