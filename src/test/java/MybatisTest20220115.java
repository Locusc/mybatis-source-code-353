import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest20220115 {

    public void test1() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream(
                "sqlMapConfig.xml"
        );

        SqlSessionFactory build = new SqlSessionFactoryBuilder()
                .build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        List<Object> objects = sqlSession.selectList("namespace.id");
    }

}
