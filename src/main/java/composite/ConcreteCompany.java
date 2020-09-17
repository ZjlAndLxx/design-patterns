package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *公司的具体实现
 * @author zhoujl
 */
public class ConcreteCompany extends Company{

    private List<Company> childrenCompany= new ArrayList<Company>();

    public ConcreteCompany(String name){
        super(name);
    }
    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第" +depth +"层的机构名为："+name);
        for (Company temp:childrenCompany) {
            temp.display(depth+1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company temp:childrenCompany) {
            temp.lineOfDuty();
        }
    }
}
