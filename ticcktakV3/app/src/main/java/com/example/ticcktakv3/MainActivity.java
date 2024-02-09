package com.example.ticcktakv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView dis_x,dis_o;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,rst,rst_sc;

    String b1,b2,b3,b4,b5,b6,b7,b8,b9,rs,rsts;



    int flag;

    {
        flag = 0;
    }

    int count=0;
    int score_A=0;
    int score_B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    public void init(){
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        rst=findViewById(R.id.rst);
        rst_sc=findViewById(R.id.rst_sc);
        dis_o=findViewById(R.id.dis_o);
        dis_x=findViewById(R.id.dis_x);
    }
    public void Check(View view){

        Button btnCurrent = (Button) view;

        if(btnCurrent.getText().toString().equals("") || btnCurrent.getText().toString().equals("RESET GAME") || btnCurrent.getText().toString().equals("RESET BOARD")){


            if(flag==0){
                btnCurrent.setText("X");
                flag=1;
                count++;


            }else if(flag==1){
                btnCurrent.setText("O");
                flag=0;
                count++;
            }

            b1=bt1.getText().toString();
            b2=bt2.getText().toString();
            b3=bt3.getText().toString();
            b4=bt4.getText().toString();
            b5=bt5.getText().toString();
            b6=bt6.getText().toString();
            b7=bt7.getText().toString();
            b8=bt8.getText().toString();
            b9=bt9.getText().toString();
            rs=rst.getText().toString();
            rsts=rst_sc.getText().toString();
            if (!rs.equals("RESET GAME")) {
                rst.setText("RESET GAME");
                rst();
                score_A = 0;
                score_B = 0;


            }
            if (!rsts.equals("RESET BOARD")) {
                rst_sc.setText("RESET BOARD");
                rst();
            }




            if(b1.equals(b2) && b2.equals(b3)&& !b1.equals("") ){
                if(b1.equals("X")){
                    score_A++;
                } else if (b1.equals("O")) {
                    score_B++;

                }

                Toast.makeText(this, "Wiiner is "+b1, Toast.LENGTH_SHORT).show();
                rst();



            } else if (b4.equals(b5) && b5.equals(b6)&& !b4.equals("")) {
                if(b4.equals("X")){
                    score_A++;
                } else if (b4.equals("O")) {
                    score_B++;

                }

                Toast.makeText(this, "Wiiner is "+b4, Toast.LENGTH_SHORT).show();
                rst();



            } else if (b7.equals(b8) && b8.equals(b9)&& !b7.equals("")) {
                if(b7.equals("X")){
                    score_A++;
                } else if (b7.equals("O")) {
                    score_B++;

                }
                Toast.makeText(this, "Wiiner is "+b7, Toast.LENGTH_SHORT).show();

                rst();


            } else if (b1.equals(b5) && b5.equals(b9)&& !b1.equals("")) {
                if(b1.equals("X")){
                    score_A++;
                } else if (b1.equals("O")) {
                    score_B++;

                }
                Toast.makeText(this, "Wiiner is "+b1, Toast.LENGTH_SHORT).show();
                rst();

            } else if (b3.equals(b5) && b7.equals(b5)&& !b3.equals("")) {
                if(b3.equals("X")){
                    score_A++;
                } else if (b3.equals("O")) {
                    score_B++;

                }

                Toast.makeText(this, "Wiiner is "+b3, Toast.LENGTH_SHORT).show();
                rst();


            } else if (b1.equals(b4) && b4.equals(b7)&& !b1.equals("")) {
                if(b1.equals("X")){
                    score_A++;
                } else if (b1.equals("O")) {
                    score_B++;

                }


                Toast.makeText(this, "Wiiner is "+b1, Toast.LENGTH_SHORT).show();
                rst();


            } else if (b2.equals(b5) && b5.equals(b8)&& !b2.equals("")) {
                if(b2.equals("X")){
                    score_A++;
                } else if (b2.equals("O")) {
                    score_B++;

                }
                Toast.makeText(this, "Wiiner is "+b7, Toast.LENGTH_SHORT).show();
                rst();


            } else if (b3.equals(b6) && b6.equals(b9)&& !b3.equals("")) {
                if(b3.equals("X")){
                    score_A++;
                } else if (b3.equals("O")) {
                    score_B++;

                }
                Toast.makeText(this, "Wiiner is "+b3, Toast.LENGTH_SHORT).show();
                rst();



            }
            else if(count==9){
                Toast.makeText(this, "Daw", Toast.LENGTH_SHORT).show();
                rst();
            }
            dis_x.setText("score of X is  "+score_A);
            dis_o.setText("score of O is  "+score_B);



        }
    }

    public  void rst(){
        // wait 1 sec before reset
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt8.setText("");
        bt9.setText("");


        flag=0;
        count=0;


    }

}
