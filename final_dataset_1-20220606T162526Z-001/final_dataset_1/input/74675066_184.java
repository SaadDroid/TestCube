public static Completable validate(VirtualHost vhost) {

        String host = vhost.getHost();

        if (host == null || "".equals(host)) {
            return Completable.error(new InvalidVirtualHostException("Host is required"));
        }

        String[] split = host.split(":");
        String hostWithoutPort = split[0];

        if (!InternetDomainName.isValid(hostWithoutPort)) {
            return Completable.error(new InvalidVirtualHostException("Host [" + hostWithoutPort + "] is invalid"));
        }

        if (host.contains(":") && split.length < 2) {
            return Completable.error(new InvalidVirtualHostException("Host port for [" + host + "] is invalid"));
        }

        if (split.length > 1) {
            try {
                int port = Integer.parseInt(split[1]);
                if (port < 0 || port > 65535) {
                    return Completable.error(new InvalidVirtualHostException("Host port [" + port + "] is invalid"));
                }
            } catch (NumberFormatException nfe) {
                return Completable.error(new InvalidVirtualHostException("Host port for [" + host + "] is invalid"));
            }
        }

        return PathValidator.validate(vhost.getPath());
    }
