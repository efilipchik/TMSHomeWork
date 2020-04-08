package Lesson8.Task27;

public class Runner {
    public static void main(String[] args) {

       /**Создать иерархию классов, описывающих банковские карточки.
          Иерархия должна иметь хотя бы три уровня.
       */
        Visa V = new Visa();
        Mastercard M = new Mastercard();

        System.out.println("Visa");
        V.withdrawMoney();
        V.putMoney();
        V.forUSA();


        System.out.println();

        System.out.println("Mastercard");
        M.withdrawMoney();
        M.putMoney();
        M.forEurope();


    }
}