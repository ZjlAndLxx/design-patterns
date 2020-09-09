package prototype;

/**
 * produce的实现类
 * @author zhoujl
 */
public class MessageBox implements Product{
    /**
     * 保存装饰方框使用的字符样式
     */
    private char decoChar;

    public MessageBox(char decoChar){
        this.decoChar = decoChar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar+" "+s+" "+decoChar);
        for (int i = 0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    public Product creatClone() {
        Product product = null;
        try {
            product = (Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
