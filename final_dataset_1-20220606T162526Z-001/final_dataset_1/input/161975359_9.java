@RequestMapping(value = "/job/pause", method = RequestMethod.PUT)
	public ResponseEntity<?> pauseJob(@ModelAttribute JobRequest jobRequest) {
		JobKey jobKey = new JobKey(jobRequest.getJobName(), jobRequest.getJobGroup());
		if (scheduleService.isJobExists(jobKey)) {
			if (!scheduleService.isJobRunning(jobKey)) {
				scheduleService.pauseJob(jobKey);
			} else {
				return new ResponseEntity<>(new ApiResponse(false, "Job already in running state"), HttpStatus.BAD_REQUEST);
			}
		} else {
			return new ResponseEntity<>(new ApiResponse(false, "Job does not exits"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ApiResponse(true, "Job paused successfully"), HttpStatus.OK);
	}
