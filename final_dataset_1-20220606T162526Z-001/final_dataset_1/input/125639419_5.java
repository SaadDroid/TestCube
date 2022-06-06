public void create () {
        // 1.Create a universe
        final SimpleUniverse universe = new SimpleUniverse();

        // 2.Create a BranchGroup to store node
        final BranchGroup branchGroup = new BranchGroup();

        // 2.1 Create Cylinder
        final Cylinder cylinder = new Cylinder(mRadius, mCylinderHeight);
        branchGroup.addChild(cylinder);

        // 2.2 Create light
        final DirectionalLight light = J3DUtils.createDefaultLight();
        branchGroup.addChild(light);

        // 3.Set observer point
        universe.getViewingPlatform().setNominalViewingTransform();

        // 4.Add BranchGroup to universe
        universe.addBranchGraph(branchGroup);
    }
