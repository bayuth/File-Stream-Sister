/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestreamdemo;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author Jarvvis
 */
public class MembacaGambar {
    public static void main(String[] args) throws IOException {
        Image img= null;
        try{
            File source= new File(JOptionPane.showInputDialog("Masukan alamat directory foto anda. contoh: d:/nama folder/nama file"));
            img= ImageIO.read(source);
            
            InputStream is = new BufferedInputStream(new FileInputStream("d:/book.png"));
            img= ImageIO.read(is);
        }
        catch(IOException e){
            
        }
        JFrame frame= new JFrame();
        JLabel label= new JLabel(new ImageIcon(img));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
