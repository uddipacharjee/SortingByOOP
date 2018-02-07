package pkg1;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	public int roll;
	public String name;
	public double cgpa;
	public Student(int roll, String name, double cgpa) {
		super();
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d %s %f", roll,name,cgpa);
	}


	@Override
	public int compareTo(Student o) {
		
		return roll-o.roll;
		
		
//		int cmpRoll=o.roll;
//		return roll-cmpRoll;
	}
	
	public static Comparator<Student> cmpByName=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator<Student> cmpBycgpa=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			//return (int) (o1.cgpa-o2.cgpa);
			Double a=o1.cgpa;
			Double b=o2.cgpa;
			
			return a.compareTo(b);
		}
	};
	
	public static Comparator<Student> cmpByRoll=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.roll-o2.roll;
		}
	};
	
}
