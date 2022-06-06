@Override
    public CommonResult getPatientInfo(Integer id) {
        Patient patient = patientMapper.getPatientInfoById(id);

        return CommonResult.success(patient);
    }
