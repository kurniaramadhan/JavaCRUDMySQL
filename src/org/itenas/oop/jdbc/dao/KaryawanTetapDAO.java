package org.itenas.oop.jdbc.dao;

import java.util.List;

import org.itenas.oop.jdbc.bean.KaryawanTetap;

public interface KaryawanTetapDAO {
    public KaryawanTetap getKaryawanTetapByNip(int nip);
    public KaryawanTetap getKaryawanTetapByNama(String nama);
    public void getKaryawanTetapByEmail(String email);
    public String getNamaByNip(int nip);
    
    public List<KaryawanTetap> getAllKaryawanTetap();
    public void saveKaryawanTetap(KaryawanTetap karyawanTetap);
    public void updateKaryawanTetap(KaryawanTetap karyawanTetap);
    public void deleteKaryawanTetap(KaryawanTetap karyawanTetap);
}
