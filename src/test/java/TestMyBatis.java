import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.eight.hange.pojo.User;
import org.eight.hange.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService;

    @Test
    public void test1() {
        User user = userService.getUserById(5);
        logger.info(JSON.toJSONString(user));
    }
}
