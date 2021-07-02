package com.adarsh.service.test;

import com.adarsh.service.MessageService;
import com.adarsh.service.MessageServiceImpl;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 29/4/13
 * Time: 9:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessageServiceTest {

    @Test
    public void test() {
        MessageService messageService = new MessageServiceImpl();
        for (int i = 0; i < 10; i++) {
            System.out.println(messageService.getWishMsg("hi this is adarsh "));
        }

    }
}
