import com.alibaba.fastjson.JSON;
import com.youyigejia.crm.domain.TestDomain;
import org.junit.Test;

/**
 * Created by 张磊 on 2017/7/9.
 */
public class CreateJson {
    @Test
    public void test() {
        TestDomain testDomain=new TestDomain();
        testDomain.setId(1);
        testDomain.setName("王二");
        String s = JSON.toJSONString(testDomain);
        System.out.println(s);
    }
}
