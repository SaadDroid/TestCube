@Override
  public Force map(LVertex vertex) {
    forceSumVect.reset();
    for (Centroid c : centroids) {
      centroidVertex.setId(c.getId());
      centroidVertex.setPosition(c.getPosition().copy());
      forceSumVect.mAdd(rf.join(vertex, centroidVertex).getValue());
    }
    centroidVertex.setPosition(center.get(0));
    forceSumVect.mAdd(rf.join(vertex, centroidVertex).getValue());
    sumForce.set(vertex.getId(), forceSumVect);
    return sumForce;
  }
