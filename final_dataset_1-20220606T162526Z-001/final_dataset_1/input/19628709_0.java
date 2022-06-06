public void process(final Person person) {
        new Thread(new Runnable() {
	        @Override
	        public void run() {
		        try {
			        // simulating time consuming actions
			        Thread.sleep(500);
		        } catch (InterruptedException e) {
			        System.err.printf("The thread got interrupted [%s]%n", e);
		        }
		        personSaver.savePerson(person);
	        }
        }).start(); 
    }