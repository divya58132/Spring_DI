package com.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP","default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Greeting - Spanish";
	}

}
