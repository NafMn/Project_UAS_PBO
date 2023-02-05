/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rentalmotor;

/**
 *
 * @author Niko Rianr
 * Kelas TI-B
 * 21104410083
 */
class Bebek extends Motor {
  public Bebek(String nama, String merek, int harga) {
    super(nama, merek, harga);
  }

  @Override
  public void info() {
    System.out.println("Jenis: Bebek");
    System.out.println("Nama: " + getNama());
    System.out.println("Merek: " + getMerek());
    System.out.println("Harga: Rp." + getHarga());
  }
}