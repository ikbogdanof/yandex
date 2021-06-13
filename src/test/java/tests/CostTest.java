package tests;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.Cost;

public class CostTest {

    @Test()
    public void costTest() {
        Assert.assertEquals("Расстояние не может быть меньше или равно 0", 0,
                new Cost().getCostOfDelivery(0.0, true, true, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(1.0, false, false, "MIDDLE"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 660.0,
                new Cost().getCostOfDelivery(1.0, true, true, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(1.0, true, false, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(1.0, false, false, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(2.0, true, false, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 630.0,
                new Cost().getCostOfDelivery(2.0, false, true, "MIDDLE"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 540.0,
                new Cost().getCostOfDelivery(2.0, false, true, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(2.0, false, false, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 840.0,
                new Cost().getCostOfDelivery(3.0, true, true, "MIDDLE"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(3.0, false, false, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(3.0, true, false, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 480.0,
                new Cost().getCostOfDelivery(3.0, true, false, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 400.0,
                new Cost().getCostOfDelivery(10.0, false, false, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 720.0,
                new Cost().getCostOfDelivery(10.0, true, true, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 600.0,
                new Cost().getCostOfDelivery(10.0, true, true, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 700.0,
                new Cost().getCostOfDelivery(10.0, false, true, "MIDDLE"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 840.0,
                new Cost().getCostOfDelivery(11.0, true, true, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 480.0,
                new Cost().getCostOfDelivery(11.0, false, false, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 700.0,
                new Cost().getCostOfDelivery(11.0, true, true, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 840.0,
                new Cost().getCostOfDelivery(11.0, false, true, "MIDDLE"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 480.0,
                new Cost().getCostOfDelivery(30.0, true, false, "LOW"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 600.0,
                new Cost().getCostOfDelivery(30.0, false, true, "обычная"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 1120.0,
                new Cost().getCostOfDelivery(30.0, true, true, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 979.9999999999999,
                new Cost().getCostOfDelivery(30.0, true, true, "MIDDLE"), 0);

        Assert.assertEquals("Хрупкие грузы не доставляются на расстояние более 30 км", -1.0,
                new Cost().getCostOfDelivery(31.0, false, true, "LOW"), 0);

        Assert.assertEquals("Хрупкие грузы не доставляются на расстояние более 30 км", -1.0,
                new Cost().getCostOfDelivery(31.0, true, true, "HIGH"), 0);

        Assert.assertEquals("Стоимость доставки не соответсвует ожидаемой", 560.0,
                new Cost().getCostOfDelivery(31.0, false, false, "MIDDLE"), 0);

        Assert.assertEquals("Хрупкие грузы не доставляются на расстояние более 30 км", -1.0,
                new Cost().getCostOfDelivery(31.0, false, true, "обычная"), 0);
    }
}
