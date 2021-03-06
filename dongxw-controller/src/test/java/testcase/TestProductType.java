package testcase;


import app.support.query.PageResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jtest.NodesFactroy.Inject.Inject;
import com.jtest.NodesFactroy.Node.HttpClientNode;
import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestClass;
import com.jtest.testframe.ITestImpl;
import com.kunlong.dongxw.dongxw.domain.Customer;
import com.kunlong.platform.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.Login;

import java.io.IOException;

//import testcase.pub.ManagerLogin;

@JTestClass.author("leijm")
public class TestProductType extends ITestImpl {
    private static final Logger logger = LoggerFactory.getLogger(TestProductType.class);

    String url_sysuser = "http://127.0.0.1:10080/rest/sysuser";
    String url_producttype = "http://127.0.0.1:10081/dongxw/producttype";
    String url_export = "http://127.0.0.1:10081/dongxw/export";
    String url_manager = "http://127.0.0.1:10081/dongxw/manager";
    String url_dongxw  = "http://127.0.0.1:8098/api/dongxw/customer";
    //http://localhost:8098/api/dongxw/customer/findById/1

    @Inject(filename = "node.xml", value = "httpclient")
    HttpClientNode httpclient;
    Login login = new Login();

    //MsgRequest req = new MsgRequest();
    public void suiteSetUp() {

    }

    public void suiteTearDown() throws IOException {
    }

    @Override
    public void setUp() {
        login.loginsys(httpclient);
        //auth();
//		req = login.defaultReq();
//		token = login.login(req);
//		logger.info("aaa--req:{} ******",req.toJSONStringPretty());
//		logger.info("bbb req:{} ******",req.toJSONStringPretty());
    }

    @Override
    public void tearDown() {

    }

    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0001_custFindById")
    @JTestClass.exp("ok")
    public void test_0001_custFindById() {


        String ret = httpclient.post(url_producttype + "/findById/1", "{}", "application/json");
        httpclient.checkStatusCode(200);

        JsonResult<Customer> result = JSON.parseObject(ret, JsonResult.class);
        System.out.println(ret);
        //System.out.println(result.getData());
        System.out.println(result);


    }

    //url_manager
    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0002_managerFindDictDatatypeById")
    @JTestClass.exp("ok")
    public void test_0002_managerFindDictDatatypeById() {


    }
    //url_manager
    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0003_findCustDongxw")
    @JTestClass.exp("ok")
    public void test_0003_findCustDongxw() {


    }

    public <T> PageResult<T> parsePageResult(String text, Class<T> clazz) {
        PageResult<T> result = JSON.parseObject(text, new

                TypeReference<PageResult<T>>() {

                });
        return result;
    }

    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0004_custQry")
    @JTestClass.exp("ok")
    public void test_0004_custQry() {


        String ret = httpclient.post(url_producttype + "/query", "{}", "application/json");
        httpclient.checkStatusCode(200);
        System.out.println(ret);

        PageResult<Customer> result  = JSON.parseObject(ret, new

                TypeReference<PageResult<Customer>>() {

                });
        result = parsePageResult(ret,Customer.class);

        System.out.println(result.getData());
        System.out.println(result.getData().size());
    }

    public <T> JsonResult<T> parseJsonResult(String text, Class<T> clazz) {
        JsonResult<T> result = JSON.parseObject(text, new

                TypeReference<JsonResult<T>>() {

                });
        return result;
    }

    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0005_custSave")
    @JTestClass.exp("ok")
    public void test_0005_custSave() {

        String ret = httpclient.post(url_producttype + "/findById/12", "{}", "application/json");
        httpclient.checkStatusCode(200);

        JsonResult<Customer> result  = JSON.parseObject(ret, new

                TypeReference<JsonResult<Customer>>() {

                });
        //result=parseJsonResult(ret,Customer.class);
        Customer customer = result.getData();//JSONObject.parseObject(result.getData().toString(), Customer.class);
        System.out.println(customer);
        customer.setId(null);
        customer.setCustNo(null);

        ret = httpclient.post(url_producttype + "/save", customer.toString(), "application/json");
        httpclient.checkStatusCode(200);
        System.out.println(ret);

        JsonResult<Integer> retSave = JSON.parseObject(ret, JsonResult.class);

        System.out.println(retSave.getData());




    }

    @JTest
    @JTestClass.title("获取列表")
    @JTestClass.pre("")
    @JTestClass.step("test_0006_custExport")
    @JTestClass.exp("ok")
    public void test_0006_custExport() {


        String ret = httpclient.post(url_producttype + "/export", "{}", "application/json");
        httpclient.checkStatusCode(200);
        System.out.println(ret);


    }

    public static void main(String[] args) {

        run(TestProductType.class, 4);

    }


}
		