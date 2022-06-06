public void on(int slot) {
        if (slot == 1)
            light.on();
        if (slot == 2)
            ceiling.high();
        if (slot == 3) {
            stereo.on();
            stereo.setCdStatus(true);
            stereo.setVolume(11);
        }
    }
