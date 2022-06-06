public String enableDebugging(String sourceCode, String hostname, int port) throws IOException {
    	bashPIDSnippetSupport.ensureKillOldTerminalFileExistsInSystemUserHome();
    	bashPIDSnippetSupport.ensureStoreTerminalPIDFileExistsInSystemUserHome();
    	
        ensureDebugFileExistsInSystemUserHome();
        String nSourceCode= disableDebugging(sourceCode); // if we got some call before with maybe another port or host etc.
        StringBuilder sb = new StringBuilder();
        sb.append(createSourceToInclude(infoProvider.getResultingScriptPathToUserHome())).append(" ").append(hostname).append(" ").append(port).append(" ");
        sb.append(DEBUG_POSTFIX);
        if (!nSourceCode.startsWith("#!")) {
            // this means its not something like #!/bin/bash etc. means: this line could be important and we do not want to just override it
            // so add a new line here:
            sb.append("\n");
        }
        sb.append(nSourceCode);
        return sb.toString();
    }
