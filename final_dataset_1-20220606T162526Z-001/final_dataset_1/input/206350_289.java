public Node addChild(int index, Node node) {
        if(children.length <= childrenCount) {
            // expand + copy with empty slot at index
            Node[] newChildren = new Node[children.length + 4];
            System.arraycopy(children, 0, newChildren, 0, index);
            System.arraycopy(children, index, newChildren, index + 1, (childrenCount - index));
            children = newChildren;
        } else {
            // move tail after index on one position
            System.arraycopy(children, index, children, index + 1, (childrenCount - index));
        }
        children[index] = node;
        childrenCount++;
        node.setParent(this);
        return this;
    }
