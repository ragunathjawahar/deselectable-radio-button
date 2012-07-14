package com.mobsandgeeks.widget.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

import com.mobsandgeeks.widget.R;
import com.mobsandgeeks.widget.UncheckableRadioButton;

public class DemoActivity extends Activity implements OnCheckedChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        
        // UI References
        UncheckableRadioButton inkyRadioButton = (UncheckableRadioButton) findViewById(R.id.inky);
        UncheckableRadioButton pinkyRadioButton = (UncheckableRadioButton) findViewById(R.id.pinky);
        UncheckableRadioButton ponkyRadioButton = (UncheckableRadioButton) findViewById(R.id.ponky);
        
        // Event listeners
        inkyRadioButton.setOnCheckedChangeListener(this);
        pinkyRadioButton.setOnCheckedChangeListener(this);
        ponkyRadioButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked) {
            int messageResId = R.string.app_name;
            
            switch(buttonView.getId()) {
            case R.id.inky:
                messageResId = R.string.inky;
                break;
            case R.id.pinky:
                messageResId = R.string.pinky;
                break;
            case R.id.ponky:
                messageResId = R.string.ponky;
                break;
            }
            
            Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
        }
    }    
}
