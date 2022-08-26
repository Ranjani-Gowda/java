package com.xworkz.Method;

public class Numbers {

	public static void  evenNo(int a[]) {
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
		public static void oddNo(int b[]) {
			for(int i=0;i<b.length;i++) {
				if (b[i]%2!=0) {
					System.out.println(b[i]);
				}
			}
		}
		public static void divisibleBy5(int c[]) {
			for(int i=0;i<c.length;i++) {
				if (c[i]%5==0) {
					System.out.println(c[i]);
				}
			}
		}
		public static void divisibleBy6(int d[]) {
			for(int i=0;i<d.length;i++) {
				if (d[i]%6==0) {
					System.out.println(d[i]);
				}
			}
		}
		public static void divisibleBy7(int e[]) {
			for(int i=0;i<e.length;i++) {
				if (e[i]%7==0) {
					System.out.println(e[i]);
				}
			}
		}
		public static void main(String[] args) {
			int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			Numbers.divisibleBy7(num);
			
		}
	}

