package testeatakapi.testeatakapi.link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface LinkRepository extends JpaRepository<Link, Integer> {

}
