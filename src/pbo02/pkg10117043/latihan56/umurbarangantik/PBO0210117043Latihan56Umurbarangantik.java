/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan56.umurbarangantik;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan56Umurbarangantik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barangantik nBarangAntik = new barangantik(234);
        radio nRadio = new radio(nBarangAntik.umur);
        nRadio.setName("Radio AM");
        
        System.out.println("Nama barang antik : " + nRadio.getName());
        nBarangAntik.tammpilUmur();
        
        
    }
    
}
