package addressbook;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "buddyinfo", path = "buddyinfo.json")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findByName(@Param("name") String name);
}
