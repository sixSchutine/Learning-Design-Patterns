package strategy;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取类名，并返回实例对象
    public static Discount getDiscount()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//strategy//config.xml"));

            //获取包含Discount类型名称的文本节点
            NodeList nl = doc.getElementsByTagName("DiscountName");
            Node classNode = nl.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(className);
            Object obj = c.getConstructor().newInstance();
            return (Discount) obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static Method getMethod()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//strategy//config.xml"));

            //获取包含Method类型名称的文本节点
            NodeList nl = doc.getElementsByTagName("MethodName");
            Node classNode = nl.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(className);
            Object obj = c.getConstructor().newInstance();
            return (Method) obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
