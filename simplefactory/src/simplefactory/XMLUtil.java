package simplefactory;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil
{
    //该方法用于从XML配置文件中提取图表类型，并返回类型名称
    public static String getChartType()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//simplefactory//config.xml"));

            //获取包含图表类型名称的文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(1).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
