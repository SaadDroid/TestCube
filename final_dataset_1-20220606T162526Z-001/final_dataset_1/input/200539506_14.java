public EmailMessageResponse getMessageByStatus(String status){
        Status requestStatus = Status.fromValue(status);

        if(requestStatus == null || !requestStatus.isValid()){
            ErrorType.REQUEST_STATUS_IS_NOT_VALID.throwException();
        }

        EmailMessage emailMessage = emailMessageRepo.findEmailMessageByStatus(requestStatus);

        if(emailMessage == null || emailMessage.getEmailMessage() == null){
            ErrorType.MESSAGE_NOT_FOUND.throwException();
        }

        EmailMessageResponse response = new EmailMessageResponse(emailMessage);
        return response;
    }
