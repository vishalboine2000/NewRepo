
public class Admin {
	
	
	
	public static void main(String[] args) {
		StudentSchedular studSch=new StudentSchedular();
		
		System.out.println(studSch.addStudent(101, "Manoj"));
		
		System.out.println(studSch.addStudent(101, "Sachin"));
		
		studSch.showAllStudents();
	}

	

}
