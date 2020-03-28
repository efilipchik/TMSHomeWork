package Lesson8.Task27;

public class Runner {
    public static void main(String[] args) {

       /**Создать иерархию классов, описывающих банковские карточки.
          Иерархия должна иметь хотя бы три уровня.
       */
        VisaGold VG = new VisaGold();
        PlatinumMastercard PM = new PlatinumMastercard();

        System.out.println("Visa");
        VG.WithdrawMoney();
        VG.PutMoney();
        VG.ForUSA();
        VG.Design();

        System.out.println();

        System.out.println("Mastercard");
        PM.WithdrawMoney();
        PM.PutMoney();
        PM.ForEurope();
        PM.Design();

    }
}