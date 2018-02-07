package pkg1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentCompare {

	public static void main(String[] args) {
		
		ArrayList<Student> sl=new ArrayList<Student>();
		
		try {		
			BufferedReader in=new BufferedReader(new FileReader("input.txt"));
			String str;
			while((str=in.readLine())!=null) {
				//System.out.println(str);
				String[] words=str.split("\\s");
				int roll=Integer.parseInt(words[0]);
				String name=words[1];
				Double cgpa=Double.parseDouble(words[2]);
				
				sl.add(new Student(roll, name, cgpa));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		
//		
//		Student s=new Student(1, "zzzz", 3.5);
//		sl.add(s);
//		
//		sl.add(new Student(4, "sdbgt", 4.5));
//		sl.add(new Student(2, "qwert", 5.00));
//		
//		sl.add(new Student(5, "ASS", 2.13));
//		sl.add(new Student(3, "ass", 2.1));
		
		
		for (Student student : sl) {
			//System.out.println(student.roll+" "+student.name+" "+student.cgpa);
			System.out.println(student);
		}
		System.out.println();
		
		System.out.println("Sort By\n1.Roll\n2.Name\n3.CGPA\nEnter choice: ");
		
		Scanner scan=new Scanner(System.in);
		
		int input=scan.nextInt();
		
		Sorter s1;
		
//		switch (input) {
//		case 1:
//			s1=new Sorter(sl, new RollCompare());
//			break;
//		case 2:
//			s1=new Sorter(sl, new NameCompare());
//			break;
//		case 3:
//			s1=new Sorter(sl, new CGPACompare());
//		default:
//			break;
//		}
		
		//Sorter s1=new Sorter(sl, new RollCompare());
		
		//Sorter s1=new Sorter(sl, new NameCompare());
		
		//Sorter s1=new Sorter(sl, new CGPACompare());
		
		HashMap<Integer, ICompare> map=new HashMap<>();
		
		map.put(1, new RollCompare());
		map.put(2, new NameCompare());
		map.put(3, new CGPACompare());
		
		Sorter s11=new Sorter(sl, map.get(input));
		
		
		
		for (Student student : sl) {
			System.out.println(student);
		}
	}

}
