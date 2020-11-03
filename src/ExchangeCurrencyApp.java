public class ExchangeCurrencyApp {

    public static void main(String[] args) {

        ExchangeAPI ex = new ExchangeAPI();

        //test connection with THB
        if (ex.gatConnection("")); {
            System.out.println(ex.getResult());


        }





    }




}
