package com.example.parcial1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnFibonacci, btnPower, btnMultiply;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.et_num1);
        num2 = findViewById(R.id.et_num2);
        btnFibonacci = findViewById(R.id.btn_fibonacci);
        btnPower = findViewById(R.id.btn_power);
        btnMultiply = findViewById(R.id.btn_multiply);
        result = findViewById(R.id.tv_result);

        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = fibonacci(n1);
                result.setText("Fibonacci: " + res);
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = power(n1, n2);
                result.setText("Power: " + res);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = multiply(n1, n2);
                result.setText("Multiply: " + res);
            }
        });
    }

    public static int fibonacci(int n1) {
        if (n1 == 0 )
            return 0;
        else if (n1 == 1)
            return 1;
        else
            return fibonacci(n1 - 1) + fibonacci(n1 - 2);
    }

    public static int power(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }
}