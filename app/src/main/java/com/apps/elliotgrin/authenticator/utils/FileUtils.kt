package com.apps.elliotgrin.authenticator.utils

import java.io.*
import java.util.zip.CRC32


object FileUtils {
    fun getChecksumFromFile(path: String): Long {
        val file = File(path)
        val size = file.length()
        val bytes = ByteArray(size.toInt())
        val buf = BufferedInputStream(FileInputStream(file))

        buf.read(bytes, 0, bytes.size)
        buf.close()

        val checksum = CRC32()
        checksum.update(bytes, 0, bytes.size)

        return checksum.value
    }
}