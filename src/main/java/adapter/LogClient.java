package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端类实现
 * @author zhoujl
 */
public class LogClient {
    public static void main(String[] args) {
        LogBean logBean = new LogBean();
        logBean.setLogId("1");
        logBean.setOperationUser("michael");
        List<LogBean> list = new ArrayList<LogBean>();

        LogFileOperationApi logFileOperationApi = new LogFileOperation("");
        //创建操作日志的接口对象
        LogDbOperationApi api = new LogAdapter(logFileOperationApi);

        api.createLog(logBean);
    }
}
