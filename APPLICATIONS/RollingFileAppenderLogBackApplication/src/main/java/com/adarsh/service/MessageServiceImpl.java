package com.adarsh.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 29/4/13
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessageServiceImpl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Override
    public String getWishMsg(String msg) {
        LOGGER.trace(msg);
        LOGGER.info(msg);
        LOGGER.debug(msg);
        LOGGER.warn(msg);
        LOGGER.error(msg);
        return msg.toUpperCase();

    }
}
