package com.mimaraslan03.ustsinifdegiskenvemetotlar;

public class Kamyon extends Arac{

	int kasaDurumu;
	
	
	
	
	public Kamyon() {
		super();
	}

	public Kamyon(int hizKapasitesi, int beygirGucu, int tekerSayisi,
			int yakitDepoKapasitesi, int modelYili, String yakitTuru,
			String ureticiMarkaAdi) {
		super(hizKapasitesi, beygirGucu, tekerSayisi, yakitDepoKapasitesi, modelYili,
				yakitTuru, ureticiMarkaAdi);
	}

	public Kamyon(int hizKapasitesi, int beygirGucu, int tekerSayisi,
			int yakitDepoKapasitesi, int modelYili, String yakitTuru,
			String ureticiMarkaAdi, int kasaDurumu) {
		super(hizKapasitesi, beygirGucu, tekerSayisi, yakitDepoKapasitesi,
				modelYili, yakitTuru, ureticiMarkaAdi);
		this.kasaDurumu = kasaDurumu;
	}





	public static void main(String[] args) {
		
	Kamyon kamyon = new Kamyon();
	
	
	kamyon.hizKapasitesi = 220;
	kamyon.beygirGucu = 3000;
	kamyon.tekerSayisi = 4;
	kamyon.yakitDepoKapasitesi = 360;
	kamyon.modelYili = 2014;
	
	kamyon.yakitTuru = "Benzin";
	kamyon.ureticiMarkaAdi = "Mercedes";
	
	System.out.println("ARAC ADI = " + kamyon.ureticiMarkaAdi);
	
	kamyon.calismayiBaslat();
	kamyon.freneBas();
	kamyon.gazaBas();
	kamyon.vitesDegistir(4);
	kamyon.calismayiSonlanir();
	
	
	}

}
