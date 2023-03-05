
public class CalculoPercentual {

    public static void main(String[] args){

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double totalBilling;

        totalBilling = sp + rj + mg + es + outros;

        double percentageSp;
        percentageSp = ( sp / totalBilling ) * 100;
        int intPercentageSp = (int) Math.round(percentageSp) ;

        double percentageRj;
        percentageRj = ( rj / totalBilling ) * 100;
        int intPercentageRj = (int) Math.round(percentageRj) ;

        double percentageMg;
        percentageMg = ( mg / totalBilling ) * 100;
        int intPercentageMg = (int) Math.round(percentageMg) ;

        double percentageEs;
        percentageEs = ( es / totalBilling ) * 100;
        int intPercentageEs = (int) Math.round(percentageEs) ;

        double percentageOutros;
        percentageOutros = ( outros / totalBilling ) * 100;
        int intPercentageOutros = (int) Math.round(percentageOutros) ;


        System.out.println("\n");
        System.out.println(" Demonstração de Percentual de Faturamento Mensal por Estado:");
        System.out.println("\n");

        System.out.println("São Paulo: " + "Faturamento: R$: "+ sp + " ;" + " Percentual: " + intPercentageSp + "%");
        System.out.println("Rio de Janeiro: " + "Faturamento: R$: "+ rj + " ;" + " Percentual: " + intPercentageRj + "%");
        System.out.println("Minas Gerais: " + "Faturamento: R$: "+ mg + " ;" + " Percentual: " + intPercentageMg + "%");
        System.out.println("Espirito Santo: " + "Faturamento: R$: "+ es + " ;" + " Percentual: " + intPercentageEs + "%");
        System.out.println("Outros: " + "Faturamento: R$: "+ outros + " ;" + " Percentual: " + intPercentageOutros + "%");

        System.out.println("\n");
        System.out.println("Faturamento Tota: R$: " + totalBilling);




    }
}
