@Scheduled(cron = "0 0 6 * * *")
    public void deleteUserInfo() {
        LOGGER.info("Running cron job to delete users");
        Iterable<CustomerInfo> customerInfoList = customerInfoRepo.findAll();
        List<CustomerInfoCronJobInfo> customersToDelete = new ArrayList<>();

        if (customerInfoList == null) {
            LOGGER.info("No Customers to Delete");
            return;
        }

        customerInfoList.forEach(c -> {
            customersToDelete.add(new CustomerInfoCronJobInfo(c));
        });

        LocalDateTime now = LocalDateTime.now();
        for (CustomerInfoCronJobInfo c : customersToDelete) {
            if (c.getCreatedAt().plus(NUM_DAYS_RETENTION, ChronoUnit.DAYS).isBefore(now)) {
                List<PrintJob> pJobs = printJobRepo.findPrintJobsByCustomerIdNewestFirst(c.getId());
                if (pJobs != null && pJobs.size() >= 1) {
                    PrintJob p = pJobs.get(0);
                    if (p != null) {
                        if (p.getCreatedAt().plus(NUM_DAYS_RETENTION, ChronoUnit.DAYS).isBefore(now)) {
                            printJobRepo.deleteAll(pJobs);
                            customerInfoRepo.deleteById(c.getId());
                        }
                    }
                }
            }
        }
    }
