
package javaexample111randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class myHelper {
   
    private static File CreateWorkingFolder(String folderName) {
        
        File folder = new File("." + File.separatorChar + folderName);
        
        folder.mkdir();
        
        return folder;
    }
    
    
    private static File CreateWorkingFile(File folder, String fileName) {
        
        /*
        public RandomAccessFile(File file, String string) 
        throws FileNotFoundException
        
        Creates a random access file stream to read from, and optionally
        to write to, the file specified by the File argument. A new
        FileDescriptor object is created to represent this file connection.
        
        The mode argument specifies the access mode in which the file is
        to be opened. The permitted values and their meanings are:
        
        Value       Meaning

        "r"         Open for reading only. Invoking any of the write methods of 
                    the resulting object will cause an IOException to be thrown.

        "rw"        Open for reading and writing. If the file does not already
                    exist then an attempt will be made to create it.

        "rws"       Open for reading and writing, as with "rw", and also 
                    require that every update to the file's content or 
                    metadata be written synchronously to the underlying 
                    storage device.

        "rwd"       Open for reading and writing, as with "rw", and also 
                    require that every update to the file's content be written 
                    synchronously to the underlying storage device.

        The "rws" and "rwd" modes work much like the force(boolean)
        method of the FileChannel class, passing arguments of true and false, 
        respectively, except that they always apply to every I/O operation and 
        are therefore often more efficient. If the file resides on a local 
        storage device then when an invocation of a method of this class 
        returns it is guaranteed that all changes made to the file by that 
        invocation will have been written to that device. This is useful for 
        ensuring that critical information is not lost in the event of 
        a system crash. If the file does not reside on a local device then 
        no such guarantee is made.
        
        The "rwd" mode can be used to reduce the number of I/O operations 
        performed. Using "rwd" only requires updates to the file's content 
        to be written to storage; using "rws" requires updates to both the 
        file's content and its metadata to be written, which generally 
        requires at least one more low-level I/O operation.
        
        If there is a security manager, its checkRead method is called
        with the pathname of the file argument as its argument to see 
        if read access to the file is allowed. If the mode allows writing, 
        the security manager's checkWrite method is also called with 
        the path argument to see if write access to the file is allowed.
        */
        
        File fil = new File(folder, fileName);
        try {
        fil.createNewFile();
        return fil;
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    private static void FolderCheck(File folder) {
        
        if(folder.isDirectory())
            System.out.println("A folder, named (" + folder.getName() + "), is created....");
        else System.out.println("Error....");
    }
    
    private static void FileCheck(File fil) {
        
        if(fil.isFile())
            System.out.println("A file, named (" + fil.getPath() + "), is created....");
        else System.out.println("Error....");
        
    }
    
    public static void ExceptionHandle(Exception e) {
      
        System.out.println(e.toString());
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    
    public static File CreateFile(String folderName, String fileName) {
        
        File folder = myHelper.CreateWorkingFolder(folderName);
        
        myHelper.FolderCheck(folder);
        
        File fil = myHelper.CreateWorkingFile(folder, fileName);
        
        myHelper.FileCheck(fil);
        
        return fil;
    }
    
    
}


