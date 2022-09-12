package com.xworkz.implentor;

import com.xworkz.interfaces.NetBanking;
import com.xworkz.interfaces.UPI;
import com.xworkz.interfaces.Wallet;

public class GooglePayImp implements NetBanking, UPI, Wallet {

	@Override
	public void fillWalletDetails(double amount, String name) {
		System.out.println("Wallet amount is " + amount);
		System.out.println("Name is " + name);
	}

	@Override
	public void fillAccountHolderName(String holderName) {
		System.out.println("Account Holder Name is " + holderName);

	}

	@Override
	public void fillBankName(String bankName) {
		System.out.println("Bank Name is " + bankName);

	}

	@Override
	public int phoneNumber(long phoneNumber) {
		System.out.println("Phone no is " + phoneNumber);
		int otp = (int) (Math.random() * (400 - 200 + 1 + 200));

		return otp;
	}

	@Override
	public void fillOTP(int otp) {
		System.out.println("OTP is " + otp);

	}

	@Override
	public void payAmount(double price) {
		System.out.println("Amount piad successfully " + price);

	}

	@Override
	public void fillUPI(String id) {
		System.out.println("UPI is " + id);
	}

	@Override
	public void fillHolderName(String name) {
		System.out.println("Holder name is " + name);

	}

}
