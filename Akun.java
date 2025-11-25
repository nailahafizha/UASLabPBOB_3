package UASLabPBOB_3;

public abstract class Akun {
    private int id;
    private String nama;
    private String password;

    // constructor akun
    public Akun(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    // Mengembalikan ID
    public int getId() { 
        return id;
     }
    // Mengembalikan nama
    public String getNama() { 
        return nama; 
    }
    // Mengembalikan password
    public String getPassword() { 
        return password; 
    }
}
