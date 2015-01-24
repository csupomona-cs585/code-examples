package edu.csupomona.cs585.invoice;

public class Customer {

	private String email;
	private boolean prefersEmails;

	public boolean prefersEmails() {
		return prefersEmails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPrefersEmails(boolean prefersEmails) {
		this.prefersEmails = prefersEmails;
	}
}
