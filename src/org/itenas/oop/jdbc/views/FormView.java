package org.itenas.oop.jdbc.views;

import java.util.Scanner;


import org.itenas.oop.jdbc.bean.KaryawanTetap;
import org.itenas.oop.jdbc.dao.KaryawanTetapDAO;
import org.itenas.oop.jdbc.daoimpl.KaryawanTetapDAOImpl;

public class FormView {
	public static void formInsertKaryawanTetap() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		KaryawanTetap karyawanTetap = new KaryawanTetap();
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		System.out.println("              *****************************************                  ");
        System.out.println("              | Form Insert Data Karyawan Tetap       |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | NIP			:");
        karyawanTetap.setNip(scanner.nextInt());
        System.out.print("              | Nama		        :");
        karyawanTetap.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        karyawanTetap.setEmail(scanner2.nextLine());
        System.out.print("              | Jam Kerja Per Hari      :");
        karyawanTetap.setJamKerjaPerhari(scanner2.nextInt());
        System.out.print("              | Lama Bekerja            :");
        karyawanTetap.setLamaBekerja(scanner2.nextInt());
        System.out.print("              | Gaji Tetap              :");
        karyawanTetap.setGajiTetap(scanner2.nextDouble());
        System.out.print("              | Jumlah Dinas Luar       :");
        karyawanTetap.setJumlahDinasLuar(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.saveKaryawanTetap(karyawanTetap);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			KaryawanTetapView.displayMenuKaryawanTetap();
		}
	}
	
	public static void formUpdateKaryawanTetap() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int nip;
		char back;
		KaryawanTetap karyawanTetap = new KaryawanTetap();
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		System.out.print("Masukkan NIP dari data yang akan diupdate: ");
		nip = scanner.nextInt();
		System.out.println();
		System.out.println("              *****************************************                  ");
        System.out.println("              | Form Update Data Karyawan Tetap        |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | NIP			:");
        System.out.println(nip);
        karyawanTetap.setNip(nip);
        System.out.print("              | Nama		        :");
        karyawanTetap.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        karyawanTetap.setEmail(scanner2.nextLine());
        System.out.print("              | Jam Kerja Per Hari      :");
        karyawanTetap.setJamKerjaPerhari(scanner2.nextInt());
        System.out.print("              | Lama Bekerja            :");
        karyawanTetap.setLamaBekerja(scanner2.nextInt());
        System.out.print("              | Gaji Tetap              :");
        karyawanTetap.setGajiTetap(scanner2.nextDouble());
        System.out.print("              | Jumlah Dinas Luar       :");
        karyawanTetap.setJumlahDinasLuar(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.updateKaryawanTetap(karyawanTetap);;
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			KaryawanTetapView.displayMenuKaryawanTetap();
		}
	}
	
	public static void formDeleteKaryawanTetap() {
		Scanner scanner = new Scanner(System.in);
		int nip;
		KaryawanTetap karyawanTetap = new KaryawanTetap();
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		System.out.print("Masukkan NIP dari data yang akan dihapus: ");
		nip = scanner.nextInt();
		karyawanTetap.setNip(nip);
		operation.deleteKaryawanTetap(karyawanTetap);	
	}
	
	public static void formSearchKaryawanTetapByEmail() {
		Scanner scanner = new Scanner(System.in);
		String email;
		KaryawanTetap karyawanTetap = new KaryawanTetap();
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		System.out.print("Masukkan email dari data yang akan dicari: ");
		email = scanner.nextLine();
		karyawanTetap.setEmail(email);
		operation.getKaryawanTetapByEmail(email);	
	}
}
