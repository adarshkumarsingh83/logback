package com.adarsh.logback.api;

import ch.qos.logback.core.rolling.RollingFileAppender;

import java.io.File;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class RollingFileAppenderImpl extends RollingFileAppender {

    private boolean customFileSystem = false;
    private String customFilePath = System.getProperty("user.home") + File.separator + "log" + File.separator;

    public void setCustomFilSystem(boolean customFileSystem) {
        this.customFileSystem = customFileSystem;
    }

    public void setFile(java.lang.String file) {
        if (customFileSystem) {
            try {
                file = customFilePath + file;
            } catch (Exception e) {

            }
        }
        super.setFile(file);
    }
}
