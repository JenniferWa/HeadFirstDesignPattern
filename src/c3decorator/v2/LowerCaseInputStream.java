/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3decorator.v2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 */
public class LowerCaseInputStream extends FilterInputStream{
    public LowerCaseInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException {
        int c = super.read();
        return ( c == -1 ? c : Character.toLowerCase((char) c));
    }
    
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for(int i = offset; i < offset + result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
