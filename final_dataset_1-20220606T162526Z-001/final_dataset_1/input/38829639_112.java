public static String join(String... parts) {
        StringBuilder sb = new StringBuilder();

        String urlQueryParams = "";
        if (parts.length > 0) {
          String urlWithoutQuery = parts[0];
          try {
            URI uri = new URI(parts[0]);
            if (containsQueryParam(uri)) {
              urlQueryParams = uri.getQuery();
              urlWithoutQuery = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment())
                .toString();
            }
          } catch (URISyntaxException e) {
            // Not all first parameters are URL
          }
          sb.append(urlWithoutQuery).append("/");
        }

        StringBuilder queryParams = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
          try {
            URI partUri = new URI(parts[i]);
            if (containsQueryParam(partUri)) {
              queryParams = getQueryParams(partUri, parts, i+1);
              // If we start detecting query params then everything will be query params part
              break;
            }

            sb.append(parts[i]);

          } catch (URISyntaxException e) {
            sb.append(parts[i]);
          }

          if (i < parts.length - 1) {
            sb.append("/");
          }

        }

        appendQueryParametersFromOriginalUrl(sb, urlQueryParams, queryParams);
        String joined = sb.toString();

        // And normalize it...
        return joined
                .replaceAll("/+", "/")
                .replaceAll("/\\?", "?")
                .replaceAll("/#", "#")
                .replaceAll(":/", "://");

    }
