package FilesAndFolders.Files.repositories;

import FilesAndFolders.Files.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
