package factory.abstractFactory;

/**
 * 工厂接口
 * @author zhoujl
 */
public interface Factory {

    /**
     * 生产枪
     * @return
     */
    public Gun produceGun();

    /**
     * 生产子弹
     * @return
     */
    public Bullet produceBullet();
}
