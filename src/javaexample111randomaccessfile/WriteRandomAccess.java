
package javaexample111randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class WriteRandomAccess {
    
    public static void RunIntArray(File fil, int lengthOfIntArray) {
        try{
        
            RandomAccessFile raf = new RandomAccessFile(fil, "rws");
            
            // writing..........................................................
            for (int i = 1; i <= lengthOfIntArray; i++) {
                raf.writeInt(i * 100);
            }
            
            // Place file-pointer at the file-beginning 
            // (in front of byte number 0)
            /*
            Sets the file-pointer offset, measured from the beginning of this
            file, at which the next read or write occurs. The offset may be 
            set beyond the end of the file. Setting the offset beyond the 
            end of the file does not change the file length. The file length 
            will change only by writing after the offset has been set 
            beyond the end of the file.
            */
            // raf.seek(0);
            
            // Place file-pointer in front of byte number 4
            // raf.seek(4);
        
            
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
        
    }// end-RunIntArray()
    
    //==========================================================================
    
    public static void RunChangeIntValue(File fil, long filePointerPosition, int value) {
        try{
        
            RandomAccessFile raf = new RandomAccessFile(fil, "rws");
            
            // Place file-pointer in front of byte number# filePointerPosition
            raf.seek(filePointerPosition);
            
            // show file-pointer-position
            long pos = raf.getFilePointer();
            System.out.println("File-pointer position: " + pos);
            
            // change int-value
            raf.writeInt(value);
            System.out.println("Writing (" + value + ") completed....");
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
        
    }// end-RunChangeIntValue()
    
    //==========================================================================
    
    public static void RunAddIntValueToFileEnd2(File fil, int value) {
        try{
        
            RandomAccessFile raf = new RandomAccessFile(fil, "rws");
            
            
            // get the file-length
            /*
            Returns the length of this file.
            */
            long len = raf.length();
            
            // place file-pointer at the file-end
            raf.seek(len);
            
            // write
            raf.writeInt(value);
            
            // close
            raf.close();
            
            System.out.println("Adding is completed....");
        
        }// end-try
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }// end-RunChangeIntValue()
    
    //==========================================================================
    
    public static void RunChangeTwoSuccessiveIntValues(File fil, long ptrPosVal1, int val1, int val2) 
    {
        try{
        
            RandomAccessFile raf = new RandomAccessFile(fil, "rws");
            
            raf.seek(ptrPosVal1);
            
            // show file-pointer-position
            long pos = raf.getFilePointer();
            System.out.println("File-pointer position: " + pos);
            
            // change int-value
            raf.writeInt(val1);                        
            raf.writeInt(val2);

            System.out.println("Writing (" + val1 + ", " + val2 + ") completed....");
            
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
        
    }// end-RunChangeTwoSuccessiveIntValues()
    
    //==========================================================================
    
    
    
}
