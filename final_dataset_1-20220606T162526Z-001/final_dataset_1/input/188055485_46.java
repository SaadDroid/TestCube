public int insertExaminationProject(Integer collectionId, Integer projectId, ItemParam itemParam) {
        String projectName = techProjectMapper.getProjectNameByProjectId(projectId);
        ExaminationProject examinationProject = new ExaminationProject();
        examinationProject.setCollectionId(collectionId);
        examinationProject.setProjectId(projectId);
        examinationProject.setProjectName(projectName);
        examinationProject.setItemId(itemParam.getItemId());
        examinationProject.setItemName(itemParam.getItemName());
        examinationProject.setAmount(itemParam.getAmount());
        int count = examinationProjectMapper.insert(examinationProject);
        return count;
    }
