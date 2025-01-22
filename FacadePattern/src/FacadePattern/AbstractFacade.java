package FacadePattern;

import java.io.IOException;

public abstract class AbstractFacade {
    public abstract void processHtmlFile(String inputFilePath, String outputFilePath)
            throws IOException, IOException;
}
