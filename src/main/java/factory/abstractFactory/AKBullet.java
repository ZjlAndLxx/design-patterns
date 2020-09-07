package factory.abstractFactory;

/**
 * AK子弹
 * @author zhoujl
 */
public class AKBullet implements Bullet {
    public void load() {
        System.out.println("AK load bullet");
    }
}
