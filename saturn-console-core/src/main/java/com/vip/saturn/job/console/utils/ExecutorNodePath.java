/**
 * vips Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */   
package com.vip.saturn.job.console.utils;   
/**
 * 项目名称：saturn-job-console 
 * 创建时间：2016年7月4日 下午2:21:55   
 * @author yangjuanying  
 * 文件名称：ExecutorNodePath.java  
 * 类说明：  
 */
public class ExecutorNodePath {

	public static final String $EXECUTOR_NODE_NAME = "$SaturnExecutors";
	
	public static final String SHARDING_COUNT_PATH = "/" + $EXECUTOR_NODE_NAME + "/sharding/count";
	
    private ExecutorNodePath() {
    }

    public static String get$ExecutorNodePath() {
        return "/" + $EXECUTOR_NODE_NAME;
    }
    
    public static String getExecutorNodePath() {
        return String.format("/%s/executors", $EXECUTOR_NODE_NAME);
    }
    
    public static String get$ExecutorTaskNodePath(String executorName) {
    	return String.format("/%s/executors/%s/task", $EXECUTOR_NODE_NAME, executorName);
    }
    
    public static String getExecutorNodePath(final String executorName) {
        return String.format("%s/%s", getExecutorNodePath(), executorName);
    }
    
    public static String getExecutorNodePath(final String executorName, final String nodeName) {
        return String.format("%s/%s/%s", getExecutorNodePath(), executorName, nodeName);
    }

    public static String getExecutorTaskNodePath(final String executorName) {
        return getExecutorNodePath(executorName, "task");
    }

    public static String getExecutorIpNodePath(final String executorName) {
        return getExecutorNodePath(executorName, "ip");
    } 
    
}
  