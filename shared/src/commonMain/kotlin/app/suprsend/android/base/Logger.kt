package app.suprsend.android.base

internal object Logger {

    private val loggerKMM = LoggerKMM()

    fun i(tag: String, message: String) {
        loggerKMM.i(tag, message)
    }

    fun e(tag: String, message: String, throwable: Throwable? = null) {
        loggerKMM.e(tag, message, throwable)
    }
}
