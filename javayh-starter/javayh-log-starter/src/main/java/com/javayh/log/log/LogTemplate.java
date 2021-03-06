package com.javayh.log.log;

import com.javayh.common.util.StringUtils;

/**
 * <p>
 *      log记录模板
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-15 17:04
 */
public abstract class LogTemplate {
    /**前缀*/
    protected static final String PREFIX = "Java有货";
    /**链接符*/
    protected static final String JOINER = "-----";

    /**
     * <p>
     *       自定义前缀输出
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param prefix
     * @param stackTrace
     * @return void
     */
    protected abstract void logError(String prefix,StackTraceElement[] stackTrace);

    /**
     * <p>
     *       默认前缀统一输出
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param stackTrace
     * @return void
     */
    protected abstract void logError(StackTraceElement[] stackTrace);

    /**
     * <p>
     *       自定义前缀输出
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param prefix
     * @param e
     * @return void
     */
//    protected abstract void logError(String prefix, Exception e);

    /**
     * <p>
     *      默认输出
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param e
     * @return void
     */
//    protected abstract void logError(Exception e);

    /**
     * <p>
     *     自定义前缀输出
     *     Exception : Throwable cause = e.getCause();
     *     但是 cause.printStackTrace(); 会报空指针
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param prefix
     * @param e
     * @return void
     */
//    protected abstract void logError(String prefix, Throwable e);

    /**
     * <p>
     *       默认前缀输出
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param e
     * @return void
     */
//    protected abstract void logError(Throwable e);


    /**
     * <p>
     *       钩子
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param prefix
     * @return boolean
     */
    protected boolean verify(String prefix){
        boolean blank = StringUtils.isEmpty(prefix);
        return blank;
    }

    /**
     * <p>
     *       统一日志出口
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/3/15
     * @param prefix
     * @param stackTrace
     * @return void
     */
    public void logPrint(String prefix, StackTraceElement[] stackTrace){
        boolean verify = verify(prefix);
        if (verify){
            logError(stackTrace);
        }else {
            logError(prefix,stackTrace);
        }
    }


}
