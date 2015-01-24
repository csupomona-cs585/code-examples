package edu.csupomona.cs585.invoice;

public interface EmailService {

	void sendInvoice(Invoice invoice, String email);

}
