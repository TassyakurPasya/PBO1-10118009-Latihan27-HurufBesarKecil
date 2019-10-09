/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Huruf Besar Kecil
 */
public class Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String kalimat;
        String hurufKecil;
        String hurufBesar;
        System.out.print("Masukan Kalimat = ");
        kalimat = input.nextLine();
         
        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
        System.out.println("======= Hasil Format =======");
        System.out.println("Huruf Besar = "+hurufBesar);
        System.out.println("Huruf Kecil = "+hurufKecil);
    }
    
}
