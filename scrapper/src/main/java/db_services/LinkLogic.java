package db_services;


import entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repositories.LinkRepository;

@Service
public class LinkLogic {
    private final LinkRepository linkRepository;

    public LinkLogic(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Page<Link> getLinks(){
        return linkRepository.findAll();
    }
}
