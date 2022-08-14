package com.example.activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    // 최초 1회 실행, 액티비티가 메모리에 올라갈 때 실행
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.i("onCreate Called")
    }

    // 화면에 보여지는 시점, 액티비티가 다른 뷰에 가렸다가 다시 나타나는 경우
    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
    }

    // 사용자와 상호 작용 할 수 있는 상태가 된 시점, 최초 실행시에도 onResume()은 실행
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    // 액티비티가 메모리에서 제거된 시점에 실행, 자원해제
    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    // 화면에 보이지 않은 시점에 실행
    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    // 액티비티가 다시 보이기 시작한 시점점
    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }

    // 포커스를 잃은 시점에 실행 <-> onResume()
    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }
}