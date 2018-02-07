package pkg1;
import java.util.ArrayList;

public class Sorter {
	ArrayList<Student>sl;
	ICompare ic;
	public Sorter(ArrayList<Student>sl,ICompare ic) {
		this.sl=sl;
		this.ic=ic;
		
		sort();
	}
	private void sort() {
		int smallest;
		for(int i=0;i<sl.size()-1;i++) {
			smallest=i;
			for(int index=i+1;index<sl.size();index++) {
				if(ic.compare(sl.get(index), sl.get(smallest))<0) 
					smallest=index;
				//else if(ic.compare(sl.get(index), sl.get(smallest))==1)
					
			}
			swap(i,smallest);
		}

	}
	
	private void swap(int i,int j) {
		Student temporary=sl.get(i);
		sl.set(i, sl.get(j));
		sl.set(j, temporary);
	}
	
}
