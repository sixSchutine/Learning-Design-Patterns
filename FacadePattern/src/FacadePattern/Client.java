package FacadePattern;

import java.io.IOException;

public class Client {
    public static void main(String[] args){
        AbstractFacade afc;   //针对抽象外观类编程
        //读取配置文件，反射生成具体外观类对象
        afc = XMLUtil.getBean();
        try {
            afc.processHtmlFile("src//FacadePattern//example.html",
                    "src//FacadePattern//out.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
