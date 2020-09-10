package adapter;

/**
 * 定义数据库操作接口
 * @author zhoujl
 */
public interface LogDbOperationApi {

    /**
     * 新增日志
     * @param logBean 需要新增的日志
     */
    void createLog(LogBean logBean);
}
