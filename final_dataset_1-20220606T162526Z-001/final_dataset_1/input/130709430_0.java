public void logOutIfNecessary(MethodInvocation invocation, MethodLog methodLog, Object result) {
        if (isLogOutNecessary(invocation, methodLog)) {
            logOut(invocation, methodLog, result);
        }
    }
