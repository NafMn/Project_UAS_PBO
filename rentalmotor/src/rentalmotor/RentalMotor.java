/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rentalmotor;
 import java.util.Scanner;
/**
 *
 * @author Niko Rianr
 * Kelas TI-B
 * 21104410083
 */
public class RentalMotor  {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Motor[] daftar = new Motor[3];
    daftar[0] = new Matik("Vario", "Honda", 200000);
    daftar[1] = new Bebek("Satria", "Suzuki", 150000);
    daftar[2] = new Sport("Ninja", "Kawasaki", 250000);
    
        System.out.println("Daftar Motor yang Tersedia: ");
        for (int i = 0; i < daftar.length; i++) {
         System.out.println("Motor " + (i + 1));
         daftar[i].info();
         System.out.println();
        }

        System.out.print("Masukkan nomor motor yang ingin disewa: ");
        int pilihan = input.nextInt();
        System.out.println("Anda memilih sewa motor: ");
        daftar[pilihan - 1].info();
    }
}