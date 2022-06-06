protected void updateVisionCommands(double pNow) {

        SystemSettings.VisionTarget visionTarget = null;

        // Switch the limelight to a pipeline and track
        if(mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_TRACK_TARGET_BTN)) {
            mTrackingType = ETrackingType.TARGET;
            // TODO Determine which target height we're using
            visionTarget = SystemSettings.VisionTarget.HatchPort;
//        } else if(mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_TRACK_CARGO_BTN)) {
//            trackingType = ETrackingType.CARGO;
//            visionTarget = SystemSettings.VisionTarget.CargoHeight;
//        } else if(mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_TRACK_HATCH_BTN)) {
//            trackingType = ETrackingType.LINE;
//            visionTarget = SystemSettings.VisionTarget.Ground;

            if(!mTrackingType.equals(mLastTrackingType)) {
                mLog.error("Requesting command start");
                mLog.error("Stopping teleop command queue");
                mTeleopCommandManager.stopRunningCommands(pNow);
                mTeleopCommandManager.startCommands(new LimelightTargetLock(mDrive, mLimelight, 2, mTrackingType, this, false).setStopWhenTargetLost(false));
            }
        } else {
            mTrackingType = null;
            if(mTeleopCommandManager.isRunningCommands()) mTeleopCommandManager.stopRunningCommands(pNow);
        }

//        // If the driver selected a tracking enum and we won't go out of bounds
//        if(trackingType != null && trackingType.ordinal() < ETrackingType.values().length - 1) {
//            int trackingTypeOrdinal = trackingType.ordinal();
//            if (mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_NUDGE_SEEK_LEFT)) {
//                // If driver wants to seek left, we don't need to change anything
//                trackingType = ETrackingType.values()[trackingTypeOrdinal];
//            } else if (mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_NUDGE_SEEK_RIGHT)) {
//                // If driver wants to seek right, switch from "_LEFT" enum to "_RIGHT" enum
//                trackingType = ETrackingType.values()[trackingTypeOrdinal + 1];
//            } else if(mDriverInputCodex.isSet(DriveTeamInputMap.DRIVER_TRACK_TARGET_BTN)){
//                // Default to no search
//                trackingType = ETrackingType.values()[trackingTypeOrdinal + 2];
//            } else {
//                trackingType = null;
//            }
//        }
    }
