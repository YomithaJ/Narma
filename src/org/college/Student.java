package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("Yomitha");
}
	
	public void studentDept() {
		System.out.println("CSE");
}
	public void studentId() {
		System.out.println("33444");
}
	public static void main(String[] args) {
		Student s = new Student();
		s.studentDept();
		s.studentId();
		s.studentName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.HostelName();
		s.deptName();
	}
	

}
