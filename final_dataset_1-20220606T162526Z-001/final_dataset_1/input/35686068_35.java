@Override
	public UserDTO getUser(String username) {
		User user = userRepository.findOne(username);
		if(user == null){
			throw new ResourceNotFoundException();
		}
		UserDTO userDTO = new UserDTO(user);
		return hideSensitiveFieldsIfNecessary(userDTO);
	}
