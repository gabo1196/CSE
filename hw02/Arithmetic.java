// Gabriel Gaydos
// hw02

public class Arithmetic {
    public static void main (String [ ] args) {
    int nSocks = 3; // Number of pairs of socks
    double sockCost$ = 2.58; // Cost per pair of socks
    
    int nGlasses = 6; // Number of glasses
    double glassCost$ = 2.29; // Cost per glass
    
    int nEnvelopes = 1; // Number of boxes of envelopes
    double envelopeCost$ = 3.25; // Cost per box of envelopes
    
    double taxPercent = 0.06; // Tax on purchase
    
    double totalSockCost$ = 0; // Total of the socks purchased before tax
    double totalSockTax$ = 0; // Total of the tax on the socks
    double totalSockCostTax$ = 0; // Total of the socks with tax
    
    double totalGlassCost$ = 0; // Total of the glasses purchased before tax
    double totalGlassTax$ = 0; // Total of the tax on the glasses
    double totalGlassCostTax$ = 0; // Total of the glasses with tax
    
    double totalEnvelopeCost$ = 0; // Total of the boxes of envelopes purchsased before tax
    double totalEnvelopeTax$ = 0; // Total of the tax on the boxes of the envelopes
    double totalEnvelopeCostTax$ = 0; // Total of the boxes of envelopes with tax
    
    double totalItemCost$ = 0; // Total of all of the items purchased before tax 
    double totalItemTax$ = 0; // Total of the tax on all of the items
    double totalItemCostTax$ = 0;  // Total of all of the items with tax
    
    // Calculations for each item
    totalSockCost$ = nSocks * sockCost$;
    totalSockTax$ = taxPercent * totalSockCost$;
    totalSockCostTax$ = totalSockCost$ * totalSockTax$;
    
    totalGlassCost$ = nGlasses * glassCost$;
    totalGlassTax$ = taxPercent * totalGlassCost$;
    totalGlassCostTax$ = totalGlassCost$ * totalGlassTax$;
    
    totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
    totalEnvelopeTax$ = taxPercent * totalEnvelopeCost$;
    totalEnvelopeCostTax$ = totalEnvelopeCost$ * totalEnvelopeTax$;
    
    totalItemCost$ = totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$;
    totalItemTax$ = totalEnvelopeTax$ + totalGlassTax$ + totalSockTax$;
    totalItemCostTax$ = totalEnvelopeCostTax$ + totalGlassCostTax$ + totalSockCostTax$;
    
    // Printing the values
    System.out.println("Socks");
    System.out.println("There are " +nSocks+ " pairs of socks");
    System.out.println("Each pair of socks costs $" +sockCost$);
    System.out.println("");
    System.out.println("Glasses");
    System.out.println("There are " +nGlasses+ " drinking glasses");
    System.out.println("Each glass costs $" +glassCost$);
    System.out.println("");
    System.out.println("Envelopes");
    System.out.println("There is " +nEnvelopes+ " boxe of envelopes");
    System.out.println("Each box of envelopes costs $" +envelopeCost$);
    System.out.println("");
    System.out.println("The total cost of the socks before tax is $" +totalSockCost$);
    System.out.println("The total cost of the tax on the socks is $" +totalSockTax$);
    System.out.println("The total cost of the socks with tax is $" +totalSockCostTax$);
    System.out.println("");
    System.out.println("The total cost of the glasses before tax is $" +totalGlassCost$);
    System.out.println("The total cost of the tax on the glasses is $" +totalGlassTax$);
    System.out.println("The total cost of the glasses with tax is $" +totalGlassCostTax$);
    System.out.println("");
    System.out.println("The total cost of the boxes of envelopes before tax is $" +totalEnvelopeCost$);
    System.out.println("The total cost of the tax on the boxes of envelopes is $" +totalEnvelopeTax$);
    System.out.println("The total cost of the boxes of envelopes with tax is $" +totalEnvelopeCostTax$);
    System.out.println("");
    System.out.println("The total cost of all of the items before tax is $" +totalItemCost$);
    System.out.println("The total cost of the tax on all of the items is $" +totalItemTax$);
    System.out.println("The total cost of all of the items with tax is $" +totalItemCostTax$);
    
    
    }
}