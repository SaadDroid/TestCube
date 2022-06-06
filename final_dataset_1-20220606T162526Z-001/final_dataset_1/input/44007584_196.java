static boolean isSerivceNameMatched(String servicePattern, String serviceName) {
        final int pip = servicePattern.indexOf('/');
        final int pi = serviceName.indexOf('/');
        if(pip != -1) { // pattern有group
            if(pi == -1) return false; // servicename无group 
            
            String gp = servicePattern.substring(0, pip);
            servicePattern = servicePattern.substring(pip + 1);
            
            String g = serviceName.substring(0, pi);
            if(!gp.equals(g)) return false;
        }
        if(pi != -1) 
            serviceName = serviceName.substring(pi + 1);
        
        final int vip = servicePattern.lastIndexOf(':');
        final int vi = serviceName.lastIndexOf(':');
        if(vip != -1) { // pattern有group
            if(vi == -1) return false;
            
            String vp = servicePattern.substring(vip + 1);
            servicePattern = servicePattern.substring(0, vip);
            
            String v = serviceName.substring(vi + 1);
            if(!vp.equals(v)) return false;
        }
        if(vi != -1)
            serviceName = serviceName.substring(0, vi);
        
        return ParseUtils.isMatchGlobPattern(servicePattern, serviceName);
    }
