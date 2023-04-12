package FilesAndFolders.Files.components;

import FilesAndFolders.Files.models.File;
import FilesAndFolders.Files.models.Folder;
import FilesAndFolders.Files.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import FilesAndFolders.Files.repositories.FileRepository;
import FilesAndFolders.Files.repositories.FolderRepository;
import FilesAndFolders.Files.repositories.PersonRepository;

@Profile(("!test"))
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person matt = new Person("Matt");
        personRepository.save(matt);
        Folder fantasy = new Folder("Fantasy", matt);
        folderRepository.save(fantasy);
        File file1 = new File("How to train a dragon", "txt", 64, fantasy);
        fileRepository.save(file1);

    }
}
