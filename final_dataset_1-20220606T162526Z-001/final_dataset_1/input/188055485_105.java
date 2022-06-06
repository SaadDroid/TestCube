@Override
    public CommonResult getPatientResultInfo(Integer caseId){
        JSONObject returnJson = new JSONObject();
        //基本信息
        returnJson.put("基本信息", preliminaryCaseService.getPatientCaseInfo(1, caseId).getData());
        //检查结果
        returnJson.put("检查结果", inspectionMapper.getResult(caseId));
        //检验结果
        returnJson.put("检验结果", examinationMapper.getResult(caseId));
        //处置信息
        returnJson.put("处置信息", treatmentMapper.getInfo(caseId));
        //处方信息
        returnJson.put("处方信息", recipeMapper.getInfo(caseId));

        return CommonResult.success(returnJson);
    }
