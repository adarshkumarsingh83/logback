package com.adarsh.manager;


import com.adarsh.service.MessageService;
import com.adarsh.service.MessageServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 29/4/13
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessageManagerImpl implements MessageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageManagerImpl.class);
    private static final MessageService MESSAGE_SERVICE = new MessageServiceImpl();

    @Override
    public String getWishMsg(String msg) {
        LOGGER.trace(msg);
        LOGGER.info(msg);
        LOGGER.debug(msg);
        LOGGER.warn(msg);
        LOGGER.error(msg);
        return MESSAGE_SERVICE.getWishMsg(msg);
    }
}
