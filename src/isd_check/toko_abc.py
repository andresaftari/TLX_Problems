class TokoAbc:
    listAtk = []
    listBag = []

    def __addatk__(self, atk):
        self.listAtk.append(atk)

    def __addbag__(self, bag):
        self.listBag.append(bag)

    def __editatk__(self, kode: str, atk):
        for i in range(len(self.listAtk)):
            if kode.__eq__(self.listAtk[i].kode_barang):
                self.listAtk[i] = atk

    def __editbag__(self, kode: str, bag):
        for i in range(len(self.listBag)):
            if kode.__eq__(self.listBag[i].kode_barang):
                self.listBag[i] = bag

    def __remove__(self, kode: str):
        if kode.__contains__('A') or kode.__contains__('B'):
            for i in range(len(self.listAtk)):
                if kode.__eq__(self.listAtk[i - 1].kode_barang):
                    self.listAtk.remove(self.listAtk[i - 1])

        elif kode.__contains__('C'):
            for i in range(len(self.listBag)):
                if kode.__eq__(self.listBag[i - 1].kode_barang):
                    self.listBag.remove(self.listBag[i - 1])

    def __displayatk__(self):
        for i in range(len(self.listAtk)):
            print(str(self.listAtk[i]))

    def __displaybag__(self):
        for i in range(len(self.listBag)):
            print(str(self.listBag[i]))
