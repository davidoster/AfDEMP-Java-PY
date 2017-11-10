/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class IOCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Do it with Scanner class 
//        ScannerImpl sci = new ScannerImpl();
//        sci.readfrom();
        //        Do it with Buffer class
//        BufferImpl bi = new BufferImpl();
//        try {
//            bi.readBuffer();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

// ---------------Read File with BufferedReader ------------------
//        try {
//
//            //br = new BufferedReader(new FileReader(FILENAME));
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Spyros\\Documents\\test.txt"));
//            String sCurrentLine;
//
//            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
//            }
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }
        // ---------------Read File with Scanner ------------------
//        File file = new File("C:\\Users\\Spyros\\Documents\\test.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            System.out.println(line);
//        }
//        sc.close();
//-------------------Write to file -------------------
        PrintWriter writer;
        try {
            writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOCode.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
