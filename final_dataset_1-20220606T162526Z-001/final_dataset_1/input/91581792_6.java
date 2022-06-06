public static boolean addCycle(ICycle cycle, int threadId, int priority) {
		if (cycle == null) {
			if (AsyncThreadManager.log != null) {
				AsyncThreadManager.log.warn("ICycle为空");
			}
			return false;
		}
		AsyncThread asyncThread = asyncThreadMap.get(threadId);
		if (asyncThread == null) {
			if (AsyncThreadManager.log != null) {
				AsyncThreadManager.log.warn("不存在线程id：" + threadId);
			}
			return false;
		}
		AsyncHandleData asyncHandleData = asyncThread.asyncHandleDataMap.get(priority);
		if (asyncHandleData == null) {
			if (AsyncThreadManager.log != null) {
				AsyncThreadManager.log.warn("不存在优先级：" + priority);
			}
			return false;
		}
		try {
			asyncHandleData.waitAddCycleQueue.put(cycle);
			return true;
		} catch (InterruptedException e) {
			if (AsyncThreadManager.log != null) {
				AsyncThreadManager.log.error("放入ICycle至异步线程列队失败", e);
			}
			return false;
		}

	}
