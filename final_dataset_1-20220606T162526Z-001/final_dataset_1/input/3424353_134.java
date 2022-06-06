@Override
	@Transactional
	public boolean deactivateUser(UserDetail userDetail) {
		User user = userService.getUserForId(userDetail.getId());
		
		if(user == null) {
			log.info("User '{}' does not exist in the system", userDetail.getUsername());
			return false;
		}
		
		//Delete user indices so that a user cannot authenticate even if 
		//user record itself is still present
		for(Iterator<UserIndex> it = user.getUserIndices().iterator(); it.hasNext();) {
			UserIndex userIndex = it.next();
			userDao.deleteUserIndex(userIndex);
			it.remove();
		}

		userDao.saveOrUpdateUser(user);
		
		log.info("User '{}' deleted successfully", userDetail.getUsername());
		
		return true;
	}
