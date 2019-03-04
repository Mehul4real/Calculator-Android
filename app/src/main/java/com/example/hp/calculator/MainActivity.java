package com.example.hp.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView initial;
    private TextView total;
    private Button   one;
    private Button   two;
    private Button   three;
    private Button   four;
    private Button   five;
    private Button   six;
    private Button   seven;
    private Button   eight;
    private Button   nine;
    private Button   zero;
    private Button   dot;
    private Button   ans;
    private Button   mul;
    private Button   div;
    private Button   add;
    private Button   sub;
    private Button   delete;
    float in, fi, re;
    int fd=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial = (TextView)findViewById(R.id.initial);
        total = (TextView)findViewById(R.id.total);


        numbers();
        operations();
        answer();
    }
    String x,y;
    protected void numbers(){
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        dot=(Button)findViewById(R.id.dot);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            x=initial.getText().toString();
            if(!x.equals("0"))
            initial.setText(x+"1");
            else
                initial.setText("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"2");
                else
                    initial.setText("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"3");
                else
                    initial.setText("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"4");
                else
                    initial.setText("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"5");
                else
                    initial.setText("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"6");
                else
                    initial.setText("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"7");
                else
                    initial.setText("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"8");
                else
                    initial.setText("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if(!x.equals("0"))
                    initial.setText(x+"9");
                else
                    initial.setText("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if (!x.equals("0")){
                initial.setText(x+"0");}
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (fd==0){
                  x=initial.getText().toString();
                  initial.setText(x+".");
                  fd=1;
              }
            }
        });

    }
    int flag=0;
    protected void operations(){

        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        delete=(Button)findViewById(R.id.del);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            x=initial.getText().toString();
            if (!x.equals("")) {
                if (flag == 1) {
                    in = Float.parseFloat(initial.getText().toString());
                    fi = Float.parseFloat(total.getText().toString());
                    re = fi + in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag = 1;
                    fd=0;
                } else if (flag == 0) {
                    x = initial.getText().toString();
                    total.setText(x);
                    initial.setText(null);
                    flag = 1;
                    fd=0;
                } else if (flag == 2) {
                    in = Float.parseFloat(initial.getText().toString());
                    fi = Float.parseFloat(total.getText().toString());
                    re = fi - in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag = 1;
                    fd=0;
                } else if (flag == 3) {
                    in = Float.parseFloat(initial.getText().toString());
                    fi = Float.parseFloat(total.getText().toString());
                    re = fi * in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag = 1;
                    fd=0;
                } else if (flag == 4) {
                    in = Float.parseFloat(initial.getText().toString());
                    fi = Float.parseFloat(total.getText().toString());
                    re = fi / in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag = 1;
                    fd=0;
                }
            }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              x=initial.getText().toString();
              if (!x.equals("")) {
                  if (flag == 1) {
                      in = Float.parseFloat(initial.getText().toString());
                      fi = Float.parseFloat(total.getText().toString());
                      re = fi + in;
                      total.setText(Float.toString(re));
                      initial.setText(null);
                      flag = 2;
                      fd=0;
                  } else if (flag == 0) {
                      x = initial.getText().toString();
                      total.setText(x);
                      initial.setText(null);
                      flag = 2;
                      fd=0;
                  } else if (flag == 2) {
                      in = Float.parseFloat(initial.getText().toString());
                      fi = Float.parseFloat(total.getText().toString());
                      re = fi - in;
                      total.setText(Float.toString(re));
                      initial.setText(null);
                      flag = 2;
                      fd=0;
                  } else if (flag == 3) {
                      in = Float.parseFloat(initial.getText().toString());
                      fi = Float.parseFloat(total.getText().toString());
                      re = fi * in;
                      total.setText(Float.toString(re));
                      initial.setText(null);
                      flag = 2;
                      fd=0;
                  } else if (flag == 4) {
                      in = Float.parseFloat(initial.getText().toString());
                      fi = Float.parseFloat(total.getText().toString());
                      re = fi / in;
                      total.setText(Float.toString(re));
                      initial.setText(null);
                      flag = 2;
                      fd=0;
                  }
              }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               x=initial.getText().toString();
               if (!x.equals("")) {
                   if (flag == 1) {
                       in = Float.parseFloat(initial.getText().toString());
                       fi = Float.parseFloat(total.getText().toString());
                       re = fi + in;
                       total.setText(Float.toString(re));
                       initial.setText(null);
                       flag = 3;
                       fd=0;
                   } else if (flag == 0) {
                       x = initial.getText().toString();
                       total.setText(x);
                       initial.setText(null);
                       flag = 3;
                       fd=0;
                   } else if (flag == 2) {
                       in = Float.parseFloat(initial.getText().toString());
                       fi = Float.parseFloat(total.getText().toString());
                       re = fi - in;
                       total.setText(Float.toString(re));
                       initial.setText(null);
                       flag = 3;
                       fd=0;
                   } else if (flag == 3) {
                       in = Float.parseFloat(initial.getText().toString());
                       fi = Float.parseFloat(total.getText().toString());
                       re = fi * in;
                       total.setText(Float.toString(re));
                       initial.setText(null);
                       flag = 3;
                       fd=0;
                   } else if (flag == 4) {
                       in = Float.parseFloat(initial.getText().toString());
                       fi = Float.parseFloat(total.getText().toString());
                       re = fi / in;
                       total.setText(Float.toString(re));
                       initial.setText(null);
                       flag = 3;
                       fd=0;
                   }
               }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=initial.getText().toString();
                if (!x.equals("")){
                    if (flag == 1) {
                        in = Float.parseFloat(initial.getText().toString());
                        fi = Float.parseFloat(total.getText().toString());
                        re = fi + in;
                        total.setText(Float.toString(re));
                        initial.setText(null);
                        flag = 4;
                        fd=0;
                    } else if (flag == 0) {
                        x = initial.getText().toString();
                        total.setText(x);
                        initial.setText(null);
                        flag = 4;
                        fd=0;
                    } else if (flag == 2) {
                        in = Float.parseFloat(initial.getText().toString());
                        fi = Float.parseFloat(total.getText().toString());
                        re = fi - in;
                        total.setText(Float.toString(re));
                        initial.setText(null);
                        flag = 4;
                        fd=0;
                    } else if (flag == 3) {
                        in = Float.parseFloat(initial.getText().toString());
                        fi = Float.parseFloat(total.getText().toString());
                        re = fi * in;
                        total.setText(Float.toString(re));
                        initial.setText(null);
                        flag = 4;
                        fd=0;
                    } else if (flag == 4) {
                        in = Float.parseFloat(initial.getText().toString());
                        fi = Float.parseFloat(total.getText().toString());
                        re = fi / in;
                        total.setText(Float.toString(re));
                        initial.setText(null);
                        flag = 4;
                        fd=0;
                    }
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               x=initial.getText().toString();
               if (!x.equals("")){
                StringBuffer sb =new StringBuffer(x);
                sb.deleteCharAt(sb.length()-1);
                initial.setText(sb);}
            }
        });
        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                initial.setText("");
                total.setText("");
                fd=0;
                return false;
            }
        });

    }
    protected void answer(){
        ans=(Button)findViewById(R.id.eq);
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==1){
                    in=Float.parseFloat(initial.getText().toString());
                    fi=Float.parseFloat(total.getText().toString());
                    re=fi+in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag=0;
                    fd=0;
                }
                else if(flag==0) {
                    x = initial.getText().toString();
                    total.setText(x);
                    initial.setText(null);
                    flag=0;
                    fd=0;
                }
                else if (flag==2){
                    in=Float.parseFloat(initial.getText().toString());
                    fi=Float.parseFloat(total.getText().toString());
                    re=fi-in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag=0;
                    fd=0;
                }
                else if (flag==3){
                    in=Float.parseFloat(initial.getText().toString());
                    fi=Float.parseFloat(total.getText().toString());
                    re=fi*in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag=0;
                    fd=0;
                }
                else if (flag==4){
                    in=Float.parseFloat(initial.getText().toString());
                    fi=Float.parseFloat(total.getText().toString());
                    re=fi/in;
                    total.setText(Float.toString(re));
                    initial.setText(null);
                    flag=0;
                    fd=0;
                }
            }
        });
    }



}
