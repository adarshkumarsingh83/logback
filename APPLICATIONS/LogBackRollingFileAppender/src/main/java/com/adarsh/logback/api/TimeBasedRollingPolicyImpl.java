package com.adarsh.logback.api;

import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;

import java.io.File;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class TimeBasedRollingPolicyImpl extends TimeBasedRollingPolicy {

    private boolean customFileSystem = false;
    private String customFilePath = System.getProperty("user.home") + File.separator + "log" + File.separator;

    public void setCustomFilSystem(boolean customFileSystem) {
        this.customFileSystem = customFileSystem;
    }

    @Override
    public void setFileNamePattern(String fnp) {
        if (customFileSystem) {
            fnp = customFilePath + fnp;
        }
        fileNamePatternStr = fnp;
    }
}
