package FacadePattern;
import java.io.IOException;

public class Facade extends AbstractFacade{
    private ReadFile readFile;
    private AnalyzeInformation analyzeInformation;
    private SaveFile saveFile;

    public Facade() {
        this.readFile = new ReadFile();
        this.analyzeInformation = new AnalyzeInformation();
        this.saveFile = new SaveFile();
    }
    // 用户调用的简化方法
    public void processHtmlFile(String inputFilePath, String outputFilePath) throws IOException, IOException {
        // 1. 读取文件
        String content = readFile.read(inputFilePath);
        // 2. 处理文件（移除HTML标记）
        String processedContent = analyzeInformation.removeHtmlTags(content);
        // 3. 保存文件
        try {
            saveFile.save(outputFilePath, processedContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
