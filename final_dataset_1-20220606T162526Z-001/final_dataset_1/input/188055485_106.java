@Override
    public CommonResult getWaitingAmountById(Integer patientId){
        JSONArray jsonArray = new JSONArray();

        List<HashMap> registrations = patientCaseMapper.listRegistrationsByPatientId(patientId);
        for(int i = 0; i <registrations.size(); i++){
            JSONObject jsonObject = new JSONObject();
            Integer registrationId = Integer.valueOf(registrations.get(i).get("registration_id").toString());
            Integer roleId = Integer.valueOf(registrations.get(i).get("role_id").toString());
            String appointmentDateStr = registrations.get(i).get("appointment_date").toString();

            int beforeAmount = patientCaseMapper.getWaitingAmountById(registrationId, roleId, appointmentDateStr);
            jsonObject.put("registrationId", registrationId);
            jsonObject.put("appointmentDate", appointmentDateStr);
            jsonObject.put("beforeAmount", beforeAmount);
            jsonObject.put("doctorName", roleMapper.getUserNameByRoleId(roleId));
            jsonObject.put("departmentName", roleMapper.getDepartmentNameByRoleId(roleId));
            jsonArray.add(jsonObject);
        }
        return CommonResult.success(jsonArray);
    }
