public int getLeastFret() {
        int leastFret = -1;
        for (int i = 0; i < frets.length; i++) {
            int fret = frets[i];
            // 不处理小于 1 品的情况
            if (fret < 1) {
                continue;
            }
            // 第一次为 leastFret 赋值
            if (leastFret == -1) {
                leastFret = fret;
                continue;
            }
            // 对后面的数依次进行比较，得到最小的品
            if (fret < leastFret) {
                leastFret = fret;
            }
        }
        return leastFret;
    }
