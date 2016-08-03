package com.gelfman.sima.addressbook;

public class ContactData {
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final String companyName;
	private final String address;
	private final String homePhone;
	private final String mobilePhone;
	private final String workPhoen;
	private final String email;

	public ContactData ( String firstName, String middleName, String lastName, String companyName, String address, String homePhone, String mobilePhone, String workPhoen, String email ) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.workPhoen = workPhoen;
		this.email = email;
	}

	public String getFirstName () {
		return firstName;
	}

	public String getMiddleName () {
		return middleName;
	}

	public String getLastName () {
		return lastName;
	}

	public String getCompanyName () {
		return companyName;
	}

	public String getAddress () {
		return address;
	}

	public String getHomePhone () {
		return homePhone;
	}

	public String getMobilePhone () {
		return mobilePhone;
	}

	public String getWorkPhoen () {
		return workPhoen;
	}

	public String getEmail () {
		return email;
	}
}
