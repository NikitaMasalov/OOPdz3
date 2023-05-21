import data.Card;
import data.Country;
import data.MasterCard;
import data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static data.Country.RU;

public class Main {
    public static void main(String[] args) {
        Invoke(new MasterCard());
        List<String> alist= new ArrayList<>();
    }


    public static void Invoke(Card card) {
        card.setBalance(100);
        System.out.println(card);
        card.payInCountry(RU, 70);

        System.out.println(card.getBalance());

    }


}