boolean isFileLocatedInDirectory(Path dir, Path file) throws IOException{		
		try {
			Path realDir = dir.toRealPath();
			Path realFile= file.toRealPath();
			
			Path parent = realFile.getParent();
			while(parent!=null){
				if(parent.equals(realDir)){
					return true;
				}
				parent = parent.getParent();
			}
			return false;
		}
		catch (NoSuchFileException e) {
			return false;
		}		
	}
