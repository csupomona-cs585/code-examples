package edu.csupomona.cs585.invoice;

public class GmailEmailService implements EmailService {

	private String gmailAccount;
	private String gmailConfig;

	public void sendInvoice(Invoice invoice, String email) {
		// use remote Gmail service to send the email
		// ...
	}

}
