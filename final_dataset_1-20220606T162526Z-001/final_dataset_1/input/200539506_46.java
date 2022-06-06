public GenericResponse userSignUp(EmployeeSignUpRequest request) {
        request.validate();
        Employee login = fromEmployeeSignUpRequest(request);
        GenericResponse response = new GenericResponse();

        try {
        	Employee userFound = employeeRepo.findEmployeeByUsername(login.getUsername());
        	
        	if (userFound != null) {
        		response.setSuccess(false);
                response.setMessage("User already exists");
                response.setHttpStatus(HttpStatus.BAD_REQUEST);
                return response;
        	}
        	
            login.setPassword(encoder.encode(login.getPassword()));
            employeeRepo.save(login);
        } catch (Exception e) {
            e.printStackTrace();
            response.setSuccess(false);
            response.setMessage("User Sign Up Failed");
            response.setHttpStatus(HttpStatus.BAD_REQUEST);
            return response;
        }

        response.setSuccess(true);
        response.setMessage("User Sign Up Successful");
        response.setHttpStatus(HttpStatus.CREATED);
        return response;
    }
