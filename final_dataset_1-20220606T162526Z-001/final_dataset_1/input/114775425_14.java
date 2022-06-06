public static String getInfo() {
        String info = "Best device: " + Device.best();
        info += "\nFirst CPU: " + Device.firstCPU();
        info += "\nFirst GPU: " + Device.firstGPU();
        return info;
    }
