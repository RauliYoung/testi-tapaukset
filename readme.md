| Muuttuja           | Sallitut arvot             | Kielletyt arvot                             | Sallitut raja-arvot                      | Kielletyt raja-arvot                         |
| ------------------ | -------------------------- | ------------------------------------------- | ---------------------------------------- | -------------------------------------------- |
| Asiakkaan nimi     | 3-50 merkkiä               | - Erikoismerkit - numerot                   | 3 merkkiä                                | 50 merkkiä                                   |
| Kortti:numero      | Numerot 0-9, kirjaimet     | Symbolit, tyhjät merkit                     | - 0 - 9                                  | - < 0                                        |
| Voimassa olo       | 01-12, 24-29               | <=00, >=13, <23, >29                        | 01-12, 24-29, 00 kk, 13 kk, 23 vv, 30 vv | -                                            |
| Veloitettava summa | 0 - saatavilla oleva saldo | Negatiiviset arvot, Katteen ylittävät arvot | - > 0                                    | Negatiiviset luvut, Katteen ylittävät summat |
