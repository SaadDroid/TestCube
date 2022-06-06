@Override
    public <E, N extends OpenMutableBinaryTreeNode<E, N>> void rotateInPlace(N rootParent, N rotationRoot, RotationDirection direction) {
        final ParentReferenceFactory<E, N> referenceFactory = rootReferenceFactoryProvider.get(rootParent);
        final ParentReference<N> reference = referenceFactory.wrap(rootParent);

        final Rotator<E, N> rotator = rotatorProvider.get(rotationRoot, direction);
        rotator.rotate(reference, rotationRoot);
    }
