package adapter;

/**
 * 日志数据对象
 * @author zhoujl
 */
public class LogBean {
    /**
     * 日志编号
     */
    private String logId;

    /**
     * 操作人员
     */
    private String operationUser;

    @Override
    public String toString() {
        return "LogBean{" +
                "logId='" + logId + '\'' +
                ", operationUser='" + operationUser + '\'' +
                '}';
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperationUser (){
        return operationUser;
    }

    public void setOperationUser(String operationUser) {
        this.operationUser = operationUser;
    }
}
