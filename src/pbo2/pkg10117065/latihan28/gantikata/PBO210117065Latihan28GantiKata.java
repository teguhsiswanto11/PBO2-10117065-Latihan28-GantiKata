package pbo2.pkg10117065.latihan28.gantikata;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Merubah kata yang ingin diganti pada kalimat secara 
 * menyeluruh
 * 
 */
public class PBO210117065Latihan28GantiKata {

    public static void main(String[] args) {
        
//        deklarasi Variabel
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
//        proses pergantian kata dengan kata yang lain
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
//        menampilkan hasil perubahan kata
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
        
        
        
    }
    
}
