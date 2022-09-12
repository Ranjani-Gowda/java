package com.xworkz.interfaces;

public interface NetBanking {

	public abstract void fillBankName(String bankName);

	public abstract int phoneNumber(long phoneNumber);

	public abstract void fillOTP(int otp);

	public abstract void payAmount(double price);

}
