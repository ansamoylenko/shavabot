package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class ShavabotApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShavabotApplication.class, args);
		try {
			TelegramBotsApi botsApi =
					new TelegramBotsApi(
							DefaultBotSession.class);
			botsApi.registerBot(new Bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
