/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penejualanprojek;
import java.util.Scanner;
public class PenejualanProjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner I = new Scanner(System.in);
        int totalPrice = 0;
        
        System.out.println("============================");
        System.out.println("Selamat datang di agen ikan hias");
        System.out.println("============================"); 
        System.out.println("Masukkan nama anda ");
        System.out.print("Nama ");
        String nama = I.nextLine();
        
        System.out.println("");
        System.out.println("Silahkan pilih ikan yang ingin dibeli ");
        System.out.println("1. Ikan cupang >warna merah >6cm (Rp50.000,-)");
        System.out.println("2. Ikan koi >jenis Kohaku >23cm >Grade A (Rp500.000,-)");
        System.out.println("3. Ikan Black Ghost >warna hitam >8cm (Rp.9000,-)");
        System.out.println("4. Ikan Gupi >warna biru > 5cm(Rp5000)");
        
        boolean ulang = true;
        while (ulang){
        System.out.print("Masukkan nomor pilihan => ");
        int pilihan = I.nextInt();
        
        switch(pilihan){
            case 1 :
                totalPrice += 50000;
                break;
            case 2 :
                totalPrice += 500000;
                break;
            case 3 :
                totalPrice += 9000;
                break;
            case 4 :
                totalPrice += 5000;
                break;
            default :
                totalPrice +=0;
                break;
        }
            System.out.println("");
            System.out.println("Apakah ingin menambah pembelian ? (Ya/Tidak) ");
            String tanya = I.next();
            
            ulang = tanya.equalsIgnoreCase("Ya");   
        }
        System.out.println("");
        System.out.println("Total pembayaran Rp."+totalPrice);
        
        System.out.print("Masukkan uang anda => ");
        int bayar = I.nextInt();
        if(bayar>totalPrice){
            System.out.println("Kembalian anda = "+ (bayar - totalPrice)+"\nTerimakasih selamat berbelanja kembali");
        }else if(bayar==totalPrice){
            System.out.println("Uang anda pas\nTerimakasih selamat berbelanja kembali\"");
        }else{
            System.out.println("Mohon maaf uang anda kurang "+ (totalPrice-bayar)+"\nSilahkan pilih ikan lain");
        }
    }
    
}
