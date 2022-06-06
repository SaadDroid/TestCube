public GenericResponse updateUser(EmployeeUpdateRequest request) {
        request.validate();
        GenericResponse response = new GenericResponse();

        Employee e = employeeRepo.findEmployeeByUsername(request.getUsername());

        if(e == null){
            throw new IdeaLabApiException(USER_NOT_FOUND);
        }

        String requestRole = request.getRole();
        e.setRole(EmployeeRole.fromValue(requestRole));

        employeeRepo.save(e);

        response.setSuccess(true);
        response.setMessage("Employee role updated successfully");
        response.setHttpStatus(HttpStatus.ACCEPTED);

        return response;
    }
