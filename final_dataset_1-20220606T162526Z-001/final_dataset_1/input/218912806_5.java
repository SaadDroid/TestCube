public boolean isProcessInstanceEnd(String processInstanceId){
        ProcessInstance pi = runtimeService//表示正在执行的流程实例和执行对象
                .createProcessInstanceQuery()//创建流程实例查询
                .processInstanceId(processInstanceId)//使用流程实例ID查询
                .singleResult();
        if (pi == null){
            logger.info("[查询流程状态] [processInstanceId=" + processInstanceId + "] 流程已经结束，或者流程不存在");
            return true;
        } else {
            logger.info("[查询流程状态] [processInstanceId=" + processInstanceId + "] 流程未结束");
            return false;
        }
    }
