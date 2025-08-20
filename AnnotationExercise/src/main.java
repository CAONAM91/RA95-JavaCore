
public static void main(String[] args) {
    BenefitManage bm = new BenefitManage();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Add Voucher");
        System.out.println("2. Update Voucher");
        System.out.println("3. Remove Expired");
        System.out.println("4. Show All");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
        int c = Integer.parseInt(scanner.nextLine());

        switch (c) {
            case 1 -> bm.add_Benefit();
            case 2 -> bm.updateVoucher();
            case 3 -> bm.removeExpiredBenefit();
            case 4 -> bm.showTelephoneOver10minutes();
            case 0 -> {
                return;
            }
        }

    }
}