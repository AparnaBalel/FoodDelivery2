package com.solvd.foodDelivery.LogInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomLogger {
    private Logger LOGGER;
    static {
        System.getProperty("log4j.configurationFile", "log4j2.xml");
    }

    public CustomLogger(String className) {
        this.LOGGER = LogManager.getLogger(CustomLogger.class);
    }

    public void Info(String message) {
        // Log INFO messages
        this.LOGGER.info(message);
    }
    public void logWarning(String message) {
        // Log WARNING messages
        this.LOGGER.warn(message);
    }

    public void logError(String message, Throwable throwable) {
        // Log ERROR messages with associated Throwable
        this.LOGGER.error(message);
        if (throwable != null) {
            throwable.printStackTrace();
        }


    }

}