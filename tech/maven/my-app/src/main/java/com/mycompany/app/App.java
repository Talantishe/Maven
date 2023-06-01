package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class App {
    static final Logger rootLogger = LogManager.getRootLogger();

    public static void main(String[] args) {
        rootLogger.info("info message");


        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("In debug message");
        }

        try {
            throw new NullPointerException("Null!!!");

        } catch (NullPointerException e) {
            rootLogger.error("error message: " + e.getMessage());
            rootLogger.fatal("fatal error message: " + e.getMessage());
        }
    }
}
