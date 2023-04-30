package repositories;

import entity.Link;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.Repository;

public interface LinkRepository extends Repository<Link, Long> {
    Page<Link> findAll();
}
