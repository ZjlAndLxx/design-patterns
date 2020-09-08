package builder;

/**
 *套餐(抽象建造者)
 * @author zhoujl
 */
public abstract class MealBuilder {
    Meal meal = new Meal();

    /**
     *构建食物
     */
    public abstract void buildFood();

    /**
     * 构建饮料
     */
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    }
}
