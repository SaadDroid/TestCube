@Override
    public CommonResult listPatients(Integer doctorRoleId){
        JSONObject returnObject = new JSONObject();

        //查询待诊患者
        List<HashMap> patients = patientCaseMapper.listWaitingPatients(doctorRoleId);
        for(HashMap patient : patients) { //计算年龄
            int age = getAgeByBirth((Date)patient.get("birthday"));
            patient.put("age", age);
        }
        returnObject.put("waitingPatients", patients);

        //查询已诊患者
        patients = patientCaseMapper.listWaitedPatients(doctorRoleId);
        for(HashMap patient : patients) { //计算年龄
            int age = getAgeByBirth((Date)patient.get("birthday"));
            patient.put("age", age);
        }
        returnObject.put("diagnosedPatients", patients);

        return CommonResult.success(returnObject);
    }
