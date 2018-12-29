package kr.tjit.startactivityforresulttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditUserInfoActivity extends BaseActivity {

    private android.widget.EditText nameEdt;
    private android.widget.Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_info);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                이전 화면으로 돌아가는 경우에는 intent의 재료가 아무것도 없음
                Intent intent = new Intent();
                intent.putExtra("이름", nameEdt.getText().toString());

//                ok버튼이 눌렸음을 알려주면서  데이터가 담긴 intent를 첨부
                setResult(RESULT_OK, intent);

//                설정이 완료되면 화면 종료
                finish();
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);

    }
}
