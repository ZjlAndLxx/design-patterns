package builder;

/**
 * 指挥者 KFC服务员
 * @author zhoujl
 */
public class KFCWaiter {
    private MealBuilder mealBuilder;
    public KFCWaiter(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }
    public Meal construct(){
        //准备食物
        mealBuilder.buildFood();
        //准备饮料
        mealBuilder.buildDrink();

        //准备完毕，返回完整套餐
        return mealBuilder.getMeal();
    }
}
