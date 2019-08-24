package com.mimaraslan01.innerclass;

public class BabaSinif {

	double s1, s2;
	
	public BabaSinif(double s1, double s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	
	
	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}


	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}



class EvlatSinif extends BabaSinif{
	int s3;

	public EvlatSinif(double s1, double s2, int s3) {
		super(s1, s2);
		this.s3 = s3;
	}
	
	
	
	
	
}





	public static void main(String[] args) {
	

	}

}
