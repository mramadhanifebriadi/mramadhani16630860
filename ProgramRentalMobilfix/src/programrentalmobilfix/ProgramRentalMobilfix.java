/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programrentalmobilfix;

import java.util.Scanner;

/**
 *
 * @author Asus x441BA
 */
public class ProgramRentalMobilfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        String nama;
        int mobil , est , total;
        System.out.print("Program Rental Mobil\n");
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Pilihan : \n 1. Avanza (Rp.300.000/Hari) \n 2. Yaris(Rp.350.000/Hari) \n 3. Bemo (Rp.1.000.000/Hari) \n\n Masukan pilihan :");
        mobil = in.nextInt();
        System.out.print("Masukan estimasi penyewaan(dalam hitungan hari) : ");
        est = in.nextInt();
        switch (mobil){
            case 1:
            total = 300000 * est;
            System.out.println("Atas nama :"+nama+"\n telah menyewa mobil merk AVANZA \n Selama :"+est+"hari\n Dengan total bayar :"+total);
            break;
            case 2:
            total = 350000 * est;
            System.out.println("Atas nama :"+nama+"\n telah menyewa mobil merk Yaris \n Selama :"+est+"hari\n Dengan total bayar :"+total);
            break;
            case 3:
            total = 1000000 * est;
            System.out.println("Atas nama :"+nama+"\n telah menyewa mobil merk BEMO \n Selama :"+est+"hari\n Dengan total bayar :"+total);
            break;
        }
        }
        
        }
