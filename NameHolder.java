
public abstract class NameHolder {
	protected String firstName;

	public abstract String describeSelf();

	@Override
	public String toString() {
		return "First name: " + firstName;
	}

	protected void setFirstName(String firstName) throws NameException {
		if (!firstName.isEmpty())
			this.firstName = firstName;
		else
			throw new NameException("wrong");
	}

	protected String getFirstName() {
		return new String(firstName);
	}

}
