public void movePlayerOneStep(Step step) {
        SpacePlayer p = null;
        for (Overlay o : step.getOverlays()) {
            if (o instanceof SpacePlayer) {
                p = (SpacePlayer) o;
            }
        }

        // if there is no player or it is not ready to move, nothing to do
        if (p == null || !p.isReadyToMove()) {
            return;
        }

        // move player in defined direction
        if (p.getDirection().equals(Direction.FORWARD)) {
            if (step.next() != null) {
                if (!isStepBlocked(step.next())){
                    step.getOverlays().remove(p);
                    step.next().addOverlay(p);
                    p.setActiveStep(step.next());
                }
            }
        } else if (p.getDirection().equals(Direction.BACKWARD)) {
            if (step.previous() != null) {
                if (!isStepBlocked(step.previous())) {
                    step.getOverlays().remove(p);
                    step.previous().addOverlay(p);
                    p.setActiveStep(step.previous());
                }
            }
        }
        p.setMoved(true);
    }
