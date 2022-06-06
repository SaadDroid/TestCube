@Override
    public Collection<JobBriefInfo> getAllJobsBriefInfo() {
        List<String> jobNames = registryCenter.getChildrenKeys("/");
        List<JobBriefInfo> result = new ArrayList<>(jobNames.size());
        for (String each : jobNames) {
            JobNodePath jobNodePath = new JobNodePath(each);
            JobBriefInfo jobBriefInfo = new JobBriefInfo();
            jobBriefInfo.setJobName(each);
            jobBriefInfo.setJobClass(registryCenter.get(jobNodePath.getConfigNodePath("jobClass")));
            jobBriefInfo.setDescription(registryCenter.get(jobNodePath.getConfigNodePath("description")));
            jobBriefInfo.setStatus(getJobStatus(each));
            jobBriefInfo.setCron(registryCenter.get(jobNodePath.getConfigNodePath("cron")));
            result.add(jobBriefInfo);
        }
        Collections.sort(result);
        return result;
    }
