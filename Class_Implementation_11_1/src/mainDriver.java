//TEST OUTPUT FOR CLASSES
public class mainDriver {
	
	
	public static void main(String args[])
	{
		
	
		//Declare Student objects
		Student stu1 = new Student("John Baker", "xy2z");
		Student stu2 = new Student("Hannah Brown", "ox2y");
		Student stu3 = new Student("Li CoolLastName", "ud5y");
		Student stu4 = new Student("Lil Wayne", "os4a");
		Student stu5 = new Student("George Washington", "pq2r");
		Student stu6 = new Student("Queen Elizibeth", "px2t");
		
		//make an array holding students
		Student [] stuArray = new Student [] {stu1,stu2,stu3,stu4,stu5, stu6};
		
		//declare course objects
		Course course1 = new Course("CSCI 3110", "3110", 4);
		Course course2 = new Course("MATH 2030", "2030", 4);
		Course course3 = new Course("CSCI 3033", "3033", 4);
		Course course4 = new Course("Science 2340", "2340", 4);
		Course course5 = new Course("BIOL 1110", "1110", 4);
		
		//create an array holding courses
		Course [] courseArray = new Course [] {course1, course2, course3, course4, course5};
		
		//Declare Teacher objects
		Teacher teach1 = new Teacher("DR. Michael Fiction", 1, "CSCI 3110", 4);
		Teacher teach2 = new Teacher("Prof. Jo Exotic", 1, "MATH 2030", 4);
		Teacher teach3 = new Teacher("Dr. Greg LastName", 1, "CSCI 3033", 4);
		Teacher teach4 = new Teacher("Ms. Therrien Brwon", 1, "Science 2340", 4);
		Teacher teach5 = new Teacher("Sparky Einstein", 1, "BIOL 1110", 4);
		
		//create an array holding Teacher objects
		Teacher [] teachArray = new Teacher [] {teach1, teach2, teach3, teach4, teach5};
		
		//declare assignment objects
		Assignment assgn1 = new Assignment("Homweork", "3110", "HMWK 1", 20, "Answer MC questions", false);
		Assignment assgn2 = new Assignment("Test", "3110", "Test1", 50, "Answer questions as directed within the time limit", false);
		Assignment assgn3 = new Assignment("OLA", "3110", "OLA4", 25, "Make a templated class", true);
		Assignment assgn4 = new Assignment("Homework", "3110", "HMWK 5", 15, "Answer Odd questions in chapter 7 section 7.5", true);
		Assignment assgn5 = new Assignment("Quiz", "3110", "Quiz 6", 5, "Answer the MC questions", true);
		
		//make an array holding assignments
		Assignment [] assgnArray = new Assignment [] {assgn1, assgn2, assgn3, assgn4, assgn5};
		
		
		//Testing to strings
		System.out.println("Showing each classes toString");
		String stuString = stu1.toString();
		String teachString = teach1.toString();
		String courseString = course1.toString();
		String assgnString = assgn1.toString();
		System.out.println("Student to string\n"+stuString);
		System.out.println("Teacher to string\n"+teachString);
		System.out.println("Course to string\n"+courseString);
		System.out.println("Assignment to string\n"+assgnString);
		
		
		//Test Methods
		
		//test get assignment 
		System.out.println("TESTING STUDENT METHODS");
		System.out.println("testing Student get assignment");
		stu1.getAssignment(course1, "HMWK 1");
		System.out.println("After get assignment 1,\n" + stu1.assignments.get(0));
		
		System.out.println("Student will now turnin assignment");
		stu1.turnin(stu1.assignments.get(0));
		System.out.println("After turnin, assignment bool turned in should be true. \n" + stu1.assignments.get(0));
		
		
		//give course1 to teacher 1 to teach
		teach1.classes.add(course1);
		System.out.println("Teacher will add students to class");
		//teacher selects list of students to add to class
		for(int i =0; i<stuArray.length; i++)
		{
			if(i % 2 ==0)
			{
				teach1.classes.get(0).students.add(stuArray[i]);
			}
			
		}
		//Teacher prints out student in the class
		//this also tests student toString
		System.out.println("Printing out class");
		for (int i=0; i< teach1.classes.size(); i++)
		{
			System.out.println(teach1.classes.get(i));
			
		}
		//drop a student
		System.out.println("Teacher will drop a student");
		teach1.dropStudent(teach1.classes.get(0), stu3);
		
		//display new class
		System.out.println("Showing new class roster after dropping student");
		for (int i=0; i< teach1.classes.size(); i++)
		{
			System.out.println(teach1.classes.get(i));
			
		}
	
		//teacher makes assignment to add into class
		System.out.println("Teach will add assignment to a course");
		for(int i=0; i<assgnArray.length; i++)
		{
			teach1.setAssignment(teach1.classes.get(0), assgnArray[i]);
		}
		
		
		System.out.println("Course Assignments after adding");
		for(int i=0; i<teach1.classes.get(0).assignments.size(); i++)
		{
			System.out.println(teach1.classes.get(0).assignments.get(i));
		}
		
		System.out.println("Student will get assignment from class");
		stu1.getAssignment(course1, "HMWK 1");
		System.out.println("Students new assignment" + stu1.assignments.get(0));
		
		//Student assignments
		System.out.println("Showing student assignments pre grade"+ stu1.getAssignmentGrade(assgn1));
		
		teach1.assignGrades();
		System.out.println("Student assignment after grade" + stu1.getAssignmentGrade(assgn1));
		
		stu1.calcGPA();
		
		System.out.println("Student gpa with new grades\n" + stu1);
		
		
		
		
	}

}
