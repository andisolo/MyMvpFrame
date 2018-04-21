package com.jjkj.administrator.mymvpframe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                TextView textView = new TextView(MainActivity.this);
                textView.setText("这是新的文本内容");
                String code="7b0HYBxJliUmL23Ke39K9UrX4HShCIBgEyTYkEAQ7MGIzeaS7B1pRyMpqyqBymVWZV1mFkDM7Z28995777333nvvvfe6O51OJ/ff/z9cZmQBbPbOStrJniGAqsgfP358Hz8ifo1f89f4NX6N/5se/MTzG/1a9M+L19dNmy/GT7M2G6U/mddNUS0/2xvv4L9RerIu23Wdf7bM122dlaP05XpSFtPfK79+U73Nl59NHjzI7k/vf7r78N5+vnPw8NcF8N/Sg8n/vM7bX5s+/2319/GrfFG1xfJCu/ux33tRvp7O80X2G9JvT4vz88/rbPFr/5q/5m+igLQd8P0xAPr1fh3656/5dR//Hu8WZXqpOH+0O975KM2X02pGoD/7aN2eb+9++tHvcfQbJ4/fNY8a7iAtZp999CK/Ukw+SgnCsvnsI/3l0Tv6fd62q0d3715dXY2v7o2r+uLu3s7O7t3f+4vngqRpu2hmBIU6qpcKvdleFNO6aqrzdntaLR5Ru21p9RFhkabAIy/zRb5s02W2yENUpOWjs0Y/+eyjtl7n9vOvmvxkXdf07vNqmpW5fs2ABTR1uSrzd2+uV7l+qp/Pq2Kap4ti+eV0uq5piESoRfbO/LVeTqr1cpbPDDDzYojrm2xS5rt+m+Fu3bdN/ovWNCndr2Id/GSx+ihtCcxnH+HFtqZ5tMNvs/oib19Qw2aVTXNMWTigu93O7w71zt/EseavFCtHQ27PRDTUjkHovCv9M18c/Xq/LjHsn/FrPZ4Rb1/Uj+RHtvg6jKTvCIib3jEdbV/SvD12zHb0WCYzVYQgFfLJriV4XV19Wc/ymomr7eZZczLPlhc5kbxYNnndgmke08QdPfvJ3U93Pt19cH939/7ju/jk8V0BSb/4Pd/tEOHo14FId0QdAv7r/f5fZD9d1fSjWOLHk3VRzn7s93+VXxZoAhX2G9ADrYDn/9bnN/x/AA==";
            }
        });
    }
}
