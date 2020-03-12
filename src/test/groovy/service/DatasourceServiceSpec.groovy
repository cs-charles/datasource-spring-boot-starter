package service

import com.xy.datasource.spring.boot.starter.Application
import com.xy.datasource.spring.boot.starter.service.DataSourceService
import com.xy.datasource.spring.boot.starter.service.HelloService
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

    @Autowired
    private HelloService helloService;

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

    def "测试sayHello"(){
        expect:
        String res = helloService.sayHello();
        Assert.assertEquals(res,"hello");
    }

    def "测试sayInput null"(){
        expect:
        String res = helloService.sayInput(null);
        Assert.assertNull(res);
    }

    def "测试sayInput not null"(){
        expect:
        String input = "world";
        String res = helloService.sayInput(input);
        Assert.assertEquals(input,res);
    }
}
