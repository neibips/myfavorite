package scrapper;

import db_services.ChatLogic;
import db_services.LinkLogic;
import entity.Chat;
import entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper")



public class ScrapperDataBaseController {

    ChatLogic chatLogic;

    LinkLogic linkLogic;
    @GetMapping("/chats")
    @ResponseBody
    public Page<Chat> chats(){
        return chatLogic.getChats();
    }
    @GetMapping("/links")
    @ResponseBody
    public Page<Link> links(){
        return linkLogic.getLinks();
    }

}
