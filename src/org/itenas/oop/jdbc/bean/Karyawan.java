
package org.itenas.oop.jdbc.bean;

abstract class Karyawan {
	int nip;
	String nama;
	String email;
	int jamKerjaPerhari;
	
	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getJamKerjaPerhari() {
		return jamKerjaPerhari;
	}
	
	public void setJamKerjaPerhari(int jamKerjaPerhari) {
		this.jamKerjaPerhari = jamKerjaPerhari;
	}

	public abstract double hitungTotalGaji();
}
