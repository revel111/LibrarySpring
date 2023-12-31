package library.data;

import library.custom.Writer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WriterRepository extends CrudRepository<Writer, Long> {
}