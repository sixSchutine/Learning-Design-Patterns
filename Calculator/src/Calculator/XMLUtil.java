package Calculator;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取类名，并返回具体计算器
    public static CalculatorFactory getCalculator()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//Calculator//config.xml"));

            //获取包含计算器类型名称的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(className);
            Object obj = c.getConstructor().newInstance();
            CalculatorFactory calculatorFactory = (CalculatorFactory) obj;
            return calculatorFactory;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
