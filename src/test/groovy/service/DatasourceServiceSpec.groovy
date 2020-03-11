package service

import com.xy.datasource.spring.boot.starter.Application
import com.xy.datasource.spring.boot.starter.service.DataSourceService
import org.junit.Assert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

/**
 * @author xieyong* @date 2020/3/11
 * @Description:
 */
@SpringBootTest(classes = Application)
class DatasourceServiceSpec extends Specification{

    @Autowired
    private DataSourceService dataSourceService;

    def "注入mysql"(){
        given:
        String dbType = System.getProperty("dbType","MYSQL");
        when:
        String res =  dataSourceService.dataSource();
        then:
        Assert.assertTrue(dbType.equalsIgnoreCase(res));
    }

    def "注入oracle"(){
        given:
        String dbType = System.getProperty("dbType","oracle");
        when:
        String res =  dataSourceService.dataSource();
        then:
        Assert.assertTrue(!dbType.equalsIgnoreCase(res));
    }
}
