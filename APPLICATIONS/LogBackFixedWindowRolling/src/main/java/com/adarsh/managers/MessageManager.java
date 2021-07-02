package com.adarsh.managers;

import com.adarsh.services.MessageService;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 27/4/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageManager {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MessageManager.class);

    public String getMessage(String msg) {
        msg = new MessageService().getMessage(msg);
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
