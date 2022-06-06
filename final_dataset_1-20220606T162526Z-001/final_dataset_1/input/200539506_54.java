public GenericResponse changePassword(UserChangePasswordRequest request) {
        request.validate();
        GenericResponse response = new GenericResponse();
        Employee e = employeeRepo.findEmployeeByUsername(request.getUsername());

        if(e != null) {
            if(request.getNewPassword().equals(request.getConfirmNewPassword())) {
                e.setPassword(encoder.encode(request.getNewPassword()));
                e = employeeRepo.save(e);
                response.setSuccess(true);
                response.setMessage("Password Changed Successfully");
                response.setHttpStatus(HttpStatus.ACCEPTED);
                return response;
            } else {
                throw new IdeaLabApiException(VALIDATION_ERROR, "New Passwords do not match");
            }
        } else {
            throw new IdeaLabApiException(USER_NOT_FOUND);
        }
    }
