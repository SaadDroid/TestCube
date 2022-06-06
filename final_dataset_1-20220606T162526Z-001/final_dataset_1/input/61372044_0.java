@Override
    public TemplateFormatInfo process(final String templatePath, final ImageFormat format, final String templateName) throws InternalErrorException {
        if (format != null) {
            s_logger.debug("We currently don't handle conversion from " + format + " to VHD.");
            return null;
        }

        final String vhdPath = templatePath + File.separator + templateName + "." + ImageFormat.VHD.toString().toLowerCase();
        if (!this._storage.exists(vhdPath)) {
            s_logger.debug("Unable to find the vhd file: " + vhdPath);
            return null;
        }

        final File vhdFile = this._storage.getFile(vhdPath);

        final TemplateFormatInfo info = new TemplateFormatInfo();
        info.format = ImageFormat.VHD;
        info.filename = templateName + "." + ImageFormat.VHD.toString().toLowerCase();
        info.size = this._storage.getSize(vhdPath);

        try {
            info.virtualSize = getTemplateVirtualSize(vhdFile);
        } catch (final IOException e) {
            s_logger.error("Unable to get the virtual size for " + vhdPath);
            throw new InternalErrorException("unable to get virtual size from vhd file");
        }

        return info;
    }
