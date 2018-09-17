/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestreamdemo;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

/**
 *
 * @author Jarvvis
 */
public class FileStreamDemo {
FileInputStream input=null;
FileOutputStream output=null;
int data;
String copy="";

    

    public void readFile() throws FileNotFoundException, IOException{
        try{
            input = new FileInputStream("d:/inputan.txt");
            data= input.read();
            
            while(data != -1){
                System.out.print((char)data);
                data= input.read();
                copy += String.valueOf((char)data);
            }
//            System.out.println(" ");
        }
        catch(FileNotFoundException e){
            System.out.println("file tidak ditemukan "+e);
        }
        
    }
    public void copyIsi() throws FileNotFoundException{
        try{
            output = new FileOutputStream("d:/file baru3.txt");
            for (int i = 0; i < copy.length(); i++) {
                output.write((byte)copy.charAt(i));
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {
        FileStreamDemo rf= new FileStreamDemo();
        rf.readFile();
        rf.copyIsi();
    }
    
   
    
}
