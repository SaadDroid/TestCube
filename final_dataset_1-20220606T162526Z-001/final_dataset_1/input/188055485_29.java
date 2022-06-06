public CommonResult deleteMyDiagnoseTemplate(Integer roleId, String diagnoseTemplateName){
        int count = 0;
        //参数验证
        if(roleId == null || diagnoseTemplateName == null)
            CommonResult.fail(ResultCode.E_801);
        DiagnoseTemplate diagnoseTemplate = diagnoseTemplateMapper.getDiagnoseTemplateByName(diagnoseTemplateName);
        if(diagnoseTemplate == null)
            CommonResult.fail(ResultCode.E_801);//名称不存在
        //权限验证
        if(roleId != diagnoseTemplate.getRoleId())
            return CommonResult.fail(ResultCode.E_804);

        //删除该名称下所有常用诊断疾病
        count = diagnoseTemplateMapper.deleteByName(diagnoseTemplateName);

        if(count > 0 )
            return CommonResult.success(count);
        else
            return CommonResult.fail();
    }
