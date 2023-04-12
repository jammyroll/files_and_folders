package FilesAndFolders.Files;

import FilesAndFolders.Files.repositories.FileRepository;
import FilesAndFolders.Files.repositories.FolderRepository;
import FilesAndFolders.Files.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesApplicationTests {
	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

}
