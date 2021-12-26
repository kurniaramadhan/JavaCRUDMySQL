package org.itenas.oop.jdbc.daoimpl;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.itenas.oop.jdbc.bean.KaryawanTetap;
import org.itenas.oop.jdbc.dao.KaryawanTetapDAO;
import org.itenas.oop.jdbc.utils.DatabaseUtil;
import org.itenas.oop.jdbc.views.TableView;

public class KaryawanTetapDAOImpl implements KaryawanTetapDAO {

	@Override
	public KaryawanTetap getKaryawanTetapByNip(int nip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KaryawanTetap getKaryawanTetapByNama(String nama) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getKaryawanTetapByEmail(String email) {
		DatabaseUtil db = new DatabaseUtil();
		KaryawanTetap karyawanTetap = new KaryawanTetap();
		try {
			db.connect();
 
            String query = "SELECT * FROM karyawantetap WHERE email = '"+email+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	karyawanTetap.setNip(Integer.parseInt(rs.getObject(1).toString()));
                    	karyawanTetap.setNama(rs.getObject(2).toString());
                        karyawanTetap.setEmail(rs.getObject(3).toString());
                        karyawanTetap.setJamKerjaPerhari(Integer.parseInt(rs.getObject(4).toString()));
                        karyawanTetap.setLamaBekerja(Integer.parseInt(rs.getObject(5).toString()));
                        karyawanTetap.setGajiTetap(Double.parseDouble(rs.getObject(6).toString()));
                        karyawanTetap.setJumlahDinasLuar(Integer.parseInt(rs.getObject(7).toString()));
                        karyawanTetap.setTotalGaji(Double.parseDouble(rs.getObject(8).toString()));
                    }
                } while (rs.next());
                
            } else {
            	karyawanTetap.setNip(0);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleKaryawanTetap(karyawanTetap);
	}

	@Override
	public String getNamaByNip(int nip) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<KaryawanTetap> getAllKaryawanTetap() {
		List<KaryawanTetap> listKaryawanTetap = new ArrayList<KaryawanTetap>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			 
            String query = "SELECT * FROM karyawantetap";
         
            ResultSet rs = db.readData(query);
 
            // process query results
            while (rs.next()) {
 
        		KaryawanTetap karyawanTetap = new KaryawanTetap();
            	
                karyawanTetap.setNip(Integer.parseInt(rs.getObject(1).toString()));
                karyawanTetap.setNama(rs.getObject(2).toString());
                karyawanTetap.setEmail(rs.getObject(3).toString());
                karyawanTetap.setJamKerjaPerhari(Integer.parseInt(rs.getObject(4).toString()));
                karyawanTetap.setLamaBekerja(Integer.parseInt(rs.getObject(5).toString()));
                karyawanTetap.setGajiTetap(Double.parseDouble(rs.getObject(6).toString()));
                karyawanTetap.setJumlahDinasLuar(Integer.parseInt(rs.getObject(7).toString()));
                karyawanTetap.setTotalGaji(Double.parseDouble(rs.getObject(8).toString()));
                
                listKaryawanTetap.add(karyawanTetap);
 
            } 
            //close db connection
            db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
		return listKaryawanTetap;
	}

	@Override
	public void updateKaryawanTetap(KaryawanTetap karyawanTetap) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE karyawantetap SET nama='"+karyawanTetap.getNama()+"',"
					+ " email='"+karyawanTetap.getEmail()+"',"
					+ " jam_kerja_per_hari="+karyawanTetap.getJamKerjaPerhari()+","
					+ " lama_bekerja="+karyawanTetap.getLamaBekerja()+","
					+ " gaji_tetap="+karyawanTetap.getGajiTetap()+","
					+ " jumlah_dinas_luar="+karyawanTetap.getJumlahDinasLuar()+","
					+ " total_gaji="+karyawanTetap.hitungTotalGaji()+" WHERE nip='"+karyawanTetap.getNip()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public void deleteKaryawanTetap(KaryawanTetap karyawanTetap) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM karyawantetap WHERE nip='"+karyawanTetap.getNip()+"'";
			db.executeQuery(query);
			TableView.displayTabelKaryawanTetap(getAllKaryawanTetap());
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void saveKaryawanTetap(KaryawanTetap karyawanTetap) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO karyawantetap (nip, nama, email, jam_kerja_per_hari, lama_bekerja, gaji_tetap, jumlah_dinas_luar, total_gaji)"
					+ " VALUES ("+karyawanTetap.getNip()+", '"
					+ karyawanTetap.getNama()+"', '"
					+ karyawanTetap.getEmail()+"', "
					+ karyawanTetap.getJamKerjaPerhari()+", "
					+ karyawanTetap.getLamaBekerja()+", "
					+ karyawanTetap.getGajiTetap()+", "
					+ karyawanTetap.getJumlahDinasLuar()+", "
					+ karyawanTetap.hitungTotalGaji()+")";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
	}

}
