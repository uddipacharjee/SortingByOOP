package pkg1;

public class NameCompare implements ICompare {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
		
	}

}
