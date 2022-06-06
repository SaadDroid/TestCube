public static String instructInstance(String missionHandle,String strandId, String commandName){
        return  format(INSTANCE_HEADER + "%s/%s/instruct/%s", missionHandle,strandId,commandName);
    }
