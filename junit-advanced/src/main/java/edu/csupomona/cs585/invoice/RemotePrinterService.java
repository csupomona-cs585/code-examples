package edu.csupomona.cs585.invoice;

public class RemotePrinterService implements PrinterService {

	private String remoteIpAddr;
	private String printerDriver;

	public void printInvoice(Invoice invoice) {
		// send the invoice to the remote printer based on the
		// remote IP address
		// ..

		// use the right driver to print the invoice
		// ...
	}

}
