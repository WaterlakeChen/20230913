package cn.lzy.redis;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReidsRepository extends CrudRepository<Person, String> {
    List<Person> findByLastname(String lastname);
    Page<Person> findPersonByLastname(String lastname, Pageable page);
}
