package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class RequestHandler {
    private static final Logger logger = LoggerFactory.getLogger(RequestHandler.class);
    public String reqHandler(){
        MDC.put("caseId","123456");

        System.out.println("Hello from sysout");
        logger.info("Lucky if you see me!!!");
        for (int i = 1; i <= 5; i++) {
            logger.info("Hello: " + i);
        }
        MDC.clear();
        return "Hello World";
    }
}
