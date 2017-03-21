/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3decorator.v2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 */
public class InputTest {

    public static void main(String[] args) throws IOException{
        int c;
        File file = new File("test.txt");
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream(file)));
            while ((c = in.read()) >= 0){
                System.err.print((char)c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
