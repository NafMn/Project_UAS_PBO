/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rentalnemotor;

/**
 *
 * @author Kelompok 3
 */


//ini menggunakan Inheritance
public class Hitung extends JumlahBayar{ 

    //Dengan  menggunakan encapsulasi
    public Hitung(int lamaSewa,int hargaSewa, int biayaTambah ) {
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.biayaTambah = biayaTambah;
    }
    
    @Override
    public int getLamaSewa() {
        return lamaSewa;
    }

    @Override
    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

  @Override
    public int getHargaSewa() {
        return hargaSewa;
    }

  @Override
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public int getbiayaTambah() {
        return biayaTambah;
    }

    @Override
    public void setbiayaTambah(int biayaTambah) {
        this.biayaTambah = biayaTambah;
    }



    
    public String Hitung(){
        Rental rental = new Rental();
        rental.totalBayar = (lamaSewa * hargaSewa)+biayaTambah;
        String kabehbayar = Integer.toString(rental.totalBayar);
        return kabehbayar;
    }
}