import android.content.Context
import android.database.sqlite.SQLiteCantOpenDatabaseException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.Siswa
import java.io.FileOutputStream
import java.io.IOException
import java.lang.Exception
import java.sql.SQLException

class DBHelper(private val context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    companion object {
        private val DATABASE_NAME = "data_siswa.db"
        private val DATABASE_VERSION = 1
    }

    override fun onCreate(p0: SQLiteDatabase?) {

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    private fun checkDatabase(): Boolean {
        var checkDB: SQLiteDatabase? = null
        try {
            val myPath: String = context.getDatabasePath(DATABASE_NAME).toString()
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY)
        } catch (e: SQLiteCantOpenDatabaseException) {
            Log.e("message", "" + e)
        }
        checkDB?.close()
        return checkDB != null

    }

    private fun copyDatabase() {
        val iss = context.assets.open(DATABASE_NAME)
        val os = FileOutputStream(context.getDatabasePath(DATABASE_NAME))

        val buffer = ByteArray(1024)
        while (iss.read(buffer) > 0) {
            os.write(buffer)
        }
        os.flush()
        os.close()
        iss.close()
    }
    @Throws(SQLException::class)
    fun openDatabase() {
        val myPath: String = context.getDatabasePath(DATABASE_NAME).toString()
        var myDatabase: SQLiteDatabase? = null
        myDatabase = SQLiteDatabase.openDatabase(
            myPath, null,
            SQLiteDatabase.OPEN_READONLY

        )
    }
    fun createDatabase() {
        val dbExist = checkDatabase()
        if (!dbExist) {
            this.writableDatabase
            try {
                copyDatabase()

            } catch (e: IOException) {
                throw Error(
                    "error copying database"
                )
            }
        }
    }
    fun getSiswa(): ArrayList<Siswa>? {
        val list = ArrayList<Siswa>()
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM data_siswa", null)

        if (cursor.moveToFirst()) {
            do {
                list.add(Siswa(cursor.getString(0),cursor.getString(1), cursor.getString(2)));
            } while (cursor.moveToNext());
        }
        cursor.close()
        return list;
    }
}