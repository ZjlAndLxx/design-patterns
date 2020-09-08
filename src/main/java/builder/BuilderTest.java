package builder;

/**
 * 测试类
 * @author zhoujl
 */
public class BuilderTest {
    public static void main(String[] args) {
        MealA mealA = new MealA();
        KFCWaiter waiter = new KFCWaiter(mealA);

        Meal construct = waiter.construct();
        System.out.println("已出餐");
        System.out.println("食物："+construct.getFood()+";饮料："+construct.getDrink());
    }
}
