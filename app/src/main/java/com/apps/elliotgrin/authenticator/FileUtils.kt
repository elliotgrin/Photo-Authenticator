package com.apps.elliotgrin.authenticator

import java.io.*


object FileUtils {
    fun getBytesFromFile(path: String): ByteArray {
        val file = File(path)
        val size = file.length()
        val bytes = ByteArray(size.toInt())
        val buf = BufferedInputStream(FileInputStream(file))

        buf.read(bytes, 0, bytes.size)
        buf.close()

        return bytes
    }
}