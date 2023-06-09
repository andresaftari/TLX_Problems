class Lagu:
    judul = ''
    penyanyi = ''

    def __init__(self, judul, penyanyi):
        self.judul = judul
        self.penyanyi = penyanyi

    def __display__(self):
        return self.judul + " "


list_lagu = []
if __name__ == '__main__':
    pilihan = 0

    while pilihan < 4:
        print("\n1. Input lagu"
            "\n2. Hapus lagu"
            "\n3. Menampilkan lagu"
            "\n4. Exit")
        pilihan = int(input())

        if pilihan == 1:
            title = str(input('input judul [enter]: '))
            singer = str(input('input penyanyi [enter]: '))
            list_lagu.append(Lagu(title, singer))
        elif pilihan == 2:
            opsi = 0
            while opsi < 3:
                print("\n1. Hapus berdasarkan judul"
                    "\n2. Hapus terakhir"
                    "\n3. Back to menu")

                opsi = int(input())
                if opsi == 1:
                    title_to_delete = str(input('input judul yang mau dihapus [ENTER]: '))
                    for i in range(0, len(list_lagu)):
                        if list_lagu[i].judul == title_to_delete:
                            list_lagu.remove(list_lagu[i])

                    print('Hapus lagu', title_to_delete, 'berhasil')
                elif opsi == 2:
                    list_lagu.remove(list_lagu[len(list_lagu) - 1])

                    print('Hapus lagu terakhir berhasil')
        elif pilihan == 3:
            iterator = iter(list_lagu)
            for i in range(0, len(list_lagu)):
                print('Judul lagu dari urutan terawal:', next(iterator).__display__())

            print()
            list_lagu.reverse()
            iterator = iter(list_lagu)
            for i in range(0, len(list_lagu)):
                print('Judul lagu dari urutan terakhir:', next(iterator).__display__())
        elif pilihan == 4:
            print('bye!')
