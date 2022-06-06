@SuppressWarnings("null")
    @Override
    public boolean check(String email) throws TalendSMTPRuntimeException {
        if (email == null) {
            return handleEmptyMailCase();
        }
        // Find the separator for the domain name
        int pos = email.indexOf('@');
        // If the email does not contain an '@', it's not valid
        if (pos == -1) {
            return handleNoATExistCase();
        }

        // check loose email regex
        final Matcher matcher = emailPattern.matcher(email);
        if (!matcher.find()) {
            return handleInvalidEmailSyntaxCase(email);
        }

        // Isolate the domain/machine name and get a list of mail exchangers
        String domain = email.substring(++pos);
        List<String> mxList = null;
        try {
            mxList = getMX(domain);
        } catch (NamingException ex) {
            handleNamingExceptionCase(ex);
        }

        // Just because we can send mail to the domain, doesn't mean that the
        // email is valid, but if we can't, it's a sure sign that it isn't
        if (mxList.isEmpty()) {
            return handleMaxSizeZeroCase();
        }

        // Now, do the SMTP validation, try each mail exchanger until we get
        // a positive acceptance. It *MAY* be possible for one MX to allow
        // a message [store and forwarder for example] and another [like
        // the actual mail server] to reject it. This is why we REALLY ought
        // to take the preference into account.
        String errorMessage = StringUtils.EMPTY;
        for (int mx = 0; mx < mxList.size(); mx++) {
            Socket skt = null;
            try {
                int res;
                skt = new Socket(mxList.get(mx), port);
                BufferedReader rdr = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                BufferedWriter wtr = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));

                res = getResponse(rdr);
                if (res != 220) { // SMTP Service ready.
                    return handleSMTPServiceReadyCase(mxList, mx, skt);
                }
                write(wtr, "EHLO " + domain); //$NON-NLS-1$

                res = getResponse(rdr);
                if (res != 250) {
                    return handleNotESMTPCase(domain, skt);
                }

                // validate the sender email
                write(wtr, "MAIL FROM: <" + email + ">"); //$NON-NLS-1$//$NON-NLS-2$
                res = getResponse(rdr);
                if (res != 250) {
                    return handleSenderRejectedCase(email, skt);
                }

                write(wtr, "RCPT TO: <" + email + ">"); //$NON-NLS-1$//$NON-NLS-2$
                res = getResponse(rdr);

                // be polite
                write(wtr, "RSET"); //$NON-NLS-1$
                getResponse(rdr);
                write(wtr, "QUIT"); //$NON-NLS-1$
                getResponse(rdr);
                if (res != 250) {
                    skt.close();
                    return false;
                }
                rdr.close();
                wtr.close();
                skt.close();
                return true;
            } catch (IOException e) {
                // Do nothing but try next host
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Connection to " + mxList.get(mx) + " failed.", e); //$NON-NLS-1$ //$NON-NLS-2$
                }
                errorMessage = e.getMessage();
                continue;
            } finally {
                if (skt != null) {
                    try {
                        skt.close();
                    } catch (IOException e) {
                        LOG.error(e.getMessage(), e);
                    }
                }
            }
        }
        throw new TalendSMTPRuntimeException(errorMessage);
    }
