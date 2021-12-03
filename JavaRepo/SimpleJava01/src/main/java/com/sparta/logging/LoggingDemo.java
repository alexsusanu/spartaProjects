package com.sparta.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
    private static Logger logger = LogManager.getLogger("Sparta App"); // LoggingDemo.getClass().getName();

    public static void main(String[] args) {
        logger.info("info message");
    }
}
