package adapter;

import com.sun.istack.internal.NotNull;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 实现对日志文件的操作
 * @author zhoujl
 */
public class LogFileOperation implements LogFileOperationApi {

    /**
     * 设置日志文件的路径和文件名称
     */
    private String logFileName;


    public LogFileOperation(@NotNull String logFileName){
        this.logFileName = logFileName;
    }

    public List<LogBean> readLogFile() {
        List<LogBean> list = null;

        ObjectInputStream oin = null;
        return list;
    }

    public void writeLogFile(List<LogBean> list) {
        File file = new File(logFileName);
        ObjectOutputStream outputStream = null;
    }
}
