import model.Kotik;

public class Application {
    public static void main(String[] args){
        Kotik barsik = Kotik.setKotik(5, "Барсик", 15, "Мур");
        Kotik murzik = new Kotik(4, "Мурзик", 10, "Мяу");
        Kotik murzik2 = new Kotik();

        System.out.println("Привет! Меня зовут " + barsik.getName() + " .Мой вес = " +  barsik.getWeight());
        barsik.liveAnotherDay();

        System.out.println("Привет! Меня зовут " + murzik.getName() + " .Мой вес = " +  murzik.getWeight());
        murzik.liveAnotherDay();


        if (barsik.getMeow().equals(murzik.getMeow())) {
            System.out.println("Коты мяукают одинаково");
        } else {
            System.out.println("Коты мяукают неодинаково");
        }

        System.out.println("Количество созданных котиков: " + Kotik.getObjectCount());
    }
}
