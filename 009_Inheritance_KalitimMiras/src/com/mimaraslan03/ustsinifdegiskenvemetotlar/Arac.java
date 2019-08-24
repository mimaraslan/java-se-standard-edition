package com.mimaraslan03.ustsinifdegiskenvemetotlar;

public class Arac {
	int hizKapasitesi, beygirGucu, tekerSayisi, yakitDepoKapasitesi, modelYili;
	String yakitTuru, ureticiMarkaAdi;
	
	public void calismayiBaslat() {
		System.out.println("Calisma baslatildi.");		
	}
	
	public void freneBas() {
		System.out.println("Frene basildi.");	
	}
	
	public void gazaBas() {
		System.out.println("Gaza basildi.");	
	}
	
	public void vitesDegistir(int vites) {
		System.out.println("Vites degistirildi." + vites);	
	}
	
	public void calismayiSonlanir() {
		System.out.println("Calisma sonlandirildi.");	
	}
	
	
	
	
	

	public Arac(int hizKapasitesi, int beygirGucu, int tekerSayisi,
			int yakitDepoKapasitesi, int modelYili, String yakitTuru,
			String ureticiMarkaAdi) {
		this.hizKapasitesi = hizKapasitesi;
		this.beygirGucu = beygirGucu;
		this.tekerSayisi = tekerSayisi;
		this.yakitDepoKapasitesi = yakitDepoKapasitesi;
		this.modelYili = modelYili;
		this.yakitTuru = yakitTuru;
		this.ureticiMarkaAdi = ureticiMarkaAdi;
	}

	public Arac() {
		super();
	}

	public static void main(String[] args) {
		
		Arac arac = new Arac();
		
		arac.calismayiBaslat();
		arac.freneBas();
		arac.gazaBas();
		arac.vitesDegistir(2);
		arac.calismayiSonlanir();


		}

}
