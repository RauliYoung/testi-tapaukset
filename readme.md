| Muuttuja           | Sallitut arvot             | Kielletyt arvot                             | Sallitut raja-arvot | Kielletyt raja-arvot                         |
| ------------------ | -------------------------- | ------------------------------------------- | ------------------- | -------------------------------------------- |
| Asiakkaan nimi     | 3-50 merkkiä               | - Erikoismerkit - numerot                   | 3 merkkiä           | 50 merkkiä                                   |
| Kortti:numero      | Numerot 0-9, kirjaimet     | Symbolit, tyhjät merkit                     | - 0 - 9             | - < 0                                        |
| Voimassa olo       | 01-12, 24-29               | <=00, >=13, <23, >29                        | 01-12, 24-29,       | - 00 kk, 13 kk, 23 vv, 30 vv                 |
| Veloitettava summa | 0 - saatavilla oleva saldo | Negatiiviset arvot, Katteen ylittävät arvot | - > 0               | Negatiiviset luvut, Katteen ylittävät summat |

---

### 2a

Kuvauksessa tulisi aina kertoa metodin nimi, parametrit ja niiden tyypit. Lisäksi tulisi kertoa palauttaako metodi arvon ja jos palauttaa minkä tyyppisen arvon.
Lyhyt kuvaus siitä mikä metodin funktio on, eli mitä metodi tekee ja milloin.
Voi myös mainita esimerkiksi mitä metodi palauttaa virheellisillä syötteillä.

```java
/**
 * Muuntaa annetut sekunnit ajan merkkijonoesitykseksi HH:MM:SS muodossa.
 *
 * @param a sekuntien määrä, jota halutaan muuntaa ajan muotoon
 * @return ajan merkkijonoesitys HH:MM:SS muodossa, tai "-1" jos syöte on negatiivinen tai suurempi tai yhtä suuri kuin 32000
 */
```
