/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_02;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 *
 * @author kaby
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "/home/kaby/Documents/test.txt";
        InputStream fileInput;
        fileInput = new FileInputStream(path);
        
        int data = fileInput.read();
        
        while (data != -1) {    
            
            System.out.print((char)data);
            
            
            data = fileInput.read();
            
        }
        
        fileInput.close();

    }

}
