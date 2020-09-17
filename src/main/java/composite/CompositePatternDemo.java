package composite;

/**
 * 测试组合模式类
 * @author zhoujl
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        //总公司
        ConcreteCompany root = new ConcreteCompany("总公司");
        root.add(new HRDepartment("人力"));
        root.add(new FinanceDepartment("财务"));

        //子公司1
        ConcreteCompany company_1 = new ConcreteCompany("子公司1");
        company_1.add(new HRDepartment("子公司1人力"));
        company_1.add(new FinanceDepartment("子公司1财务"));
        root.add(company_1);

        //子公司2
        ConcreteCompany company_2 = new ConcreteCompany("子公司2");
        company_2.add(new HRDepartment("子公司2人力"));
        company_2.add(new FinanceDepartment("子公司2财务"));
        root.add(company_2);

        System.out.println("----------公司结构图-------------");
        root.display(1);

        System.out.println("---------部门职责-------------");
        root.lineOfDuty();
    }
}
