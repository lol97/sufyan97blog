package com.sufyan97.learn_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LevelLog {
	private static Logger log = LogManager.getLogger(LevelLog.class);
	
	public static void main(String[] args) {
		log.trace("Hai ini trace");
		log.debug("Hai ini info");
		log.info("Hai ini info");
		log.warn("Hai ini warning message");
		log.error("Errrrrrrr");
		log.fatal("fatalll");
	}
}
