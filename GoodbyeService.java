
import android.util.Slog;

/* 实现Goodbye服务的函数 */

public class GoodbyeService extends IGoodbyeService.Stub {
    private static final String TAG = "GoodbyeService";
    private int cnt1 = 0;
    private int cnt2 = 0;

    public void saygoodbye() throws android.os.RemoteException {
        cnt1++;
        Slog.i(TAG, "saygoodbye : cnt = "+cnt1);
    }
    
    public int saygoodbye_to(java.lang.String name) throws android.os.RemoteException {
        cnt2++;
        Slog.i(TAG, "saygoodbye_to "+name+" : cnt = "+cnt2);
        return cnt2;
    }
}

