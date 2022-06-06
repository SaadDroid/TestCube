@ApiOperation(value = "downloadTaskLog", notes = "DOWNLOAD_TASK_INSTANCE_LOG_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "taskInstanceId", value = "TASK_ID", dataType = "Int", example = "100")
    })
    @GetMapping(value = "/download-log")
    @ResponseBody
    @ApiException(DOWNLOAD_TASK_INSTANCE_LOG_FILE_ERROR)
    public ResponseEntity downloadTaskLog(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                          @RequestParam(value = "taskInstanceId") int taskInstanceId) {
        byte[] logBytes = loggerService.getLogBytes(taskInstanceId);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + System.currentTimeMillis() + ".log" + "\"")
                .body(logBytes);
    }
