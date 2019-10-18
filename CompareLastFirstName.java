import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student> {

	public int CompareLastFirstName(Student first, Student last) {
		String firstName = first.getFirstName();
		String lastName = first.getFirstName();
		String firstNameLast = last.getLastName();
		String lastNameLast = last.getLastName();

		if (firstName.compareTo(firstNameLast) < 0) {
			return -1;
		} else if (firstName.compareTo(firstNameLast) == 0) {
			if (lastName.compareTo(firstNameLast) < 0)
				return -1;
			else if (lastName.compareTo(lastNameLast) == 0)
				return 0;
			else 
				return -1;
		} else
			return 1;		
	}
}
