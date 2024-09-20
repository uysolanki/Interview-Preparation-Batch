package day10;

import java.util.Comparator;

public class PerComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getPer() < s2.getPer())
			return 1;
		else if (s1.getPer() > s2.getPer())
			return -1;
		else
			return 0;
	}

}
