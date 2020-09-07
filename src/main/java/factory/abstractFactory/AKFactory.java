package factory.abstractFactory;

/**
 * AK工厂
 * @author zhoujl
 */
public class AKFactory implements Factory{
    public Gun produceGun() {
        return new AK();
    }

    public Bullet produceBullet() {
        return new AKBullet();
    }
}
