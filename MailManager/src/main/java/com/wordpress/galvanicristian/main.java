

package com.wordpress.galvanicristian;

import java.io.File;

/**
 *
 * @author alvani Cristian galvani.cristian@gmail.com
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    
    public static Boolean isThere(String file) {
        Boolean res = false;
        File _file = new File(file);
        res = _file.exists();
        return res;
    }
}
