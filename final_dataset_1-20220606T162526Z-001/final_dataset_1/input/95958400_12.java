public void measurementsChanged(int temp, int humidity, int windPower) {
        if (temp > 5) {
            seedingMachine.start();

            if (humidity > 65)
                reapingMachine.start();
        }

        if (temp > 10 && humidity < 55 && windPower < 4)
            wateringMachine.start();
    }
