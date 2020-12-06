package jp.github.shibadog.sampledoma.domain.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;
import jp.github.shibadog.sampledoma.domain.entity.SampleEntity;

@Dao
@ConfigAutowireable
public interface SampleEntityDao {
    @Select
    @Transactional(readOnly = true)
    SampleEntity selectSampleEntityById(int id);
}
