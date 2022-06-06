protected FtpMessage listFiles(ListCommand list, TestContext context) {
        String remoteFilePath = Optional.ofNullable(list.getTarget())
                                        .map(ListCommand.Target::getPath)
                                        .map(context::replaceDynamicContentInString)
                                        .orElse("");

        try {
            List<String> fileNames = new ArrayList<>();
            FTPFile[] ftpFiles;
            if (StringUtils.hasText(remoteFilePath)) {
                ftpFiles = ftpClient.listFiles(remoteFilePath);
            } else {
                ftpFiles = ftpClient.listFiles(remoteFilePath);
            }

            for (FTPFile ftpFile : ftpFiles) {
                fileNames.add(ftpFile.getName());
            }

            return FtpMessage.result(ftpClient.getReplyCode(), ftpClient.getReplyString(), fileNames);
        } catch (IOException e) {
            throw new CitrusRuntimeException(String.format("Failed to list files in path '%s'", remoteFilePath), e);
        }
    }
