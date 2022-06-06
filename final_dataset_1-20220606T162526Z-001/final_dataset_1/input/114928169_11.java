public String getStateAllAsChecked() {
		if (states.allEnabled()){
			return "checked ";
		}		
		return ""; 
	}
