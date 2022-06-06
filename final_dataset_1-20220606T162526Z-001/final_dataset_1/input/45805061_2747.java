PDEFullResults1D[] solve(final PDEGrid1D grid) {

    //BoundaryCondition lower = new FixedSecondDerivativeBoundaryCondition(0, grid.getSpaceNode(0), true);
    final BoundaryCondition lower = new NeumannBoundaryCondition(0.0, grid.getSpaceNode(0), true);
    //BoundaryCondition lower = new DirichletBoundaryCondition(0.0, grid.getSpaceNode(0));//TODO for beta < 0.5 zero is accessible and thus there will be non-zero 
    //density there
    final BoundaryCondition upper = new DirichletBoundaryCondition(0.0, grid.getSpaceNode(grid.getNumSpaceNodes() - 1));

    CoupledPDEDataBundle d1 = new CoupledPDEDataBundle(_data1, _initCon11, lower, upper, grid);
    CoupledPDEDataBundle d2 = new CoupledPDEDataBundle(_data2, _initCon12, lower, upper, grid);

    final CoupledFiniteDifference solver = new CoupledFiniteDifference(THETA, true);
    final PDEResults1D[] res = solver.solve(d1, d2);
    //handle this with generics  
    final PDEFullResults1D res1 = (PDEFullResults1D) res[0];
    final PDEFullResults1D res2 = (PDEFullResults1D) res[1];
    return new PDEFullResults1D[] {res1, res2 };
  }
