package jp.github.shibadog.sampledoma.web;

import java.util.Objects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jp.github.shibadog.sampledoma.domain.dao.SampleEntityDao;
import jp.github.shibadog.sampledoma.domain.entity.SampleEntity;


@RestController
public class DemoController {
    
    private final SampleEntityDao dao;

    public DemoController(SampleEntityDao dao) {
        this.dao = dao;
    }

    @GetMapping(value="/get")
    public SampleEntity getRequest(@RequestParam("id") int id) {
        Objects.requireNonNull(id);
        return dao.selectSampleEntityById(id);
    }
    
}
