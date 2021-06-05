/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        
    
    int total, jmlh, kembalian;
    int nominal;
    Input nama=new Input();
    Input jenis=new Input();
    Input notelp=new Input();

    Scanner input = new Scanner(System.in);
    
    
        nama.display();
        System.out.println("-----------------------------------");
        System.out.println("-Silahkan input data-");
        System.out.print("Nama: ");
        nama.setNama(input.next());
        System.out.print("Jenis Kelamin: ");
        jenis.setJenis(input.next());
        System.out.print("No. Telepon: ");
        notelp.setNotelp((char) input.nextInt());
        System.out.println("-----------------------------------");
        
        System.out.println("===================================");
        System.out.println("==            T I C K O          ==");
        System.out.println("===================================");
        System.out.println("| NO       RUTE KERETA      HARGA |");
        System.out.println("| 1         BDG - DPK      75.000 |");
        System.out.println("| 2         JKT - SBY      67.500 |");
        System.out.println("| 3         JMB - MLG      73.000 |");
        System.out.println("| 4         LMG - MAD      70.500 |");
        System.out.println("| 5         MGT - MKS      85.500 |");
        System.out.println("===================================");
        System.out.println("|     PEMESANAN TIKET KERETA      |");
        System.out.println("===================================");
        System.out.println("===================================");
        
        

        System.out.print("Silahkan input nomor: ");
        int no = input.nextInt();
        
        switch (no){
            case 1:
                System.out.println("-------------------------");
                System.out.println("RUTE KERETA BANDUNG-DEPOK");
                System.out.println("-------------------------");
                System.out.println("Jumlah Tiket     : ");
                jmlh=input.nextInt();
                total = 75000*jmlh;
                System.out.println("Total Pembayaran : "+total); 
                System.out.println("Input Nominal    : ");
                nominal=input.nextInt();
                kembalian=nominal-total;
                System.out.println("Kembalian Anda   : "+kembalian);
                System.out.println("-------------------------");
                System.out.println("=     TERIMA KASIH      =");
                System.out.println("-------------------------");  
                break;
                
                case 2:
                System.out.println("----------------------------");
                System.out.println("RUTE KERETA JAKARTA-SURABAYA");
                System.out.println("----------------------------");
                System.out.println("Jumlah Tiket     : ");
                jmlh=input.nextInt();
                total = 67500*jmlh;
                System.out.println("Total Pembayaran : "+total); 
                System.out.println("Input Nominal    : ");
                nominal=input.nextInt();
                kembalian=nominal-total;
                System.out.println("Kembalian Anda   : "+kembalian);
                System.out.println("----------------------------");
                System.out.println("=        TERIMA KASIH      =");
                System.out.println("----------------------------"); 
                    break;
                    
                    case 3:
                System.out.println("------------------------");
                System.out.println("RUTE KERETA JAMBI-MALANG");
                System.out.println("------------------------");
                System.out.println("Jumlah Tiket     : ");
                jmlh=input.nextInt();
                total = 73000*jmlh;
                System.out.println("Total Pembayaran : "+total); 
                System.out.println("Input Nominal    : ");
                nominal=input.nextInt();
                kembalian=nominal-total;
                System.out.println("Kembalian Anda   : "+kembalian);
                System.out.println("------------------------");
                System.out.println("=     TERIMA KASIH     =");
                System.out.println("------------------------"); 
                        break;
                        
                        case 4:
                System.out.println("---------------------------");
                System.out.println("RUTE KERETA LAMONGAN-MADIUN");
                System.out.println("---------------------------");
                System.out.println("Jumlah Tiket     : ");
                jmlh=input.nextInt();
                total = 70500*jmlh;
                System.out.println("Total Pembayaran : "+total); 
                System.out.println("Input Nominal    : ");
                nominal=input.nextInt();
                kembalian=nominal-total;
                System.out.println("Kembalian Anda   : "+kembalian);
                System.out.println("---------------------------");
                System.out.println("=       TERIMA KASIH      =");
                System.out.println("---------------------------"); 
                            break;
                            
                            case 5:
                System.out.println("----------------------------");
                System.out.println("RUTE KERETA MAGETAN-MAKASSAR");
                System.out.println("----------------------------");
                System.out.println("Jumlah Tiket     : ");
                jmlh=input.nextInt();
                total = 85500*jmlh;
                System.out.println("Total Pembayaran : "+total); 
                System.out.println("Input Nominal    : ");
                nominal=input.nextInt();
                kembalian=nominal-total;
                System.out.println("Kembalian Anda   : "+kembalian);
                System.out.println("----------------------------");
                System.out.println("=       TERIMA KASIH       =");
                System.out.println("----------------------------"); 
                                break;
                                
                            default:
                                System.out.println("Error");
                                break;
                                
                          
       
            
        }
        
       
        
        
    
    }
}
