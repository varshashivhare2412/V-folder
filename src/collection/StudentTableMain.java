package collection;
import java.util.ArrayList;
import java.util.List;
public class StudentTableMain {
	
	public static void main(String[] args) {
	 
	    // Create an Empty List of Student, And add few objects to the List
	    List<StudentTable> students = new ArrayList<StudentTable>();
	    students.add(new StudentTable("ST001", "Surya Prakash", "surya_prakash@gmail.com", 23, 'A'));
	    students.add(new StudentTable("ST002", "Varsha Shivhare", "varsha_shivhare@gmail.com", 22, 'c'));
	    students.add(new StudentTable("ST003", "Surya", "Surya@gmail.com", 25, 'b'));
	    students.add(new StudentTable("ST004", "Varsha", "Varsha@gmail.com", 24, 'A'));
	    students.add(new StudentTable("ST005", "SuuuVarrr", "VarrSuu@gmail.com", 22, 'e'));
	    
	    
	    // Print the list objects in tabular format.
	    System.out.println("-----------------------------------------------------------------------------");
	    System.out.printf("%10s %30s %20s %5s %5s", "STUDENT ID", "EMAIL ID", "NAME", "AGE", "GRADE");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------");
	    for(StudentTable student: students){
	        System.out.format("%10s %30s %20s %5d %5c",
	                student.getId(), student.getEmailId(), student.getName(), student.getAge(), student.getGrade());
	        System.out.println();
	    }
	    System.out.println("-----------------------------------------------------------------------------");
	}
	}


