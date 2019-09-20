package com.boot.template.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-7-25 14:00
 * @Description: 项目启动时加载参数
 */
@Slf4j
@Component
@Order(1)
public class ApplicationRunTest implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        log.info("项目初始化自定义加载");
    }
}
