package com.microsoft.store.partnercenter.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger support.
 * @See http://www.slf4j.org/docs.html
 */
public class SLF4JLogger implements ILogger {

    private static final Logger log = LoggerFactory.getLogger("PartnerCenterLogger");

    @Override
    public void logInformation(String message) {
        if (log.isInfoEnabled()) {
            log.info(message);
        }
    }

    @Override
    public void logWarning(String message) {
        log.warn(message);
    }

    @Override
    public void logError(String message) {
        log.error(message);
    }
}
