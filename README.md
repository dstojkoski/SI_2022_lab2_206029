# Втора лабораториска вежба по Софтверско инженерство

## Давид Стојкоски, бр. на индекс 206029

### Control Flow Graph
(бројот на јазол е бројот на линија од кодот)

![image](https://user-images.githubusercontent.com/51972558/171634776-435d0d1a-4cf1-449a-8a72-c2ed107e0d26.png)

### Цикломатска комплексност ###

Цикломатската комплексност на кодот е 9. Таа може да се добие преку формулата P+1, каде што P е бројот на предикатни јазли.  
Бидејќи во случајов P=8, цикломатската комплексност е 9.  
Исто така може да се добие и со броење на регионите во CFG.

### Тест случаи според критериумот Every statement
Доволни се 3 тест случаи за да се поминат сите наредби од кодот

| C0       | List[] | List = [#, 0, #] | List = [0, 0, #, #, 0, #, 0, #, 0] |
|----------|:------:|:----------------:|:----------------------------------:|
| 6        |   1    |        1         |                 1                  |
| 7        |   1    |        1         |                 1                  |
| 8        |   1    |                  |                                    |
| 10,11,12 |        |        1         |                 1                  |
| 13       |        |        1         |                                    |
| 15       |        |                  |                 1                  |
| 16.1     |        |                  |                 1                  |
| 16.2     |        |                  |                 1                  |
| 17       |        |                  |                 1                  |
| 18       |        |                  |                 1                  |
| 19       |        |                  |                 1                  |
| 20       |        |                  |                 1                  |
| 21       |        |                  |                 1                  |
| 24       |        |                  |                 1                  |
| 27       |        |                  |                 1                  |
| 28       |        |                  |                 1                  |
| 30       |        |                  |                 1                  |
| 31       |        |                  |                 1                  |
| 33       |        |                  |                 1                  |
| 16.3     |        |                  |                 1                  |
| 36       |        |                  |                 1                  |
| 39       |        |                  |                 1                  |
| 40       |   1    |        1         |                 1                  |

1. List=[]  
   Кога листата е празна, при проверка на условот if `if (list.size() <= 0)` на линија 7, програмата ќе премине на линија 8 и ќе фрли исклучок
2. List = [#, 0, #]  
   Кога листата има несоодветен број на членови, по проверка на `if (rootOfN * rootOfN  != n)` на линија 12, програмата ќе премине на линија 13 и ќе фрли исклучок
3. List = [0, 0, #, #, 0, #, 0, #, 0]  
   Пред да се стигне до for циклусот, ќе бидат поминати изразите 7, 10, 11, 12 и 15.  
   По иницијализацијата 16.1, при секоја итерација на циклусот ќе бидат поминати изразите 16.2, 17 и 16.3


Прва итерација:
* Ќе се извршат 18, 19, 27, 30, 31 и 33. Елементот не е # (проверка на линија 17), нема # лево или десно од него (условот на линија 19), нема # над него (линија 27), но има # под него (30 и 31). На линија 33 се додава бројот на бомби во финалната листа (зачувани во променливата num)


Втора итерација:
* Се извршуваат 18, 19, 20, 24, 27, 30 и 33. Елементот не е #, има # десно од него (исполнет условот на линија 19, но не на линија 20), и нема # над или под него.

Трета итерација:
* Се извршува само 36 бидејќи условот на линија 17 не е исполнет (елементот е #). Истото важи и за итерациите 4, 6 и 8

Петта итерација:
* 18, 19, 20, 21, 27, 30, 31, 33. Елементот не е #, има # и лево и десно од него (исполнет е условот на линија 20, па се извршува линија 21), и има # под него.

Седма и деветта итерација:
* Освен изразите кои се веќе извршени, се извршува линија 28 бидејќи елементите имаат # над нив

Со тоа се поминуваат сите изрази од кодот


### Тест случаи според критериумот Every branch
Може да се искористат истите 3 тест случаи како и кај Every statement критериумот

| C0          | List[] | List = [#, 0, #] | List = [0, 0, #, #, 0, #, 0, #, 0] |
|-------------|:------:|:----------------:|:----------------------------------:|
| 6-7         |   1    |        1         |                 1                  |
| 7-8         |   1    |                  |                                    |
| 8-40        |   1    |                  |                                    |
| 7-10,11,12  |        |        1         |                 1                  |
| 10,11,12-13 |        |        1         |                                    |
| 13 - 40     |        |        1         |                                    |
| 10,11,12-15 |        |                  |                 1                  |
| 15 - 16.1   |        |                  |                 1                  |
| 16.1 - 16.2 |        |                  |                 1                  |
| 16.2 - 39   |        |                  |                 1                  |
| 16.2 - 17   |        |                  |                 1                  |
| 17 - 18     |        |                  |                 1                  |
| 17 - 36     |        |                  |                 1                  |
| 18 - 19     |        |                  |                 1                  |
| 19 - 20     |        |                  |                 1                  |
| 19 - 27     |        |                  |                 1                  |
| 20 - 21     |        |                  |                 1                  |
| 20 - 24     |        |                  |                 1                  |
| 21 - 27     |        |                  |                 1                  |
| 24 - 27     |        |                  |                 1                  |
| 27 - 28     |        |                  |                 1                  |
| 27 - 30     |        |                  |                 1                  |
| 28 - 30     |        |                  |                 1                  |
| 30 - 31     |        |                  |                 1                  |
| 30 - 33     |        |                  |                 1                  |
| 31 - 33     |        |                  |                 1                  |
| 33 - 16.3   |        |                  |                 1                  |
| 36 - 16.3   |        |                  |                 1                  |
| 16.3 - 16.2 |        |                  |                 1                  |
| 39 - 40     |        |                  |                 1                  |

1. List=[]  
   Кога листата е празна, се покриваат ребрата 6-7, 7-8 и 8-40 (во линија 8 се фрла исклучок)

2. List = [#, 0, #]  
   Кога листата има несоодветен број на членови, се покрива реброто 7-10,11,12, а по проверка на `if (rootOfN * rootOfN  != n)` на линија 12, се покриваат 12-13 и 13-40.

3. List = [0, 0, #, #, 0, #, 0, #, 0]  
   Кога листата е валидна, се покриваат 6-7, 7-(10,11,12), (10,11,12)-15, 15-16.1 и 16.1-16.2 пред да се почне со for циклусот.  
   Внатре во for циклусот 16.2-17 и 16.3-16.2 се покриваат на секоја итерација.

    * Во првата итерација се покриваат 17-18, 18-19, 19-27, 27-30, 30-31, 31-33 и 33-16.3

    * Во втората итерација дополнително се покриваат 19-20, 20-24, 24-27, 30-33

    * Во трета, четврта, шеста, и осма итерација се покриваат 17-36 и 36-16.3

    * Во петта итерација се покрива 20-21, 21-27
    * Во седма итерација се покрива 27-28 и 28-30

   На крај на for циклусот се покрива 16.2-39 и програмата завршува со 39-40

### Unit тестови
Бидејќи тест случаите за двата методи се исти, може кодот ќе биде ист и во двете функции. Може и да се спојат во една за да нема
повторување

1. List=[]

   Бидејќи во првиот тест случај очекуваме функцијата да фрли исклучок, креираме објект од тип RuntimeException (може и
   друг вид на исклучок) и со assertThrows проверуваме дали функцијата фрла исклучок.

   По доделување на вредноста од assertThrows на објектот ex, проверуваме дали ја содржи соодведната
   порака ("List length should be greater than 0") со assertTrue.
```java
        RuntimeException ex;

        // Test case 1
        List<String> emptyList = createList();
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(emptyList));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
```

2. List=["#", "0", "#"]

   Прво креираме листа што не е валидна, и како и во првиот тест случај очекуваме функцијата да фрли исклучок, па го користиме објектот
   ex и со assertThrows проверуваме дали функцијата фрла исклучок кога е пратена несоодветна листа како аргумент.

   По доделување на вредноста од assertThrows на објектот ex, проверуваме дали ја содржи точната порака
   ("List length should be greater than 0") со assertTrue.
```java
        //Test case 2
        List<String> invalidList = createList("#", "0", "#");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(invalidList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
```

3. List = ["0", "0" , "#", "#", "0", "#", "0", "#", "0"]
   Во третиот тест случај, на функцијата и праќаме соодветна листа и со assertEquals проверуваме дали
   вратената листа е соодветна за дадениот влез
   За дадената листа излезот треба да е:  
   1, 1, #  
   #, 3, #,  
   2, #, 2
```java
        // Test case 3 -> List = {0, 0, #,
        //                        #, 0, #,
        //                        0, #, 0}
        List<String> validList = createList("0", "0" , "#", "#", "0", "#", "0", "#", "0");
        assertEquals(createList("1", "1", "#", "#", "3", "#", "2", "#", "2"), SILab2.function(validList));
```

