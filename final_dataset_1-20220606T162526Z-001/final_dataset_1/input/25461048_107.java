@Override
    public Post getPostById(int id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            return postMapper.getPostById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return null;
    }
