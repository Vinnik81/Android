package com.example.sqlite.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.sqlite.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "MyDb";
    private static final String TABLE_STUDENTS = "Student";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_FIRST_NAME = "firstName";
    private static final String COLUMN_LAST_NAME = "lastName";
    private static final String COLUMN_AGE = "age";
    private final String CREATE_STUDENTS_SCRIPT = "CREATE TABLE " + TABLE_STUDENTS + " ( "
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_FIRST_NAME + " TEXT NOT NULL , "
            + COLUMN_LAST_NAME + " TEXT NOT NULL ,"
            + COLUMN_AGE + " INTEGER NOT NULL "
            + ")";

    public boolean addStudent(Student student) {
        try {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(COLUMN_FIRST_NAME, student.getFirstName());
            values.put(COLUMN_LAST_NAME, student.getLastName());
            values.put(COLUMN_AGE, student.getAge());
            sqLiteDatabase.insert(TABLE_STUDENTS, null, values);
            sqLiteDatabase.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public int updateStudent(Student student) {
        try {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(COLUMN_FIRST_NAME, student.getFirstName());
            values.put(COLUMN_LAST_NAME, student.getLastName());
            values.put(COLUMN_AGE, student.getAge());
            int result = sqLiteDatabase.update(TABLE_STUDENTS, values, COLUMN_ID + " = ? ", new String[]{String.valueOf(student.getId())});
            sqLiteDatabase.close();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public void deleteStudent(Student student) {
        try {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            sqLiteDatabase.delete(TABLE_STUDENTS, COLUMN_ID + " = ? ", new String[]{String.valueOf(student.getId())});
            sqLiteDatabase.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Student getById(int id) {
        try {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query(TABLE_STUDENTS, new String[]{COLUMN_ID, COLUMN_FIRST_NAME, COLUMN_LAST_NAME, COLUMN_AGE},
                    COLUMN_ID + " = ? ", new String[]{String.valueOf(id)},
                    null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
            }
            Student student = new Student(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3));
            db.close();
            return student;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        try {
            SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_STUDENTS, null);
            if (cursor != null) {
                cursor.moveToFirst();
                do {
                    Student student = new Student(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3));
                    list.add(student);
                } while (cursor.moveToNext());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_STUDENTS_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        onCreate(sqLiteDatabase);
    }
}
