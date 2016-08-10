
/* 1. getService
 * 2. 调用服务的sayhello,sayhello_to
 *
 */

/* test_client <hello|goodbye> [name] */

public class TestClient {
    private static final String TAG = "TestClient";

    public static void main(String args[])
    {
        if (args.length == 0)
        {
            System.out.println("Usage: need parameter: <hello|goodbye> [name]");
            return;
        }

        if (args[0].equals("hello"))
        {
            /* 1. getService */
            IBinder binder = ServiceManager.getService("hello");
            if (binder == null)
            {
                System.out.println("can not get hello service");
                Slog.i(TAG, "can not get hello service");
                return;
            }

            IHelloService svr = IHelloService.Stub.asInterface(binder);

            if (args.length == 1)
            {
                svr.sayhello();
                System.out.println("call sayhello");
                Slog.i(TAG, "call sayhello");
            }
            else
            {
                int cnt = svr.sayhello_to(args[1]);
                System.out.println("call sayhello_to "+args[1]+" : cnt = "+cnt);
                Slog.i(TAG, "call sayhello_to "+args[1]+" : cnt = "+cnt);
            }
        }
    }
}

