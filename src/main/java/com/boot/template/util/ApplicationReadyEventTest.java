package com.boot.template.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-7-25 20:15
 * @Description: TODO
 */
@Component
public class ApplicationReadyEventTest {

    @EventListener(ApplicationReadyEvent.class)
    public void EventListenerExecute(){

        System.out.println("ApplicationReadyEvent is start");
    }
}
