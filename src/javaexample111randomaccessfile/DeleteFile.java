
package javaexample111randomaccessfile;

import java.io.File;


public class DeleteFile {
    
    public static void Run(File fil) {
        
        if(fil.isFile())
        {
            fil.delete();
        }
    }
}
