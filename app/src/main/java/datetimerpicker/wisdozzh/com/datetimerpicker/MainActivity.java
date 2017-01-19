package datetimerpicker.wisdozzh.com.datetimerpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * <pre>
 *    author：Wisdozzh
 *    blog：http://blog.csdn.net/zzh_receive
 *    github: https://github.com/Wisdozzh
 *    time：2017年1月19日 上午9:07:26
 *    disc：时间拾取器界面
 * </pre>
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    private EditText startDateTime;
    private EditText endDateTime;

    private String initStartDateTime = "2013年9月3日 14:44"; // 初始化开始时间
    private String initEndDateTime = "2014年8月23日 17:44"; // 初始化结束时间

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 两个输入框
        startDateTime = (EditText) findViewById(R.id.inputDate);
        endDateTime = (EditText) findViewById(R.id.inputDate2);

        startDateTime.setText(initStartDateTime);
        endDateTime.setText(initEndDateTime);
        startDateTime.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
                        MainActivity.this, initEndDateTime);
                dateTimePicKDialog.dateTimePicKDialog(startDateTime);

            }
        });

        endDateTime.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
                        MainActivity.this, initEndDateTime);
                dateTimePicKDialog.dateTimePicKDialog(endDateTime);
            }
        });
    }
}
