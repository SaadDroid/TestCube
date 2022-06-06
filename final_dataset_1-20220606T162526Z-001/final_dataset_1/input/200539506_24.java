public DataResponse<BasicPrintJob> getAllPrintJobs(String status) {
        DataResponse<BasicPrintJob> response = new DataResponse<BasicPrintJob>("Could not get all print jobs");

        List<PrintJob> printJobs = status == null? printJobRepo.findActive() : printJobRepo.findPrintJobByStatus(Status.fromValue(status));

        if (printJobs == null || printJobs.isEmpty()){
            ErrorType.PRINT_JOBS_NOT_EXIST.throwException();
        }

        List<BasicPrintJob> basicPrintJobs = new BasicPrintJob().ConvertPrintJobs(printJobs);

        response.setSuccess(true);
        response.setMessage(status == null? "Successfully returned all print jobs" : "Successfully returned print jobs by " + status + " status");
        response.setData(basicPrintJobs);
        response.setHttpStatus(HttpStatus.ACCEPTED);

        return response;
    }
