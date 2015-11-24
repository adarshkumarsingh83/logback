package com.adarsh.log;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: //
 * Time: : PM
 * To change this template use File | Settings | File Templates.
 */

import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

import java.io.File;

public class SiftExample {

    public static void main(String[] args) throws JoranException ,Exception{

       File file=new File("c:\\app.lob");
        file.createNewFile();

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        lc.reset();
        configurator.setContext(lc);
        configurator.doConfigure(file.getAbsolutePath());


        Logger logger = LoggerFactory.getLogger(SiftExample.class);
        logger.debug("Application started");

        MDC.put("userid", "Alice");
        logger.debug("Alice says hello");

        StatusPrinter.print(lc);
    }

    static void usage(String msg) {
        System.err.println(msg);
        System.err.println("Usage: java " + SiftExample.class.getName()
                + " configFile\n" + "   configFile a logback configuration file");
        System.exit(0);
    }
}
