package com.example.hp2.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main2Activity extends AppCompatActivity {
    TextView txt,txt2,txt3;
    ArrayList generated;
    StringBuffer temp;
    int x;
    int m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent rcv = getIntent();
        String name = rcv.getStringExtra("keyName");
         m=Integer.valueOf(name);

        x=m*3;
        txt = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);

        txt.setText("No of players  "+name);

        Random r = new Random();
        generated = new ArrayList();
        temp =new StringBuffer();

        while (generated.size() < x)

{
            int j = r.nextInt(x - 0)+ 0;
            if (!generated.contains(j)) {
                for(int l=0;l<=m;l++)

               {if(generated.size()==3*l){
                   temp.append("\n");
                   int o=l+1;
                temp.append(String.valueOf(" Player " + o + "  "));}
               }
                generated.add(j);

                temp.append(String.valueOf(j));

                temp.append(String.valueOf("  "));
            }
        }
        txt2.setText(temp.toString());





    }
    public void but1(View view){

       StringBuffer temp2=new StringBuffer();
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        Random r4 = new Random();
        Random r5 = new Random();
        Random r6 = new Random();
        Random r7 = new Random();
        Random r8 = new Random();
        Random r9 = new Random();
        Random r10 = new Random();
        Random r11 = new Random();
        Random r12 = new Random();

        int z=0;
        for(int h=1;h<2;h++)

        {
            int p = r1.nextInt(x - 0)+ 0;
          int b=generated.indexOf(p);
            if (generated.contains(p)) {


                generated.set(b," ");





            }
            else{
                 p = r2.nextInt(x - 0)+ 0;
                 b=generated.indexOf(p);
                if (generated.contains(p)) {


                    generated.set(b," ");





                }
                else{
                    p = r3.nextInt(x - 0)+ 0;
                    b=generated.indexOf(p);
                    if (generated.contains(p)) {


                        generated.set(b," ");





                    }
                    else{
                        p = r4.nextInt(x - 0)+ 0;
                        b=generated.indexOf(p);
                        if (generated.contains(p)) {


                            generated.set(b," ");





                        }

                        else{
                            p = r5.nextInt(x - 0)+ 0;
                            b=generated.indexOf(p);
                            if (generated.contains(p)) {


                                generated.set(b," ");





                            }
                            else{
                                p = r6.nextInt(x - 0)+ 0;
                                b=generated.indexOf(p);
                                if (generated.contains(p)) {


                                    generated.set(b," ");





                                }
                                else{
                                    p = r7.nextInt(x - 0)+ 0;
                                    b=generated.indexOf(p);
                                    if (generated.contains(p)) {


                                        generated.set(b," ");





                                    }
                                    else{
                                        p = r8.nextInt(x - 0)+ 0;
                                        b=generated.indexOf(p);
                                        if (generated.contains(p)) {


                                            generated.set(b," ");





                                        }
                                        else{
                                            p = r9.nextInt(x - 0)+ 0;
                                            b=generated.indexOf(p);
                                            if (generated.contains(p)) {


                                                generated.set(b," ");





                                            }
                                            else{
                                                p = r10.nextInt(x - 0)+ 0;
                                                b=generated.indexOf(p);
                                                if (generated.contains(p)) {


                                                    generated.set(b," ");





                                                }
                                                else{
                                                    p = r11.nextInt(x - 0)+ 0;
                                                    b=generated.indexOf(p);
                                                    if (generated.contains(p)) {


                                                        generated.set(b," ");





                                                    }
                                                    else{
                                                        p = r11.nextInt(x - 0)+ 0;
                                                        b=generated.indexOf(p);
                                                        if (generated.contains(p)) {


                                                            generated.set(b," ");





                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }
                    }

                }

            }
            int index=0;
            for(int c=0;c<generated.size();c++){
                for(int l=0;l<=m;l++)

                {if(index==3*l){
                    temp2.append("\n");
                    int o=l+1;
                    temp2.append(String.valueOf(" Player " + o + "  "));}
                }
                temp2.append(generated.get(c)+"  ");
                ++index;
            }
        }
        txt2.setText(temp2.toString());


    }
}
