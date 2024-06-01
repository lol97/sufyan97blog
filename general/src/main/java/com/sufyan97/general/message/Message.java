package com.sufyan97.general.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Message {
	@Bean
	public MessageVO messageVO() {
		return new MessageVO();
	}
}
