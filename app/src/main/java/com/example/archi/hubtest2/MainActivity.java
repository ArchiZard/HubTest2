package com.example.archi.hubtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initial push
        // enable
        //1st revision commit without push
        //2nd revision with push
        //3rd revision with creating new branch (프로젝트 폴더 -> git -> repository -> branch에서 만드는  new branch는 local branch임)
        //new branch 만들고 commit은 안함. 그럼 이제 커밋만들면 어케되는지 보자.
        //4th revision VC log에서는 그냥 branch 1에서 commint 만들었다고만 나오네? 이제 commmit 하나 더 만들고 local new branch 에서 push 해볼까?
        //5th 이번엔 remote branch에 keyin으로 new branch 만들어서 거기다가 push해보자

    }
}
