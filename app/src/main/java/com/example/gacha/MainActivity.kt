package com.example.gacha

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val models = listOf(
            GachaModel(
                name = "スターパルス",
                description = "演出と排出テンポのバランスが良いモデル。",
                score = 82,
            ),
            GachaModel(
                name = "ルミナスブースト",
                description = "高レア演出を重視したモデル。",
                score = 75,
            ),
            GachaModel(
                name = "スカイエコー",
                description = "軽量でテンポを優先したモデル。",
                score = 70,
            ),
            GachaModel(
                name = "ノヴァスパーク",
                description = "ストーリー連動演出を意識したモデル。",
                score = 78,
            ),
        )

        val bestModel = models.maxByOrNull { it.score } ?: models.first()
        findViewById<TextView>(R.id.bestModelName).text = bestModel.name
        findViewById<TextView>(R.id.bestModelDescription).text = bestModel.description
    }
}
