package library.data;

import library.custom.Writer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WriterRepository extends CrudRepository<Writer, Long> {
    List<Writer> findAll();
}