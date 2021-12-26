package org.itenas.oop.jdbc.views;

import java.util.Scanner;

import org.itenas.oop.jdbc.dao.KaryawanTetapDAO;
import org.itenas.oop.jdbc.daoimpl.KaryawanTetapDAOImpl;

public class KaryawanTetapView {
	
	public KaryawanTetapView() {
		
	}
	
	public static void displayMenuKaryawanTetap() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		KaryawanTetapDAO operation = new KaryawanTetapDAOImpl();
		System.out.println();			        
        System.out.println("              *****************************************                  ");
        System.out.println("              |            Data Karyawan Tetap        |                  ");
        System.out.println("              *****************************************                  ");
        System.out.println("              | Pilihan:                              |                  ");
        System.out.println("              |        1. Input Data		      |  				 ");
        System.out.println("              |        2. Cari Data By Email          |                  ");
        System.out.println("              |        3. Tampilkan Seluruh Data      |                  ");
        System.out.println("              |        4. Perbarui Data               |                  ");
        System.out.println("              |        5. Hapus Data                  |                  ");
        System.out.println("              |        6. Logout                      |                  ");
        System.out.println("              *****************************************                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = scanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = scanner.nextInt();
        }
        
        switch (menu) {
	        case 1:
	        	FormView.formInsertKaryawanTetap();
	        	break;
	        case 2:
	        	FormView.formSearchKaryawanTetapByEmail();
	        	break;
	        case 3:
	        	TableView.displayTabelKaryawanTetap(operation.getAllKaryawanTetap());
	        	break;
	        case 4:
	        	FormView.formUpdateKaryawanTetap();
	        	break;
	        case 5:
	        	FormView.formDeleteKaryawanTetap();
	        	break;
	        case 6:
	        	FormLoginView.menuLogin();
	        	break;
	        default:
	        	System.out.println("Warning: Pilihan yang anda masukkan salah!");  	
        }
        
        scanner.close();
	}
}
