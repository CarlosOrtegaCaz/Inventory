package com.example.myinventory;

import android.provider.BaseColumns;

public class FeedReaderContract {
    private FeedReaderContract() {}

    public static class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "tbl_usuario";
        public static final String COLUMN_USER = "usuario";
        public static final String COLUMN_PASS = "password";
    }


}
