@Override
    public CommonResult getPatientCaseInfo(Integer doctorRoleId, Integer caseId){
        JSONObject returnJson = new JSONObject();
        JSONArray traditionalDiagnose = new JSONArray();
        JSONArray modernDiagnose = new JSONArray();
        JSONArray finalTraditionalDiagnose = new JSONArray();
        JSONArray finalModernDiagnose = new JSONArray();

        //参数检验
        if(caseId == null)
            return CommonResult.fail(ResultCode.E_801);//病历号参数异常
        if(doctorRoleId == null)
            return CommonResult.fail(ResultCode.E_801);//医生角色参数异常

        //病历信息
        HashMap patientCase = patientCaseMapper.getPatientCaseInfo(caseId);
        if(patientCase == null)
            return CommonResult.fail(ResultCode.E_800);//参数异常
        returnJson.put("caseId", caseId);
        returnJson.put("status",  patientCase.get("status"));
        returnJson.put("narrate",  patientCase.get("narrate"));
        returnJson.put("curTreatCondition", patientCase.get("curTreatCondition"));
        returnJson.put("assistDiagnose",  patientCase.get("assistDiagnose"));
        returnJson.put("curDisease",  patientCase.get("curDisease"));
        returnJson.put("allergy",  patientCase.get("allergy"));
        returnJson.put("pastDisease",  patientCase.get("pastDisease"));
        returnJson.put("physicalCondition",  patientCase.get("physicalCondition"));

        //诊断信息
        List<HashMap> diagnoses = diagnoseMapper.listDiagnosesDetailByCaseId(caseId);
        if(diagnoses.size() != 0) {
            //诊断类型
            Integer type;
            if (String.valueOf(diagnoses.get(0).get("type")).equals("中医疾病"))
                type = 0;// 中医诊断疾病
            else
                type = 1;// 西医诊断疾病
            returnJson.put("diagnoseType", type);

            for(HashMap diagnose: diagnoses) {
                Boolean isFirstDiagnosed = (Boolean)diagnose.get("isFirstDiagnosed");
                if (type == 0) {//中医
                    if (isFirstDiagnosed == true)
                        traditionalDiagnose.add(diagnose);//中医初诊
                    else
                        finalTraditionalDiagnose.add(diagnose);//中医确诊
                }
                else{ //西医
                    if (isFirstDiagnosed == true)
                        modernDiagnose.add(diagnose);//西医初诊
                    else
                        finalModernDiagnose.add(diagnose);//西医确诊
                }
            }
        }
        returnJson.put("traditionalDiagnose", traditionalDiagnose);
        returnJson.put("modernDiagnose", modernDiagnose);
        returnJson.put("finalTraditionalDiagnose", finalTraditionalDiagnose);
        returnJson.put("finalModernDiagnose", finalModernDiagnose);
        return CommonResult.success(returnJson);
    }
