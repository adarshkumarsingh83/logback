package test;

import com.adarsh.manager.MessageManager;
import com.adarsh.manager.MessageManagerImpl;
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
        MessageManager messageService = new MessageManagerImpl();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(messageService.getWishMsg("hi this is adarsh "));
        }

    }
}
