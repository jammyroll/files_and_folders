package FilesAndFolders.Files.repositories;

import FilesAndFolders.Files.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
