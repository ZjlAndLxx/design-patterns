package composite;

/**
 * 人力资源部
 * @author zhoujl
 */
public class HRDepartment extends Company{

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第"+depth +"层的机构名字为："+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+" 负责员工招聘");
    }
}
