public HostDistance distance(Host host) {
		String dc = dc(host);
		// If the connection has switched to the backup DC and fulfills
		// the requirement for a back switch, make it happen.
		if(!switchBackCanNeverHappen){
			triggerBackSwitchIfNecessary();
		}

		if (isLocal(dc)) {			
			return HostDistance.LOCAL;
		}

		// Only hosts in local DC and backup DC can be considered remote
		if(dc(host).equals(localDc) || dc(host).equals(backupDc))
			return HostDistance.REMOTE;
		
		// All other hosts are ignored
		return HostDistance.IGNORED;
		
	}
