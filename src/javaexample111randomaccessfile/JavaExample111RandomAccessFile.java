
package javaexample111randomaccessfile;

import java.io.File;


public class JavaExample111RandomAccessFile {

    
    public static void main(String[] args) {
        
        final int lengthOfIntArray = 6;
        final int lengthOfIntArrayNew = 7;
        
        File fil = myHelper.CreateFile("myWorkinFolder", "myRandomAccessFile.dat");
        
        //----------------------------------------------------------------------
        
        // write int-array (length = 6) to file
        WriteRandomAccess.RunIntArray(fil, lengthOfIntArray);
        
        // read file
        ReadRandomAccess.RunWholeFile(fil, lengthOfIntArray);
        
        // read value number 0
        long pos = 0;
        int a1 = ReadRandomAccess.RunOneIntValue(fil, pos);
        System.out.println("Value# (" + pos + ") is: " + a1);
        
        //----------------------------------------------------------------------
        
        // place pointer at position = 4 and show it
        pos = 4;
        long ptr = RandomAccessFilePointer.PointerValue(fil, pos);
        System.out.println("File-Pointer is: " + ptr + " at position: " + pos);
        
        // change value at pos = 4
        int val = 22;
        pos = 4;
        WriteRandomAccess.RunChangeIntValue(fil, pos, val);
        
        // show file contents
        ReadRandomAccess.RunWholeFile(fil, lengthOfIntArray);
        System.out.println("--------------");
        //----------------------------------------------------------------------
        
        // show random-access-file length
        long len = RandomAccessFilePointer.ShowRandomAccessFileLength(fil);
        System.out.println("Random-Access-File length: " + len);
        
        // place file-pointer before file-beginning
        pos = len - 3 * 4;
        ptr = RandomAccessFilePointer.PointerValue(fil, pos);
        System.out.println("File-Pointer is: " + ptr + " at position: " + pos);
        
        // write in position after file-pointer
        int val1 = 44;
        int val2 = 55;
        WriteRandomAccess.RunChangeTwoSuccessiveIntValues(fil, pos, val1, val2);
        System.out.println("-.-.-.-.-.-.-.-.-");
        //----------------------------------------------------------------------
        
        // show file
        ReadRandomAccess.RunWholeFile(fil, lengthOfIntArray);
        System.out.println("-.-.-.-.-.-.-.-.-");

        //----------------------------------------------------------------------
        
        // add extra int value to the file-end
        val = 700;
        AddToRandomAccessFileEnd.RunIntValue(fil, 700);
        
        //----------------------------------------------------------------------
        
        // place file-pointer at the file-beginning
        pos = 0;
        ptr = RandomAccessFilePointer.PointerValue(fil, 0);
        
        // read file
        ReadRandomAccess.RunWholeFile(fil, lengthOfIntArrayNew);
        
        
        //======================================================================
        //============= Delete File ============================================
        //======================================================================
        
        DeleteFile.Run(fil);
        
    }// end-main
    
}
