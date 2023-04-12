package FilesAndFolders.Files.repositories;

import FilesAndFolders.Files.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
