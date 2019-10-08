package com.zmex.equalsAndHashCode.user;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;

	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String email, String password, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//    // Autogenerated
//    @Override
//    public int hashCode() {
//	return Objects.hash(address, email, firstName, lastName, password);
//    }
//
//    //Autogenerated
//    @Override
//    public boolean equals(Object obj) {
//	if (this == obj)
//	    return true;
//	if (!(obj instanceof User))
//	    return false;
//	User other = (User) obj;
//	return Objects.equals(address, other.address) && Objects.equals(email, other.email)
//		&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
//		&& Objects.equals(password, other.password);
//    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User u = (User) obj;

		if ((email == null && u.getEmail() != null) || email != u.getEmail()) {
			return false;
		}

		if ((firstName == null && u.getFirstName() != null) || firstName != u.getFirstName()) {
			return false;
		}

		if ((lastName == null && u.getLastName() != null) || lastName != u.getLastName()) {
			return false;
		}

		if ((password == null && u.getPassword() != null) || password != u.getPassword()) {
			return false;
		}

		if ((address == null && u.getAddress() != null) || address != u.getAddress()) {
			return false;
		}
		return true;
	}

}
