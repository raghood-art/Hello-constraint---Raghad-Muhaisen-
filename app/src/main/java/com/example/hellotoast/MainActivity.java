package com.example.hellotoast;
import androidx.appcompat.app.AppCompatActivity; import android.content.res.ColorStateList; import android.graphics.Color; import android.os.Bundle; import android.view.View; import android.widget.TextView; import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.text_display_count);
    }


    public void increase_count(View view) {
        count++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(count));
        }

         if (count % 2 != 0) {

             view.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_green_dark)));
        } else {

            view.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_blue_dark)));
        }
    }

     public void zeroCount(View view) {
        count = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(count));
        }
    }

     public void
     showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }
}