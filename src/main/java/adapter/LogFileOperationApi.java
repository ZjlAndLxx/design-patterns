package adapter;

import java.util.List;

/**
 * 日志操作Api
 * @author zhoujl
 */
public interface LogFileOperationApi {

    /**
     * 读日志文件
     * @return 存储的日志列表
     */
    List<LogBean> readLogFile();

    /**
     * 写日志文件
     * @param list 日志内容
     */
    void writeLogFile(List<LogBean> list);
}
