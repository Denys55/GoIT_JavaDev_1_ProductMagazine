# GoIT_JavaDev_1_ProductMagazine
JUnit, Mockito
Написать приложение по следующему ТЗ:


Приложение «Продуктовый магазин». У каждого товара в магазине есть своя цена. Есть также товары, для которых предусмотрена акционная цена для N количества. Например, 1 яблоко стоит 1 $, 6 яблок стоят 5 $. У каждого продукта есть свой код - буква английского алфавита.

Рассчитать стоимость корзины с учетом скидок.

Пример:
calculateTotalCost(“ ABCDABA”) return 13,25 (3*A - 3.00 по акции, 2*В = 8,50, 1*С = 1,00, 1*D = 0,75 => 3 + 8,5 + 1 + 0,75 = 13.25)