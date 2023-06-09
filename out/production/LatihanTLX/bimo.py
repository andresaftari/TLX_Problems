print("==========TOKO KITA==========")
pembeli = input("Nama Pembeli : ")

def __makanan__():
    total_semua = 0.0
    totalminuman = 0.0
    totalmakanan = 0.0

    jumlah = 1
    makanan = ""
    minuman = ""

    # global totalmakanan
    # global total_semua
    # global totalminuman
    # global jumlah
    # global makanan
    # global minuman
    
    print("\n=======MENU MAKANAN DAN MINUMAN======")
    print("1. Nabati keju - Rp.7000,00")
    print("2. Tango Cokelat - Rp.10000,00")
    print("3. Nissin Wafer - 8000,00")
    print("4. Chitato - 9000,00")
    print("5. Chocolatos - 11000,00")
    print("6. Es Walls - 5000,00")
    print("7. Roti Sariroti - 6000,00")
    print("8. Pocari Sweat - 10000,00")
    print("9. Teh Pucuk - 4000,00")
    print("10. NIU Greentea - 8000,00")
    print("11. Kopi Kenangan - 10000,00")
    
    nomor = int(input("Maukan pilihan 1/2/3/4/5/6/7/8/9/10/11 : "))
    jumlah = int(input("Jumlah : "))

    if nomor == 1:
        totalmakanan = jumlah * 7000.00
        print(jumlah,' Nabati Keju = Rp.',totalmakanan)
        makanan=("Nabati Keju")
    elif nomor == 2:
        totalmakanan = jumlah * 10000.00
        print(jumlah,' Tango Cokelat = Rp.',totalmakanan)
        makanan=("Tango Cokelat")
    elif nomor == 3:
        totalmakanan = jumlah * 8000.00
        print(jumlah,' Nissin Wafer = Rp.', totalmakanan)
        makanan=("Nissin Wafer")
    elif nomor == 4:
        totalmakanan = jumlah * 9000.00
        print(jumlah,' Chitato = Rp.',totalmakanan)
        makanan=("Chitato")
    elif nomor == 5:
        totalmakanan = jumlah * 11000.00
        print(jumlah,' Chocolatos = Rp.',totalmakanan)
        makanan=("Chocolatos")
    elif nomor == 6:
        totalmakanan = jumlah * 5000.00
        print(jumlah,' Es Walls = Rp.',totalmakanan)
        makanan=("Es Walls")
    elif nomor == 7:
        totalmakanan = jumlah * 6000.00
        print(jumlah,' Roti Sariroti = Rp.',totalmakanan)
        makanan=("Roti Sariroti")
    elif nomor == 8:
        totalminuman = jumlah * 10000.00
        print(jumlah,' Pocari Sweat = Rp.',totalminuman)
        minuman=("Pocari Sweat")
    elif nomor == 9:
        totalminuman = jumlah * 4000.00
        print(jumlah,' Teh Pucuk = Rp.',totalminuman)
        minuman=("teh Pucuk")
    elif nomor == 10:
        totalminuman = jumlah * 8000.00
        print(jumlah,' NIU Greentea = Rp.',totalminuman)
        minuman=("NIU Greentea")
    elif nomor == 11:
        totalminuman = jumlah * 10000.00
        print(jumlah,' kopi Kenangan = Rp.',totalminuman)
        minuman=("Kopi Kenangan")
    else:
        print("Pilihan tidak ada di daftar menu\nSilahkan pilih kembali !")
        __makanan__()
        makanan = ""
        minuman = ""

    total_semua = totalmakanan + totalminuman

    print("\nTotal yang harus dibayar : ",total_semua)
    uang = int(input("Uang Tubai pembeli : Rp."))
    Kembalian = int(uang - total_semua)
    print("kembalian :", Kembalian)

    print("\n==========S T R U K K A S I R==========")
    print("Nama\t\t:", pembeli)
    if makanan != '':
        print("Beli\t\t:",jumlah,makanan,"(RP.",totalmakanan,")")
    else:
        print("Beli\t\t:",jumlah,minuman,"(Rp,",totalminuman,")")
    print("Tagihan\t\t: Rp.",total_semua)
    print("Dibayar\t\t: Rp.",uang)
    print("Kembalian\t: Rp.",Kembalian)

    print("=========================================")
    print("=========================================")

__makanan__()
# minuman()