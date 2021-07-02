package com.adarsh.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class Main {

    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100000; i++) {
            logger.debug("This is a debug message " + i);
            logger.info("This is a info message" + i);
            logger.warn("This is a warn message " + i);
            logger.error("This is an error message " + i);
            logger.trace("This is a trace message " + i);
        }

    }

}

