protected void uploadResource(Resource localResource) throws IOException, SSHClientException {
        checkNotNull(localResource);
        long localChecksum = localResource.getResourceChecksum();
        if(!localResource.isUploaded() && !isResourceUploadedAndUpToDate(localResource, localChecksum)) {
            String remoteFile = getRemoteFile(localResource);
            logger.info("Uploading {} to ssh://{}:{}/{}.", 
                    new Object[]{localResource, sshClient.getHost(), 
                            sshClient.getPort(), remoteFile});
            InputStream resourceData = localResource.getResourceData();
            sshClient.sftpUpload(resourceData, remoteFile);
            resourceData.close();
            
            String remoteCrcFile = getRemoteCrcFile(localResource);
            logger.debug("Uploading CRC checksum {} to ssh://{}:{}/{}.", 
                    new Object[]{localChecksum, sshClient.getHost(), 
                            sshClient.getPort(), remoteCrcFile});
            byte[] checksumBytes = String.valueOf(localChecksum).
                    getBytes(Charsets.UTF_8);
            sshClient.sftpUpload(new ByteArrayInputStream(checksumBytes), remoteCrcFile);
        }
        
        localResource.setUploaded(true);
    }
