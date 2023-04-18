package tgBotClasses;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class TgBot {

    @Autowired
    private String getToken;

    TelegramBot bot = new TelegramBot("6247035103:AAHNinyHrm6HAOXWLRNrqqq0-3KDFDHxf2A");

    public void startBot(){
        TgBotMethods tgBotMethods = new TgBotMethods();
        tgBotMethods.setBot(bot);
        tgBotMethods.setUpdateListener();


        BotCommand[] botCommands = {new BotCommand("help","вывести окно с командами"),
        new BotCommand("track","начать отслеживание ссылки"),
        new BotCommand("untrack", "прекратить отслеживание ссылки"),
        new BotCommand("list", "показать список отслеживаемых ссылок")};
        bot.execute(new SetMyCommands(botCommands));

    }

}

