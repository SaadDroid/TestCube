@Transactional
    public Page<JobStatus> getAllJobs(Pageable pageable) {
        Page<JobStatus> jobStatusPage = jobStatusRepository.findAll(pageable);
//
//        List<JobHistoryStatusResponse> result = new ArrayList<>();
//        JobHistoryStatusResponse jobHistoryStatusResponse;
//
//        for (JobStatus jobStatus : jobStatusPage.getContent()) {
//            jobHistoryStatusResponse = new JobHistoryStatusResponse();
//            jobHistoryStatusResponse.setStatusId(jobStatus.getStatusId());
//            jobHistoryStatusResponse.setJobState(jobStatus.getJobState());
//            jobHistoryStatusResponse.setCreateDt(jobStatus.getCreateDt());
//            jobHistoryStatusResponse.setJobName(jobStatus.getJobHistory().getJobName());
//            jobHistoryStatusResponse.setJobGroup(jobStatus.getJobHistory().getJobGroup());
//            jobHistoryStatusResponse.setJobType(jobStatus.getJobHistory().getJobType());
//            result.add(jobHistoryStatusResponse);
//        }
        return jobStatusPage;
    }
