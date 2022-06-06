public static Object lockMethod(String lockKey, String keyType, KeylockFunction func, Object... params) {
		boolean isKeyLockException = false;
		KeyLock keyLock = KeyLockManager.getKeyLock(keyType);
		try {
			keyLock.lock(lockKey);
			return func.apply(params);
		} catch (KeyLockException e) {
			isKeyLockException = true;
			if (KeyLockManager.log != null) {
				KeyLockManager.log.error("keylock自定义异常", e);
			}
		} catch (Exception e) {
			if (KeyLockManager.log != null) {
				KeyLockManager.log.error("业务异常", e);
			}
		} finally {
			// keylock出现的异常，权利释放这个锁。只有添加的这个锁的才有权利释放
			if (!isKeyLockException) {
				keyLock.unlock(lockKey);
			} else {

			}
		}
		return null;
	}
