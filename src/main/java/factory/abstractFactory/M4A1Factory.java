package factory.abstractFactory;

/**
 * M4A1工厂
 * @author zhoujl
 */
public class M4A1Factory implements Factory {
    public Gun produceGun() {
        return new M4A1();
    }

    public Bullet produceBullet() {
        return new M4A1Bullet();
    }
}
