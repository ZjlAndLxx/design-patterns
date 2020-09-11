package bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 从XML配置文件中提取具体类类名，并返回实例对象
 * @author zhoujl
 */
public class XMLUtilPen {
    private static final String COLOR = "color";
    private static final String PEN = "pen";
    public static Object getBean(String args){
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse("src/main/resources/configPen.xml");
            NodeList nodeList = null;
            Node classNode = null;
            String className = null;
            nodeList = doc.getElementsByTagName("className");
            if (COLOR.equals(args)){
                classNode = nodeList.item(0).getFirstChild();
            }else if (PEN.equals(args)){
                classNode = nodeList.item(1).getFirstChild();
            }
            className = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(className);
            Object object = c.newInstance();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
