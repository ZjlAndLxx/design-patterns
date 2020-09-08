package builder;

/**
 * 具体建造者，套餐B
 * @author zhoujl
 */
public class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("米饭");
    }

    @Override
    public void buildDrink() {
        meal.setFood("橙汁");
    }
}
