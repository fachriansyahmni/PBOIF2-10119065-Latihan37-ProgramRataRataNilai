package pboif2.pkg10119065.latihan37.programrataratanilai;

import java.util.Scanner;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung rata-rata nilai 
                          dengan objek
 */
public class PBOIF210119065Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        mhs.setTotalMahasiswa(sc.nextInt());
        
        for(int i=1; i <= mhs.getTotMahasiswa(); i++)
        {
         System.out.print("Nilai mahasiswa ke-"+i+" : ");
         mhs.setNilai(sc.nextDouble());
        }
        System.out.println("\nMaka, rata-rata nilainya adalah " + mhs.calcRataRata());
        System.out.println("Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
