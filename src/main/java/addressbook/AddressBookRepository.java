package addressbook;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addressbook", path = "addressbook.json")
public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {
}
