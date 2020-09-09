package prototype;

import java.util.HashMap;

/**
 * Manager类使用product接口来复制实例
 * @author zhoujl
 */
public class Manager {
    /**
     * 报错实例的“名字”和“实例”的对应关系
     */
    private HashMap<String,Product> showcase = new HashMap<String, Product>();

    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String productName){
        Product p = showcase.get(productName);
        return p.creatClone();
    }
}
