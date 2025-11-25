package UASLabPBOB_3;

import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private int idPesanan;
    private String status;
    private List<DetailPesanan> daftarItem;
    private Meja meja;
    private Customer customer;
    private String metodePembayaran = "Cash"; // Default

    // Constructor
    public Pesanan(int idPesanan, Meja meja, Customer customer) {
        this.idPesanan = idPesanan;
        this.meja = meja;
        this.customer = customer;
        this.status = "Dipesan";
        this.daftarItem = new ArrayList<>();
    }

    public void tambahItem(DetailPesanan item) {
        this.daftarItem.add(item);
    }

    public int hitungSubtotal() {
        int subtotal = 0;
        for (DetailPesanan item : daftarItem) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public int getPajak() {
        return (int) Math.round(hitungSubtotal() * 0.10);
    }

    public int getService() {
        return (int) Math.round(hitungSubtotal() * 0.05);
    }

    public int hitungTotal() {
        return hitungSubtotal() + getPajak() + getService();
    }
