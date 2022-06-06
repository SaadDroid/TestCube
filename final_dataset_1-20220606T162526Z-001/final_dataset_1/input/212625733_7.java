public static void collapse(JSNode parent, boolean collapseAll, Set collapses, String path) {
        for (String key : parent.keySet()) {
            Object value = parent.get(key);

            if (collapseAll || collapses.contains(nextPath(path, key))) {
                if (value instanceof JSArray) {
                    JSArray children = (JSArray) value;
                    if (children.length() == 0)
                        parent.remove(key);

                    for (int i = 0; i < children.length(); i++) {
                        if (children.get(i) == null) {
                            children.remove(i);
                            i--;
                            continue;
                        }

                        if (children.get(i) instanceof JSArray || !(children.get(i) instanceof JSNode)) {
                            children.remove(i);
                            i--;
                            continue;
                        }

                        JSNode child = children.getNode(i);
                        for (String key2 : child.keySet()) {
                            if (!key2.equalsIgnoreCase("href")) {
                                child.remove(key2);
                            }
                        }

                        if (child.keySet().size() == 0) {

                            children.remove(i);
                            i--;
                            continue;
                        }
                    }
                    if (children.length() == 0)
                        parent.remove(key);

                } else if (value instanceof JSNode) {
                    JSNode child = (JSNode) value;
                    for (String key2 : child.keySet()) {
                        if (!key2.equalsIgnoreCase("href")) {
                            child.remove(key2);
                        }
                    }
                    if (child.keySet().size() == 0)
                        parent.remove(key);
                }
            } else if (value instanceof JSArray) {
                JSArray children = (JSArray) value;
                for (int i = 0; i < children.length(); i++) {
                    if (children.get(i) instanceof JSNode && !(children.get(i) instanceof JSArray)) {
                        collapse(children.getNode(i), collapseAll, collapses, nextPath(path, key));
                    }
                }
            } else if (value instanceof JSNode) {
                collapse((JSNode) value, collapseAll, collapses, nextPath(path, key));
            }

        }
    }
