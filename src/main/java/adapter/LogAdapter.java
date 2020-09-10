package adapter;

import java.util.List;


/**
 * 适配器对象，将记录日志到文件的功能适配成数据库模式
 * @author zhoujl
 */
public class LogAdapter implements LogDbOperationApi {

    /**
     * 被适配的接口
     */
    private LogFileOperationApi adaptee;

    public LogAdapter(LogFileOperationApi adaptee){
        this.adaptee = adaptee;
    }

    public void createLog(LogBean logBean) {
        List<LogBean> list = adaptee.readLogFile();
        list.add(logBean);
        adaptee.writeLogFile(list);
    }
}
