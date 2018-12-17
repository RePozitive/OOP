public class Main {
    public static void main(String[] args) {
        Info Ball1 = new Info();
        Ball1.color = "белый";
        Ball1.size = 15;
        System.out.println("Цвет:"+Ball1.color+","+" "+"размер: "+Ball1.size);
        Ball1.color = "чёрный";
        Ball1.size = 10;
        System.out.println("Цвет:"+Ball1.color+","+" "+"размер: "+Ball1.size);
    }
}

  class Info {
    String color;
    int size;
}
