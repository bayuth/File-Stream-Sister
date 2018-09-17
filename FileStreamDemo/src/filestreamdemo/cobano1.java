/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestreamdemo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jarvvis
 */
public class cobano1 {
     FileOutputStream out = null;
    FileInputStream input = null;
    int data;
    String copy ="";
    
    public void tulisFile(String data){
        try {
            out =  new FileOutputStream("d:/inputan.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        //menulis
        try {
            for (int i = 0; i < data.length(); i++) {
                //konversi data
                out.write((int)data.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //tutup
        try {
            out.close();
        } catch (Exception e) {
        }
    }
    
    public void bacaFile(String namaFile){
        //membuka file
        try {
            input = new FileInputStream("d:/.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan !");
        }
        
        try {
            while ((data = input.read())!= -1) {                
                System.out.print((char)data);
                copy += String.valueOf((char)data);
            }
            System.out.println("");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //tutup
        try {
            out.close();
        } catch (Exception e) {
        }
    }
    
    public void copyFile(){
        try {
            out =  new FileOutputStream("d:/output tiruan.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        //menulis
        try {
            for (int i = 0; i < copy.length(); i++) {
                //konversi data
                out.write((int)copy.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //tutup
        try {
            out.close();
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
     InputStreamReader in = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(in);
  
 cobano1 iofile = new cobano1();
       String data = "";
        
        System.out.println("--------------------------------");
        System.out.println("-----I/O File------");
        System.out.println("--------------------------------\n");
        
  try {
   System.out.print("Input data : ");
   data = br.readLine();
   iofile.tulisFile(data);
   System.out.print("Isi file asli : ");
   iofile.bacaFile("wim_asli");
   
   System.out.print("Copy data? (y/t) : ");
   String pilih = br.readLine();
   
   if(pilih.equalsIgnoreCase("y")){
    iofile.copyFile();
    System.out.print("Isi file tiruan : ");
    iofile.bacaFile("wim_tiruan");
   }else{
    System.exit(0);
   }
   
  } catch (Exception e) {
   // TODO: handle exception
  }
    }
}

