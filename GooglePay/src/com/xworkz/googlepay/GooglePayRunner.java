package com.xworkz.googlepay;

import com.xworkz.implentor.GooglePayImp;
import com.xworkz.interfaces.NetBanking;
import com.xworkz.interfaces.UPI;
import com.xworkz.interfaces.Wallet;

public class GooglePayRunner {

	public static void main(String[] args) {

		UPI upi = new GooglePayImp();
		upi.fillHolderName("Sonu");
		upi.fillUPI("924856@upi");
		upi.payAmount(1599.75);
		System.out.println();

		NetBanking nb = new GooglePayImp();
		nb.fillBankName("Union Bank");
		int phoneNumberOTP = nb.phoneNumber(7829452172l);
		nb.fillOTP(phoneNumberOTP);
		nb.payAmount(7520.85);
		System.out.println();

		Wallet w = new GooglePayImp();
		w.fillAccountHolderName("Likith");
		w.fillWalletDetails(805.12, "Poorvi");
		w.payAmount(8951.21);
	}

}
