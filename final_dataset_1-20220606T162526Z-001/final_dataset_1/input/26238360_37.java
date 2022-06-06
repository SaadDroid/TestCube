public Email createMailFor( Person<?> aPerson ) throws SdiException
    {
        Email email = new SimpleEmail();

        try
        {
            email.addTo( aPerson.getEMail() );
            String subject = myMailTextResolver.getResolvedSubject( aPerson );
            myLog.debug( "resolved subject: " + subject);
            email.setSubject( subject );
            String body = myMailTextResolver.getResolvedBody( aPerson );
            myLog.debug( "resolved body: " + body );
            email.setMsg( body );
        }
        catch ( EmailException t )
        {
            throw new SdiException( "Problems setting up mail for " + aPerson.getEMail(),
                                    t,
                                    SdiException.EXIT_CODE_MAIL_ERROR );
        }

        return email;
    }
