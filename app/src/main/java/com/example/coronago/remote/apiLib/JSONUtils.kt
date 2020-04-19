package com.example.coronago.remote.apiLib

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*


object JSONUtils {
    const val KEY_STATUS = "status"
    const val KEY_RESULTS = "results"
    const val KEY_ERROR_CODE = "errorCode"
    const val STATUS_SUCCESS = "SUCCESS"
    const val STATUS_ERROR = "ERROR"
    @Throws(JSONException::class)
    fun isSuccess(jsonObject: JSONObject?): Boolean {
        return (null != jsonObject && jsonObject.has(KEY_STATUS)
                && STATUS_SUCCESS == jsonObject.getString(KEY_STATUS)
            .toUpperCase())
    }

    @Throws(JSONException::class)
    fun isError(jsonObject: JSONObject?): Boolean {
        return (null != jsonObject && jsonObject.has(KEY_STATUS)
                && STATUS_ERROR == jsonObject.getString(KEY_STATUS))
    }

    @Throws(JSONException::class)
    fun getErrorMessage(
        jsonObject: JSONObject,
        defaultErrorMessage: String?
    ): String {
        var message =
            defaultErrorMessage ?: ""
        if (isError(jsonObject) && jsonObject.has(KEY_RESULTS)) {
            message = jsonObject.getString(KEY_RESULTS)
        }
        return message
    }

    @Throws(JSONException::class)
    fun getErrorCode(jsonObject: JSONObject, defaultErrorCode: Int): Int {
        return if (jsonObject.has(KEY_ERROR_CODE)) jsonObject
            .getInt(KEY_ERROR_CODE) else defaultErrorCode
    }

    fun createErrorJSON(errorMessage: String?): JSONObject {
        val json = JSONObject()
        try {
            json.put(KEY_STATUS, STATUS_ERROR)
            json.put(KEY_RESULTS, errorMessage)
            json.put("message", errorMessage)
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return json
    }

    fun toPostData(json: JSONObject): String {
        return "data=$json"
    }

    @Throws(JSONException::class)
    fun fromPostData(postData: String): JSONObject {
        val jsonStr = postData.replace("data=", "")
        return JSONObject(jsonStr)
    }

    fun loggableString(`object`: JSONObject): String {
        `object`.remove("password")
        return `object`.toString()
    }

    @Throws(JSONException::class)
    fun removeNewLineCharacters(`object`: JSONObject): JSONObject {
        val jsonString = `object`.toString().replace("\n", " ")
        return JSONObject(jsonString)
    }

    fun String(
        jsonObject: JSONObject?,
        name: String?,
        defaultString: String?
    ): String? {
        var value = defaultString
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getString(
                    name
                ) else defaultString
        } catch (e: JSONException) {
        }
        return value
    }

    @JvmOverloads
    fun Long(
        jsonObject: JSONObject?,
        name: String?,
        defaultValue: Long? = 0L
    ): Long? {
        var value = defaultValue
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getLong(
                    name
                ) else value
        } catch (e: Exception) {
        }
        return value
    }

    fun Integer(jsonObject: JSONObject?, name: String?): Int {
        var value = 0
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getInt(
                    name
                ) else value
        } catch (e: JSONException) {
        }
        return value
    }

    fun Double(jsonObject: JSONObject?, name: String?): Double {
        var value = 0.0
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getDouble(
                    name
                ) else value
        } catch (e: JSONException) {
        }
        return value
    }

    fun JSONArray(jsonObject: JSONObject?, name: String?): JSONArray {
        var value = JSONArray()
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getJSONArray(
                    name
                ) else value
        } catch (e: JSONException) {
        }
        return value
    }

    @Throws(JSONException::class)
    fun toList(jsonArray: JSONArray): List<String> {
        val list: MutableList<String> =
            ArrayList()
        for (i in 0 until jsonArray.length()) {
            list.add(jsonArray.getString(i))
        }
        return list
    }

    fun JSONObject(jsonObject: JSONObject?, name: String?): JSONObject {
        var value = JSONObject()
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getJSONObject(
                    name
                ) else value
        } catch (e: JSONException) {
        }
        return value
    }

    // Generic methods
    operator fun <T> get(
        jsonObject: JSONObject?,
        name: String?,
        type: Class<T>?,
        defaultValue: T?
    ): T? {
        var value = defaultValue
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject[name] as T else value
        } catch (e: JSONException) {
        }
        return value
    }

    operator fun <T> get(jsonObject: JSONObject?, name: String?, type: Class<T>?): T? {
        return get(jsonObject, name, type, null)
    }

    @JvmOverloads
    fun Boolean(
        jsonObject: JSONObject?,
        name: String?,
        defaultValue: Boolean = false
    ): Boolean {
        var value = defaultValue
        try {
            value =
                if (null != jsonObject && jsonObject.has(name) && !jsonObject.isNull(name)) jsonObject.getBoolean(
                    name
                ) else value
        } catch (e: JSONException) {
        }
        return value
    }
}
