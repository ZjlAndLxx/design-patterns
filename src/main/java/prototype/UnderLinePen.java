package prototype;

/**
 * Product的实现类
 * @author zhoujl
 */
public class UnderLinePen implements Product {
    private char ulChar;

    public UnderLinePen(char ulChar){
        this.ulChar = ulChar;
    }

    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("\""+str+"\"");
        for (int i = 0;i<length+2;i++){
            System.out.print(ulChar);
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
