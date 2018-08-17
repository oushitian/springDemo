import com.jolly.pattern.adapter.InterfaceRealAdapter;
import com.jolly.pattern.adapter.MobileAdapter;
import com.jolly.pattern.adapter.MobileObjAdapter;
import com.jolly.pattern.origin.MobilePhoto;

/**
 * 描述:测试类
 *
 * @author fd
 * @create 2018-08-17 10:00
 **/
public class Test {

    public static void main(String[] args) {
        MobileAdapter mobileAdapter = new MobileAdapter();
        mobileAdapter.call("fd");
        mobileAdapter.photo("fd");

        MobileObjAdapter mobileObjAdapter = new MobileObjAdapter(new MobilePhoto());
        mobileObjAdapter.photo("小马哥");

        InterfaceRealAdapter interfaceRealAdapter = new InterfaceRealAdapter();
        interfaceRealAdapter.A();
        interfaceRealAdapter.B();
    }
}
