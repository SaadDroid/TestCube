protected Invoker<T> select(LoadBalance loadbalance, Invocation invocation, List<Invoker<T>> invokers, List<Invoker<T>> selected) throws RpcException {
        if (invokers == null || invokers.size() == 0)
            return null;
        String methodName = invocation == null ? "" : invocation.getMethodName();
        
        boolean sticky = invokers.get(0).getUrl().getMethodParameter(methodName,Constants.CLUSTER_STICKY_KEY, Constants.DEFAULT_CLUSTER_STICKY) ;
        {
            //ignore overloaded method
            if ( stickyInvoker != null && !invokers.contains(stickyInvoker) ){
                stickyInvoker = null;
            }
            //ignore cucurrent problem
            if (sticky && stickyInvoker != null && (selected == null || !selected.contains(stickyInvoker))){
                if (availablecheck && stickyInvoker.isAvailable()){
                    return stickyInvoker;
                }
            }
        }
        Invoker<T> invoker = doselect(loadbalance, invocation, invokers, selected);
        
        if (sticky){
            stickyInvoker = invoker;
        }
        return invoker;
    }
