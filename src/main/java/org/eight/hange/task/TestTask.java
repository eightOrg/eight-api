package org.eight.hange.task;

import org.eight.hange.pojo.User;
import org.eight.hange.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2017/3/1.
 */
@Controller
public class TestTask {

    private static Logger logger = LoggerFactory.getLogger(TestTask.class);
    @Autowired
    private UserService userService;

    /*@Scheduled(cron="0/5 * * * * ?")
    public void task() {
        User user = userService.getUserById(5);
        logger.info(user.getUsername());
    }*/
}
