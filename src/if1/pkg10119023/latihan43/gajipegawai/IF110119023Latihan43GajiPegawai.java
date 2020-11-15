/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program menghitung gaji pegawai
 *
 */
public class IF110119023Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        
        String nm,a;
        int trans,tunj,gajipk,total;
        
        gp.setNama("Muhammad Farhan R");
        gp.setAlamat("bumi, galaxy bimasakti");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        nm = gp.getNama();
        a = gp.getAlamat();
        trans = gp.getUangTransport();
        tunj = gp.getUangTunjangan();
        gajipk = gp.getGajiPokok();
        
        gp.setTotalGaji(gp.totalGaji(tunj, trans, gajipk)); //hitung total
        total = gp.getTotalGaji();
        
        gp.tampilData(nm, a, tunj, trans, gajipk, total);
    }
    
}
