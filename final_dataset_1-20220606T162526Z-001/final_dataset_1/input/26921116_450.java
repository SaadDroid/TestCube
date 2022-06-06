public static Regression<double[]> fit(double[][] x, double[] y, double eps, double C, double tol) {
        smile.base.svm.SVR<double[]> svr = new smile.base.svm.SVR<>(new LinearKernel(), eps, C, tol);
        KernelMachine<double[]> svm = svr.fit(x, y);

        return new Regression<double[]>() {
            LinearKernelMachine model = LinearKernelMachine.of(svm);

            @Override
            public double predict(double[] x) {
                return model.f(x);
            }
        };
    }
