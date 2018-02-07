package pkg1;

public class CGPACompare implements ICompare {

	@Override
	public int compare(Student o1, Student o2) {
		Double a=o1.cgpa;
		Double b=o2.cgpa;
		
		return a.compareTo(b);
	}

}
