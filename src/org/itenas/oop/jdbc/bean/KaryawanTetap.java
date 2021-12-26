package org.itenas.oop.jdbc.bean;

public class KaryawanTetap extends Karyawan {
	private int lamaBekerja;
	private double gajiTetap;
	private int jumlahDinasLuar;
	private double totalGaji;
	
	public int getLamaBekerja() {
		return lamaBekerja;
	}

	public void setLamaBekerja(int lamaBekerja) {
		this.lamaBekerja = lamaBekerja;
	}

	public double getGajiTetap() {
		return gajiTetap;
	}

	public void setGajiTetap(double gajiTetap) {
		this.gajiTetap = gajiTetap;
	}

	public int getJumlahDinasLuar() {
		return jumlahDinasLuar;
	}

	public void setJumlahDinasLuar(int jumlahDinasLuar) {
		this.jumlahDinasLuar = jumlahDinasLuar;
	}
	
	public void setTotalGaji(double totalGaji) {
		this.totalGaji = hitungTotalGaji();
	}
	
	public double getTotalGaji() {
		return totalGaji;
	}
	
	public double hitungInsentifLamaBekerja() {
		double insentifLamaBekerja = 0;
		if (lamaBekerja >= 5) {
			insentifLamaBekerja = 0.05 * gajiTetap;
		} else {
			insentifLamaBekerja = 0.01 * gajiTetap;
		}
		
		return insentifLamaBekerja;
	}
	
	public double hitungInsentifPerjalananDinas() {
		return jumlahDinasLuar * 100000;
	}

	@Override
	public double hitungTotalGaji() {
		return gajiTetap + hitungInsentifLamaBekerja() + hitungInsentifPerjalananDinas();
	}

}
