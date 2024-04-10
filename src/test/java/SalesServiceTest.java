import org.junit.jupiter.api.*;

class SalesServiceTest {

    SalesService service = new SalesService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @BeforeAll
    static void setUp() {
        System.out.println("Тесты запущены");
            }
    @AfterAll
    static void tearDown() {
        System.out.println("Тесты выполнены");
    }

    @Test
    @DisplayName("Cумма всех продаж")
    void checkSum() {
        // подготавливаем данные:
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.getSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("средняя сумма продаж в месяц")
    void checkAverageSum() {
        // подготавливаем данные:
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.getAverageSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Номер месяца, в котором был пик продаж")
    void checkNumberMonthMaxSales() {
        // подготавливаем данные:
        int expected = 6;

        // вызываем целевой метод:
        int actual = service.getNumberMonthMaxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Номер месяца, в котором был минимум продаж")
    void checkNumberMonthMinSales() {
        // подготавливаем данные:
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.getNumberMonthMinSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Количество месяцев, в которых продажи были ниже среднего")
    void checkCountMonthMinAverageSales() {
        // подготавливаем данные:
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.getCountMonthMinAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Последний месяц, в которых продажи были ниже среднего")
    void checkLastMonthMinAverageSales() {
        // подготавливаем данные:
        int expected = 11;

        // вызываем целевой метод:
        int actual = service.getLastMonthMinAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Количество месяцев, в которых продажи были выше среднего")
    void checkCountMonthMaxAverageSales() {
        // подготавливаем данные:
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.getCountMonthMaxAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Последний месяц, в которых продажи были выше среднего")
    void checkLastMonthMaxAverageSales() {
        // подготавливаем данные:
        int expected = 12;

        // вызываем целевой метод:
        int actual = service.getLastMonthMaxAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}