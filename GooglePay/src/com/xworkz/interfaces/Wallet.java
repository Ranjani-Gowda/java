package com.xworkz.interfaces;

public interface Wallet {

	public abstract void fillWalletDetails(double amount, String name);

	public abstract void fillAccountHolderName(String holderName);

	public abstract void payAmount(double amount);
}
