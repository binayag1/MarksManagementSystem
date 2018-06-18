package results.view;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import results.presenter.ResultPresenter;

public class ResultsView extends JFrame implements IView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ResultPresenter resultpresenter=new ResultPresenter();
	final JTextArea textarea=new JTextArea(12,25);	
	
	ResultsView(ResultPresenter rp){
		
	}
	public ResultsView() {
		super("Marks Management System");
		initComponents();
	}
	
	public void bind(ResultPresenter rp) {
		this.resultpresenter=rp;
	}
	private void initComponents() {
//		Defining Labels 
		JLabel inputLabel=new JLabel("Input");
		JLabel outputLabel=new JLabel("Output");
		JLabel studentIdLabel=new JLabel("Student Id");
		JLabel assignment1Label=new JLabel("Assignment 1");
		JLabel assignment2Label=new JLabel("Assignment 2");
		JLabel examinationLabel=new JLabel("Examination");
		JLabel totalLabel=new JLabel("Total");
		JLabel gradeLabel=new JLabel("Grade");
		JLabel selectqueriesLabel=new JLabel("Select queries for the following attributes:");
//		Defining JText Boxes 
		final JTextField studnetIdTextField=new JTextField(15);
		final JTextField assignment1TextField=new JTextField(15);
		final JTextField assignment2TextField=new JTextField(15);
		final JTextField examinationTextField=new JTextField(15);
		final JTextField totalTextField1=new JTextField(5);
		final JTextField totalTextField2=new JTextField(5);
		final JTextField gradeTextField=new JTextField(15);
		
//		Defining Buttons 
		JButton allStudentsButton=new JButton("All Students");
		JButton specifiedStudentButton=new JButton("Specified Student");
		JButton allStudentInRangeButton=new JButton("All studnts in range");
		JButton updateExamAndTotalButton=new JButton("Update Exam and Total");
		JButton clearButton=new JButton("Clear");
		JButton exitButton=new JButton("Exit");
		
//		Defining TextArea
		
	
		JPanel panel1=new JPanel();
		setSize(600,400);
		add(panel1);
		Insets insets = panel1.getInsets();
		panel1.setLayout(null);
		panel1.add(inputLabel);
		panel1.add(outputLabel);
		panel1.add(studentIdLabel);
		panel1.add(studnetIdTextField);
		panel1.add(textarea);
		panel1.add(assignment1Label);
		panel1.add(assignment1TextField);
		panel1.add(assignment2Label);
		panel1.add(assignment2TextField);
		panel1.add(examinationLabel);
		panel1.add(examinationTextField);
		panel1.add(totalLabel);
		panel1.add(totalTextField1);
		panel1.add(totalTextField2);
		panel1.add(gradeLabel);
		panel1.add(gradeTextField);
		panel1.add(selectqueriesLabel);
		panel1.add(allStudentsButton);
		panel1.add(updateExamAndTotalButton);
		panel1.add(specifiedStudentButton);
		panel1.add(clearButton);
		panel1.add(allStudentInRangeButton);
		panel1.add(exitButton);
		Dimension size = inputLabel.getPreferredSize();
		inputLabel.setBounds(55 + insets.left, 5 + insets.top,
		             size.width, size.height);
		size = outputLabel.getPreferredSize();
		outputLabel.setBounds(350 + insets.left, 5 + insets.top,
		             size.width, size.height);
		size = studentIdLabel.getPreferredSize();
		studentIdLabel.setBounds(25 + insets.left, 35 + insets.top,
		             size.width, size.height);
		size = studnetIdTextField.getPreferredSize();
		studnetIdTextField.setBounds(120 + insets.left, 35 + insets.top,
		             size.width, size.height);
		size = assignment1Label.getPreferredSize();
		assignment1Label.setBounds(25 + insets.left, 65 + insets.top,
		             size.width, size.height);
		size = assignment1TextField.getPreferredSize();
		assignment1TextField.setBounds(120 + insets.left, 65 + insets.top,
		             size.width, size.height);
		
		size = assignment2Label.getPreferredSize();
		assignment2Label.setBounds(25 + insets.left, 95 + insets.top,
		             size.width, size.height);
		size = assignment2TextField.getPreferredSize();
		assignment2TextField.setBounds(120 + insets.left, 95 + insets.top,
		             size.width, size.height);
		
		size = examinationLabel.getPreferredSize();
		examinationLabel.setBounds(25 + insets.left, 125 + insets.top,
		             size.width, size.height);
		size = examinationTextField.getPreferredSize();
		examinationTextField.setBounds(120 + insets.left, 125 + insets.top,
		             size.width, size.height);
		
		size = totalLabel.getPreferredSize();
		totalLabel.setBounds(25 + insets.left, 155 + insets.top,
		             size.width, size.height);
		size = totalTextField1.getPreferredSize();
		totalTextField1.setBounds(120 + insets.left, 155 + insets.top,
		             size.width, size.height);
		size = totalTextField2.getPreferredSize();
		totalTextField2.setBounds(220 + insets.left, 155 + insets.top,
		             size.width, size.height);
		
		size = gradeLabel.getPreferredSize();
		gradeLabel.setBounds(25 + insets.left, 185 + insets.top,
		             size.width, size.height);
		size = gradeTextField.getPreferredSize();
		gradeTextField.setBounds(120 + insets.left, 185 + insets.top,
		             size.width, size.height);
		
		size = selectqueriesLabel.getPreferredSize();
		selectqueriesLabel.setBounds(25 + insets.left, 215 + insets.top,
		             size.width, size.height);
		
		size = allStudentsButton.getPreferredSize();
		allStudentsButton.setBounds(45 + insets.left, 245 + insets.top,
		             size.width, size.height);
		size = updateExamAndTotalButton.getPreferredSize();
		updateExamAndTotalButton.setBounds(400 + insets.left, 245 + insets.top,
		             size.width, size.height);
		size = specifiedStudentButton.getPreferredSize();
		specifiedStudentButton.setBounds(45 + insets.left, 275 + insets.top,
		             size.width, size.height);
		size = clearButton.getPreferredSize();
		clearButton.setBounds(400 + insets.left, 275 + insets.top,
		             size.width, size.height);
		size = allStudentInRangeButton.getPreferredSize();
		allStudentInRangeButton.setBounds(45 + insets.left, 305 + insets.top,
		             size.width, size.height);
		size = exitButton.getPreferredSize();
		exitButton.setBounds(400 + insets.left, 305 + insets.top,
		             size.width, size.height);
		size = textarea.getPreferredSize();
		textarea.setBounds(300 + insets.left, 35 + insets.top,
		             size.width, size.height);
//		Action Listener For All Buttons
		allStudentsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					resultpresenter.allStudents();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		specifiedStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button is pressed");
				String studentId=studnetIdTextField.getText();
				if(studentId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter student ID", "Error Message", 1);
				}
				else {
				try {
					resultpresenter.specifiedStudent(studentId);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		allStudentInRangeButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int total1=Integer.parseInt(totalTextField1.getText());
				int total2=Integer.parseInt(totalTextField2.getText());
				if(total1==0 || total2==0) {
					JOptionPane.showMessageDialog(null, "Please enter total1 and total2", "Error Message", 1);
				}
				else {
					resultpresenter.allStudentInRange(total1, total2);
				}
				
			}
		});
		updateExamAndTotalButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String student=studnetIdTextField.getText().toString();
				try {
				int exam=Integer.parseInt(examinationTextField.getText());
				int total=Integer.parseInt(totalTextField1.getText());
				if(exam==0 || total==0 || student==null) {
					JOptionPane.showMessageDialog(null, "Please enter student name,exam and total", "Error Message", 1);
				}
				else {
					resultpresenter.updateExamAndTotal(student, exam, total);
				}
				}
				catch(NumberFormatException exception) {
					exception.getMessage();
					JOptionPane.showMessageDialog(null, "Please Input exam and total in number format", "Warning Message", 1);
				}
				
				
			}
		});
		clearButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				resultpresenter.clear();
			}
		});
		exitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	public ResultPresenter getPresenter(){
		return resultpresenter;
	}

	public void display(String s) {
		textarea.setText(s);
	}
	
}
