package com.adarsh.services;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 27/4/13
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageService {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MessageService.class);

    public String getMessage(String msg) {
        msg += " " + new Date();
        for (int i = 0; i < 100000; i++) {
            logger.debug("This is a debug message " + msg + i);
            logger.info("This is a info message" + msg + i);
            logger.warn("This is a warn message " + msg + i);
            logger.error("This is an error message " + msg + i);
            logger.trace("This is a trace message " + msg + i);
        }

        return msg;
    }
}
