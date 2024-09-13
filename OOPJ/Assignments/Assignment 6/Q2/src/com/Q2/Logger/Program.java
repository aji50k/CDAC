package com.Q2.Logger;

public class Program {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started.");
        logger.log("Processing data...");
        logger.log("Application finished.");

        System.out.println("Current Log:");
        System.out.println(logger.getLog());

        logger.clearLog();
        
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());
    }
}
