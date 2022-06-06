protected HttpServletRequest processFileItems(HttpServletRequest request, List<FileItem> fileItems)
    {
        if (uploadException == null && fileItems.isEmpty())
        {
            return request;
        }

        ParametersServletRequestWrapper wrapper = new ParametersServletRequestWrapper(request);

        // First add parameters from the request
        for (Map.Entry<String, String[]> e : request.getParameterMap().entrySet())
        {
            for (String s : e.getValue())
                wrapper.addParameter(e.getKey(), s);
        }

        for (FileItem item : fileItems)
        {
            if (item.isFormField())
            {
                String fieldValue;

                try
                {

                    fieldValue = item.getString(requestEncoding);
                } catch (UnsupportedEncodingException ex)
                {
                    throw new RuntimeException(ex);
                }

                wrapper.addParameter(item.getFieldName(), fieldValue);
            } else
            {
                wrapper.addParameter(item.getFieldName(), item.getName());
                addUploadedFile(item.getFieldName(), new UploadedFileItem(item));
            }
        }

        return wrapper;
    }
