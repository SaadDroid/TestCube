@Override
    public CommonResult insertArrangementRule(ArrangementRuleParam arrangementRuleParam){
        int count = 0;
        Integer adminId = arrangementRuleParam.getAdminId();
        Integer departmentId = arrangementRuleParam.getDepartmentId();
        String ruleName = arrangementRuleParam.getRuleName();
        //排班规则名称是否重复
        if(0 != arrangementRuleMapper.listByRuleName(ruleName).size()){
            return CommonResult.fail(ResultCode.E_806); //名称已存在
        }
        //参数检验
        List<ArrangementRule> arrangementRuleList = arrangementRuleParam.getArrangementRules();
        if(0 == arrangementRuleList.size())
            return CommonResult.fail(ResultCode.E_801);

        //排班规则编号
        Integer id = arrangementRuleMapper.getLastId();
        if(id == null)
            id = 0;
        id = id + 1;

        for(ArrangementRule arrangementRule : arrangementRuleList){
           arrangementRule.setId(id);
           arrangementRule.setRuleName(ruleName);
           arrangementRule.setAdminId(adminId);
           arrangementRule.setDepartmentId(departmentId);
           arrangementRule.setIsValid(true);//默认为有效
           Integer roleId = arrangementRule.getRoleId();
           Integer titleId = roleMapper.getTitleByRoleId(roleId);
           Byte levelId;
           Byte maxAppointment;
           arrangementRule.setTitleId(titleId); //职称
           if(titleId == 1 || titleId == 2) {//主任医师、副主任医师
               levelId = 2;
               maxAppointment = 20;
           }
           else if(titleId == 3 || titleId == 4) {//主治医师、住院医师
               levelId = 1;
               maxAppointment = 50;
           }
           else
               return CommonResult.fail(ResultCode.E_801);
           arrangementRule.setRegistrationLevelId(levelId); //1.普通 2.专家 3.急诊
           arrangementRule.setMaxAppointment(maxAppointment);//看诊人数上限
           // 插入数据库
           count = arrangementRuleMapper.insertSelective(arrangementRule);
           if(count <= 0)
               return CommonResult.fail(ResultCode.E_802);
        }
        return CommonResult.success(count);
    }
