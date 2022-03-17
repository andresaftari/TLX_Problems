class Bag:
    def __init__(self, kode_barang, nama_barang, jenis_barang, stok):
        self.kode_barang = kode_barang
        self.nama_barang = nama_barang
        self.jenis_barang = jenis_barang
        self.stok = stok

    def __str__(self) -> str:
        return f'Kode: {self.kode_barang}, Nama: {self.nama_barang}, Jenis: {self.jenis_barang}, Sisa stok: {self.stok}'
