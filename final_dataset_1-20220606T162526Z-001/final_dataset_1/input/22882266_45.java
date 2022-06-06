@Override
  public void run() {
    BeanFactory factory = null;
    try {
      factory = osgiPluginTracker.findOrCreateBeanFactoryFor( serviceObject );
    } catch ( OSGIPluginTrackerException e ) {
      logger.debug( "Error in the plugin tracker. We cannot proceed.", e );
      notifyListener();
      return;
    } catch ( Exception e ) {
      logger.debug( "Error trying to notify on service registration", e );
      notifyListener();
      return;
    }
    // The beanfactory may not be registered yet. If not schedule a check every second until it is.
    // stopping services won't be able to find a beanfactory. Just skip
    if ( ( factory == null || osgiPluginTracker.getProxyUnwrapper() == null ) && eventType != LifecycleEvent.STOP ) {
      ScheduledFuture<?> timeHandle = scheduler.schedule( this, 100, TimeUnit.MILLISECONDS );
    } else {
      try {
        List<OSGIServiceLifecycleListener> listenerList = listeners.get( classToTrack );
        if ( listenerList != null ) {
          for ( OSGIServiceLifecycleListener listener : listenerList ) {
            switch ( eventType ) {
              case START:
                listener.pluginAdded( serviceObject );
                break;
              case STOP:
                listener.pluginRemoved( serviceObject );
                break;
              case MODIFY:
                listener.pluginChanged( serviceObject );
                break;
              default:
                throw new IllegalStateException( "Unhandled enum value: " + eventType );
            }
          }
        }
      } finally {
        notifyListener();
      }
    }
  }
