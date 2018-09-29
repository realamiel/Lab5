import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyCustomService extends IntentService {
    public MyCustomService() {
        super ("MyCustomService");
    }

    protected void onHandleIntent(Intent intent) {
        Log.d("4itc", "service is running...");
    }
}