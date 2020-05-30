/*
****************************************************************************
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*    * Redistributions of source code must retain the above copyright
* notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
* notice, this list of conditions and the following disclaimer in the
* documentation and/or other materials provided with the distribution.
*     * Neither the name of the LSC Project nor the names of its
* contributors may be used to endorse or promote products derived from
* this software without specific prior written permission.
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
* IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
* TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
* PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
* OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
* EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
* PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
* PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
* LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
*                  ==LICENSE NOTICE==
*
*         Galvani Cristian galvani.cristian@gmail.com      
****************************************************************************
*
*  This development has been done on top of other components, which are
*  licensed under their own license see COMPONENTS.TXT
 */
package com.wordpress.galvanicristian;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author alvani Cristian galvani.cristian@gmail.com
 */
public class main {

    private static final Logger LOG = LoggerFactory.getLogger(main.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LOG.debug("Hello from Logback !!!!!");

        String message = "This is a String";
        Integer zero = 0;

        try {
            LOG.debug("Logging message: {}", message);
            LOG.debug("Going to divide {} by {}", 42, zero);
            int result = 42 / zero;
        } catch (Exception e) {
            LOG.error("Error dividing {} by {} ", 42, zero, e);
        }
        if (isThere("logback.xml")){
            LOG.info("ESISTE");
        }else{
            LOG.info("NON ESISTE");
        }

    }

    public static Boolean isThere(String file) {
        Boolean res = false;
        File _file = new File(file);
        res = _file.exists();
        return res;
    }
}
