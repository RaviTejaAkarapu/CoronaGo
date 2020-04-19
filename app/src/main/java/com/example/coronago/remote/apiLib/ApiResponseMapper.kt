package com.example.coronago.remote.apiLib

import android.util.Log
import android.widget.Toast
import com.example.coronago.model.District
import com.google.gson.JsonElement
import org.json.JSONObject

class ApiResponseMapper {

    companion object {
        fun toDistrictWiseData(jsonElement: JsonElement): MutableList<District> {
            val result = JSONObject(jsonElement.toString())
            var districtDataa: MutableList<District> = mutableListOf()
            val data = JSONUtils.JSONArray(result, "state")
            for (i in 1..data.length()) {
                val districtData = JSONUtils.JSONObject(data[i] as JSONObject?, "districtData")
                for (j in 1..districtData.length()) {
                    val distJson: JSONObject = districtData.getJSONObject("district")

                    val dist = District(
                        JSONUtils.String(distJson, "district", "Unknown").toString(),
                        JSONUtils.Integer(distJson, "confirmed"),
                        JSONUtils.Integer(distJson, "active"),
                        JSONUtils.Integer(distJson, "recovered"),
                        JSONUtils.Integer(distJson, "deceased"))
                    districtDataa.add(dist)
                    Log.d("distData", dist.toString())
                }
            }
            return districtDataa
        }

    }
}