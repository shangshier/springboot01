package com.boot.template.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-8-30 17:45
 * @Description: TODO
 */
@Order(1)
@Component
public class CommandLineRunnerOrderOne implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("++++++++++++CommandLineRunnerOrderOne启动++++++++++++++");
    }
}
