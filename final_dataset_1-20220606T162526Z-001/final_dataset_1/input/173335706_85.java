public Map<String, Object> getUserInfo(User loginUser) {

        Map<String, Object> result = new HashMap<>();

        User user = null;
        if (loginUser.getUserType() == UserType.ADMIN_USER) {
            user = loginUser;
        } else {
            user = userMapper.queryDetailsById(loginUser.getId());

            List<AlertGroup> alertGroups = alertGroupMapper.queryByUserId(loginUser.getId());

            StringBuilder sb = new StringBuilder();

            if (alertGroups != null && alertGroups.size() > 0) {
                for (int i = 0; i < alertGroups.size() - 1; i++) {
                    sb.append(alertGroups.get(i).getGroupName() + ",");
                }
                sb.append(alertGroups.get(alertGroups.size() - 1));
                user.setAlertGroup(sb.toString());
            }
        }

        result.put(Constants.DATA_LIST, user);

        putMsg(result, Status.SUCCESS);
        return result;
    }
