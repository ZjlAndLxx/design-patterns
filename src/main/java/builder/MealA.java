package builder;

/**
 * 具体建造者，套餐A
 * @author zhoujl
 */
public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("炸鸡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
