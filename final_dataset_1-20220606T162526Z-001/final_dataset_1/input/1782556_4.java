@Override
   public boolean isAjaxUploadRequest(HttpServletRequest request)
   {
      return request.getHeader(AJAX_UPLOAD_HEADER) != null;
   }
