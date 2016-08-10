
/* 1. addService
 * 2. while(true) { read data, parse data, call function, reply }
 */

public class TestServer {
    private static final String TAG = "TestServer";

    public static void main(String args[])
    {
        /* add Service */
        Slog.i(TAG, "add hello service");
        ServiceManager.addService("hello", new HelloService());

        while (true)
        {
            Thread.sleep(100);
        }
        
    }
}
 
