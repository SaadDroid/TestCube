@Override
    public void update(int[] x, int y) {
        if (!isGoodInstance(x)) {
            logger.info("Skip updating the model with a sample without any feature word");
            return;
        }

        if (model == Model.TWCNB) {
            throw new UnsupportedOperationException("TWCNB supports only batch learning");
        }

        y = labels.indexOf(y);
        switch (model) {
            case MULTINOMIAL:
            case CNB:
            case WCNB:
            case TWCNB:
                for (int i = 0; i < p; i++) {
                    ntc[y][i] += x[i];
                    nt[y] += x[i];
                }
                break;

            case POLYAURN:
                for (int i = 0; i < p; i++) {
                    ntc[y][i] += x[i] * 2;
                    nt[y] += x[i] * 2;
                }
                break;

            case BERNOULLI:
                for (int i = 0; i < p; i++) {
                    if (x[i] > 0) {
                        ntc[y][i]++;
                    }
                }
                break;

            default:
                // we should never reach here
                throw new IllegalStateException("Unknown model: " + model);
        }

        n++;
        nc[y]++;

        update();
    }
