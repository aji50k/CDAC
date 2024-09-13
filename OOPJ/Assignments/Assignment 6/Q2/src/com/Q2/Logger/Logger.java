package com.Q2.Logger;

public class Logger {
    private static Logger instance;

    private StringBuilder logMessages;

    private Logger() {
        logMessages = new StringBuilder();
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }
}
