
package javaexample111randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class AddToRandomAccessFileEnd {
    
    
    public static void RunIntValue(File fil, int val) 
    {
        try{
        
            RandomAccessFile raf = new RandomAccessFile(fil, "rws");
            
            // Place file-pointer in front of byte number# filePointerPosition
            long len = raf.length();
            raf.seek(len);
            
            
            raf.writeInt(val);

            System.out.println("Adding (" + val + ") completed....");
            
            // close
            raf.close();
        
        }// end-try
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}
