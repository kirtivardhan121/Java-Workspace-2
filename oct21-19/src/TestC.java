public class TestC {

	public static void main(String[] args) {
		Student.cname = "DYPCOE";
		Student s1 = new Student();
		s1.name = "Vardhan";
		s1.usn = 18;
		System.out.println("College name is "+ Student.cname);
		System.out.println("Name is "+ s1.name);
		System.out.println("ID is "+ s1.usn);
	}

}