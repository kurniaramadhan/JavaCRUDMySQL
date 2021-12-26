package org.itenas.oop.jdbc.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.jdbc.bean.KaryawanTetap;
import org.itenas.oop.jdbc.dao.KaryawanTetapDAO;
import org.itenas.oop.jdbc.daoimpl.KaryawanTetapDAOImpl;

public class TableView {
	public static void main(String[] args) {
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		displayTabelKaryawanTetap(operation.getAllKaryawanTetap());
	}
	
	public static void displayTabelKaryawanTetap(List<KaryawanTetap> listKaryawanTetap) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA KARYAWAN TETAP					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tNIP\t\t|\tNama\t\t\t|       Email       			|       Total Gaji   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (KaryawanTetap kTetap : listKaryawanTetap) {
			System.out.println("    |\t"+kTetap.getNip()+"\t|       "+kTetap.getNama()+"\t        |       "+kTetap.getEmail()+"\t|\t"+kTetap.getTotalGaji()+"    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			KaryawanTetapView.displayMenuKaryawanTetap();
		}
	}
	
	public static void displayTupleKaryawanTetap(KaryawanTetap karyawanTetap) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA KARYAWAN TETAP				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |NIP\t\t: " + karyawanTetap.getNip()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + karyawanTetap.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + karyawanTetap.getEmail()+"\t\t|");
		System.out.println("    |Total Gaji\t\t: " + karyawanTetap.hitungTotalGaji()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			KaryawanTetapView.displayMenuKaryawanTetap();
		}
	}
}
