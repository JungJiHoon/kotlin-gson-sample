package com.cplaygr.sample.gson.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cplaygr.sample.gson.R
import com.cplaygr.sample.gson.data.DummyJsonData
import com.cplaygr.sample.gson.databinding.ActivityMainBinding
import com.cplaygr.sample.gson.model.DramaModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "_MainActivity"
    }

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        initListeners()
    }

    private fun initListeners() {
        activityMainBinding.serializeBtn.setOnClickListener {
            serializeJsonData().let { json ->
                activityMainBinding.resultTextView.text = json
            }
        }
        activityMainBinding.deserializeBtn.setOnClickListener {
            deserializeJsonData().let { model ->
                (model as DramaModel).also { dramaModel ->
                    activityMainBinding.resultTextView.text = dramaModel.dramaTitle + dramaModel.dramaSeason
                }
            }
        }
        activityMainBinding.prettyPrintBtn.setOnClickListener {
            setPrettyJsonData().let { json ->
                activityMainBinding.resultTextView.text = json
            }
        }
    }

    private fun deserializeJsonData(): DramaModel? {
        return Gson().fromJson(DummyJsonData.getJsonData(), DramaModel::class.java).also { model ->
            Log.d(TAG, "deserializeJsonData: $model")
        }
    }

    private fun serializeJsonData(): String {
        var jsonString: String = ""
        deserializeJsonData().also { model ->
            jsonString = Gson().toJson(model)
            Log.d(TAG, "serializeJsonData: $jsonString")
        }
        return jsonString
    }

    private fun setPrettyJsonData(): String {
        var jsonString: String = ""
        deserializeJsonData().let { model ->
            jsonString = GsonBuilder().setPrettyPrinting().create().toJson(model)
            Log.d(TAG, "setPrettyJsonData: $jsonString")
        }
        return jsonString
    }
}