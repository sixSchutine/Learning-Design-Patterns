package FacadePattern;

public class AnalyzeInformation {
    // 删除HTML标记的方法
    public String removeHtmlTags(String content) {
        return content.replaceAll("<[^>]+>", "");
    }
}
