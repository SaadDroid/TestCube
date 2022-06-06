public static void close(Set<ObjectName> adapterManagers) throws CoreException {
    for (ObjectName obj : adapterManagers) {
      AdapterManagerMBean mgr = JMX.newMBeanProxy(JmxHelper.findMBeanServer(), obj, AdapterManagerMBean.class);
      mgr.requestClose();
    }
  }
