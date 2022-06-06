public List<Character> inorder() {
        List<Character> inorder = new ArrayList<>();
        inorder(root, inorder::add);
        return inorder;
    }
