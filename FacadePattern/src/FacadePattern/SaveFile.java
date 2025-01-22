package FacadePattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveFile {
    public void save(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
