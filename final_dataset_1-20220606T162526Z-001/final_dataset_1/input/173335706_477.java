public Map<String,String> environment() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkPermission(new RuntimePermission("getenv.*"));
        }

        if (environment == null) {
            environment = ProcessEnvironmentForWin32.environment();
        }

        assert environment != null;

        return environment;
    }
