public boolean deleteProcessDefinitionByDeploymentID(String deploymentID) {
        // 第二个参数开启级联删除，否则流程实例会自动删除，但任务不会
        // 在流程模板和流程实例被删除的情况下，任务无法完成，也无法删除
        try {
            repositoryService.deleteDeployment(deploymentID, true);
        } catch (ActivitiObjectNotFoundException e) {
            logger.info("[删除流程模板失败] [deploymentID=" + deploymentID + "]");
            return false;
        }
        logger.info("[删除流程模板成功] [deploymentID=" + deploymentID + "]");
        return true;
    }
