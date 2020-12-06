package jp.github.shibadog.sampledoma.domain.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;
import lombok.Value;

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
@Value
public class SampleEntity {
    @Id
    private final int id;
    private final String message;
}
