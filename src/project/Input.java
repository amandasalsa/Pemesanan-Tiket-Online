/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Amanda
 */
public class Input {
    private String nama, jenis, email;
    private int no;
    private char notelp;

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void setNotelp(char notelp){
        this.notelp = notelp;
    }
    
    public void setNo(int no){
        this.no = no;
    }
    
    String getNama(){
        return nama;
        
    }
    
    String getJenis(){
        return jenis;
        
    }
    
    
    int getNotelp(){
        return notelp;
    }
    
    int getNo(){
        return no;
        
    }
    public void display(){
        System.out.println("==            T I C K O          ==");
        System.out.println("|      PEMESANAN TIKET ONLINE     |");
        
        
        
        
    
    }
    
    
    }
    
    

