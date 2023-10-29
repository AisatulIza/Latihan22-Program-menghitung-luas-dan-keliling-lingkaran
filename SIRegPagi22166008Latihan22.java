package pkgLatihan22;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan perhitungan luas dan keliling lingkaran dengan input nilai diameter dan jari-jari dari user
*/
public class SIRegPagi22166008Latihan22 {
  public static void main(String[] args) {
    System.out.println("====Perhitungan Lingkaran====");
    //variabel
    double diameterling;
    double phi = 3.14;
    Scanner input = new Scanner(System.in);
    //input diameter
    System.out.print("Masukkan diameter lingkaran = ");
    diameterling = input.nextInt();
    System.out.println("====Hasil Perhitungan Lingkaran====");
    //input jari-jari
    System.out.print("Jari-jari Lingakaran = ");
    double r = input.nextInt();
    //menghitung luas lingakran
    double Luas = phi * r * r;
    //output luas
    System.out.println("Luas Lingakaran = " + Luas + "cm");
    //menghitung keliling lingkaran
    double Keliling = 2 * phi * r;
    //output keliling
    System.out.print("Kaliling Lingkaran = " + Keliling + "cm");
  }
}
