public D3Vector stagnate_acceleration(D3Vector input) {
        D3Vector output = input;
        // Change acceleration if velocity is close to the maximum velocity
        if (m_gps.getVelocity().length() >= (Settings.MAX_DRONE_VELOCITY * 0.9)) {
            double maxAcceleration = Settings.MAX_DRONE_VELOCITY - m_gps.getVelocity().length();
            if (output.length() > Math.abs(maxAcceleration)) {
                output = output.scale(maxAcceleration / output.length() == 0 ? 1 : output.length());
            }
        }
        return output;
    }
