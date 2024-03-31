package com.sufyan97.learn_log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LevelLogCustom {
	private static Logger log = LogManager.getLogger(LevelLogCustom.class);
	
	//custom BAHAYA_TA
	final static Level BAHAYA_TA = Level.forName("BAHAYA_TA", 250);
	
	public static void main(String[] args) {
		log.trace("Hai ini trace");
		log.debug("Hai ini info");
		log.info("Hai ini info");
		log.warn("Hai ini warning message");
		log.log(BAHAYA_TA, "waduhhh");
		log.log(Level.getLevel("BAHAYA_TA"), "lurrrr");
		log.error("Errrrrrrr");
		
		//custom SEBAIKNYA_JANGAN_BERCANDA
		log.log(Level.forName("SEBAIKNYA_JANGAN_BERCANDA", 150), "tulung lur");
		log.fatal("fatalll");		
	}
}
