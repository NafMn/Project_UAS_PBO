/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rentalnemotor;

/**
 *
 * @author Kelompok 3
 */
public abstract class JumlahBayar {
    int lamaSewa, hargaSewa, biayaTambah;
    
    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
       
    public int getbiayaTambah() {
        return biayaTambah;
    }

     public void setbiayaTambah(int biayaTambah ) {
        this.biayaTambah = biayaTambah;
    }
}