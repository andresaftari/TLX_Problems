import toko_abc as toko
import bag as _bag
import atk as _atk

if __name__ == '__main__':
    tokoabc = toko.TokoAbc()

    pensil = _atk.ATK('A001', '2B', 'Alat Tulis', 9)
    seragam = _atk.ATK('B002', 'Kemeja', 'Seragam', 2)
    penghapus = _atk.ATK('A004', 'Eraser', 'Alat Tulis', 3)
    pollo = _bag.Bag('C001', 'Pollo', 'Tas', 6)

    tokoabc.__addatk__(pensil)
    tokoabc.__addatk__(seragam)
    tokoabc.__addatk__(penghapus)
    tokoabc.__addbag__(pollo)

    print('Before Edit:')
    tokoabc.__displayatk__()
    tokoabc.__displaybag__()

    editted_atk = _atk.ATK('A001', 'HB', 'Alat Tulis', 1)
    editted_bag = _atk.ATK('C001', 'Louis Vuitton', 'Tas Hangout', 2)

    tokoabc.__editatk__('A001', editted_atk)
    tokoabc.__editbag__('C001', editted_bag)

    print('\nAfter Edit:')
    tokoabc.__displayatk__()
    tokoabc.__displaybag__()

    tokoabc.__remove__('A001')

    print('\nAfter Remove:')
    tokoabc.__displayatk__()
    tokoabc.__displaybag__()
