import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        int count = 300;
        int replenishmentAmount = 1800;
        int totalAccountBalance = count + replenishmentAmount;
        int bonus = replenishmentAmount / 100 +totalAccountBalance;
        if (totalAccountBalance >= 1000)
            System.out.println("Итоговая сумма на счету клиента =" + bonus);
        if (totalAccountBalance < 1000) System.out.println("Итоговая сумма на счету клиента =" + totalAccountBalance
        );
    }
}
