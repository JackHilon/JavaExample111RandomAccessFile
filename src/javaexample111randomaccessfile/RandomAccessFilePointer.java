
package javaexample111randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFilePointer {
    
    
    public static long PointerValue(File fil, long pointerPosition) {
        
        long posError = -98765;
        try{
            RandomAccessFile raf = new RandomAccessFile(fil, "rw");
            
            // place pointer at the position: pointerPosition
            raf.seek(pointerPosition);
            
            // get current pointer position
            long pos;
            pos = raf.getFilePointer();
            
            // close
            raf.close();
            
            return pos;
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
            return posError;
        }
        catch(Exception e)
        {
            System.out.println("Random-Access-File-Pointer error: " + e.toString());
            return posError;
        }
    }
    
    //==========================================================================
    
    public static long ShowRandomAccessFileLength(File fil) {
        
        long len = -98765;
        try{
            RandomAccessFile raf = new RandomAccessFile(fil, "rw");
            
            len = raf.length();
            
            raf.close();
            
            return len;
            
        }// end-try
        catch(IOException e)
        {
            System.out.println(e.toString());
            return len;
        }
        catch(Exception e)
        {
            System.out.println("Random-Access-File-Pointer error: " + e.toString());
            return len;
        }
    }
    
    
    
}
