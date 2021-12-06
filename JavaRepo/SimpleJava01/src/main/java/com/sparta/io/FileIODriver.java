package com.sparta.io;

public class FileIODriver {
    public static void main(String[] args) {
        BinaryFileIO.readBinaryFile("SortManagerReq.txt");
        BinaryFileIO.copyBinaryFile("SortManagerReq.txt", "newFile.txt");
    }
}
