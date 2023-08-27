package kr.samdogs.clock02

import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {

    //시계담을 레이아웃
    lateinit var listView: LinearLayout
    lateinit var listViewMinute: LinearLayout

    val BLACK = "#000000"
    val GRAY  = "#999999"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hideSystemBarNavigationBar()

        //시간보이기
        var format = SimpleDateFormat("hh:mm:ss")
        val now = System.currentTimeMillis()
        val date = Date(now)
        val getTime: String = format.format(date)

        listView = findViewById(R.id.listView)
        listViewMinute = findViewById(R.id.listViewMinute)
        val timeText = getTime.split(":")

        val h = Integer.parseInt(timeText[0])
        val m = Integer.parseInt(timeText[1])
        if( h >= 10 ){
            createTextView("열",BLACK)
        }else{
            createTextView("열",GRAY)
        }

        when(h % 10){
            1 -> {
                createTextView("한",BLACK)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            2 -> {
                createTextView("한",GRAY)
                createTextView("두",BLACK)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            3 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",BLACK)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            4 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",BLACK)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            5 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",BLACK)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            6 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",BLACK)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            7 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",BLACK)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
            8 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",BLACK)
                createTextView("아홉",GRAY)
            }
            9 -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",BLACK)
            }
            else -> {
                createTextView("한",GRAY)
                createTextView("두",GRAY)
                createTextView("세",GRAY)
                createTextView("네",GRAY)
                createTextView("다섯",GRAY)
                createTextView("여섯",GRAY)
                createTextView("일곱",GRAY)
                createTextView("여덟",GRAY)
                createTextView("아홉",GRAY)
            }
        }
        createTextView("시",BLACK)

        when(m){
            in 20..29 -> {
                createTextViewMinute("이",BLACK)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
            }
            in 30..39 -> {
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",BLACK)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
            }
            in 40..49 -> {
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",BLACK)
                createTextViewMinute("오",GRAY)
            }
            in 50..59 -> {
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",BLACK)
            }
            else -> {
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
            }
        }
        if( m >= 10 ){
            createTextViewMinute("십",BLACK)
        }else {
            createTextViewMinute("십",GRAY)
        }

        when(m % 10 ){
            1 -> {
                createTextViewMinute("일",BLACK)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            2 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",BLACK)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            3 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",BLACK)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            4 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",BLACK)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            5 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",BLACK)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            6 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",BLACK)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            7 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",BLACK)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
            8 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",BLACK)
                createTextViewMinute("구",GRAY)
            }
            9 -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",BLACK)
            }
            else -> {
                createTextViewMinute("일",GRAY)
                createTextViewMinute("이",GRAY)
                createTextViewMinute("삼",GRAY)
                createTextViewMinute("사",GRAY)
                createTextViewMinute("오",GRAY)
                createTextViewMinute("육",GRAY)
                createTextViewMinute("칠",GRAY)
                createTextViewMinute("팔",GRAY)
                createTextViewMinute("구",GRAY)
            }
        }

        createTextViewMinute("분",BLACK)

    }

    //텍스트뷰 생성
    private fun createTextView(t: String, c: String) {
        val txtView : TextView = TextView(applicationContext)
        txtView.text = t
        txtView.textSize = 30f
        txtView.setTextColor(Color.parseColor(c))
        txtView.setTypeface(null, Typeface.BOLD)
        txtView.id = 0
        val param: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        param.marginStart = 30
        txtView.layoutParams = param
        listView.addView(txtView)
    }

    private fun createTextViewMinute(t: String, c: String) {
        val txtView : TextView = TextView(applicationContext)
        txtView.text = t
        txtView.textSize = 30f
        txtView.setTextColor(Color.parseColor(c))
        txtView.setTypeface(null, Typeface.BOLD)
        txtView.id = 0
        val param: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        param.marginStart = 30
        txtView.layoutParams = param
        listViewMinute.addView(txtView)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        //다른앱에 갔다와도 계속 안보이게 하기위해 이벤트 추가
        if(!hasFocus) return
        hideSystemBarNavigationBar()
    }

    private fun hideSystemBarNavigationBar(){
        //Status Bar, Navigation Bar 없애기
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.setDecorFitsSystemWindows(false)
            window.insetsController?.hide(WindowInsets.Type.systemBars() or WindowInsets.Type.navigationBars())
            window.insetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        } else {
            //API30 이후는 deprecated 된 아래 코드
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                            View.SYSTEM_UI_FLAG_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    )
        }
    }
}