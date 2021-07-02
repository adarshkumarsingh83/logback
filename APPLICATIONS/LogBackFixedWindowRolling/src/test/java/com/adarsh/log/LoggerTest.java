package com.adarsh.log;

import com.adarsh.managers.MessageManager;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 27/4/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerTest {

    @Test
    public void test() {
        MessageManager messageManager = new MessageManager();
        System.out.println(messageManager.getMessage("Adarsh kumar singh"));

    }
}
