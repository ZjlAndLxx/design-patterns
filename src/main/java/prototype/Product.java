package prototype;

/**
 * 复制功能接口
 * @author zhoujl
 */
public interface Product extends Cloneable {

    /**
     * 使用的方法
     * @param s 参数
     */
    void use(String s);

    /**
     * 复制实例的方法
     * @return 返回复制的实例
     */
    Product creatClone();
}
