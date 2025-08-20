import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BenefitManage {

    Map<String, Benefit> benefits = new HashMap<String, Benefit>();
    Map<TelephoneConsultant, Benefit> telephone = new HashMap<TelephoneConsultant, Benefit>();
    Scanner scanner = new Scanner(System.in);

    public void add_Benefit() {
        System.out.println("Add information for Benefit");
        System.out.println("Input name : ");
        String name = scanner.nextLine();
        System.out.println("Input thumbnailUrl :");
        String thumbnaiUrl = scanner.nextLine();
        LocalDate startDate;
        LocalDate endDate;
        try {
            System.out.println("Input startDate :");
            startDate = LocalDate.parse(scanner.nextLine());
            System.out.println("Input endDate, if not end, put blank :");
            String endDatecheck = scanner.nextLine();
            endDate = endDatecheck.isBlank() ? null : LocalDate.parse(scanner.nextLine());
        } catch (DateTimeException e) {
            throw new DateTimeException("Nhap lai dung dinh dang yyyy-mm-dd ");
        }

        System.out.println("Choose Display Format QRCODE, BARCODE, ORIGINAL :");
        DisplayFormate displayFormat = DisplayFormate.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Input code IN 6 characters :");
        String code = scanner.nextLine();
        System.out.println("Input Telephone Consultan duration :");
        int duration = scanner.nextInt();
        Voucher voucher = new Voucher(name, thumbnaiUrl, startDate, endDate, displayFormat, code);
        TelephoneConsultant telephoneConsultant = new TelephoneConsultant(duration);

        benefits.put(code, voucher);
        telephone.put(telephoneConsultant, voucher);


    }

    public void updateVoucher() {
        System.out.println("update voucher info by entering code");
        String code = scanner.nextLine();
        Benefit b = benefits.get(code);
        if (b instanceof Voucher voucher) {
            System.out.println("Input name :");
            voucher.setName(scanner.nextLine());
            System.out.println("Input thumbnailUrl");
            voucher.setThumbnaiUrl(scanner.nextLine());
            try {
                System.out.println("Input startDate :");
                voucher.setStartDate(LocalDate.parse(scanner.nextLine()));
                System.out.println("Input endDate, if not end, put blank :");
                voucher.setEndDate(scanner.nextLine().isBlank() ? null : LocalDate.parse(scanner.nextLine()));
            } catch (DateTimeException e) {
                throw new DateTimeException("Nhap lai dung dinh dang yyyy-mm-dd ");
            }

            System.out.println("Choose Display Format QRCODE, BARCODE, ORIGINAL :");
            voucher.setDisplayFormat(DisplayFormate.valueOf(scanner.nextLine().toUpperCase()));
            System.out.println("Input code :");
            voucher.setCode(scanner.nextLine());
            benefits.put(code, voucher);
        } else {
            System.out.println("khong tim thay " + code);
        }
    }

    public void removeExpiredBenefit() {
        System.out.println("Remove expired benefit ");
        Iterator<Map.Entry<String, Benefit>> it = benefits.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Benefit> entry = it.next();
            LocalDate endDate = entry.getValue().getEndDate();
            if (endDate != null && !endDate.isAfter(LocalDate.now())) {

                System.out.println(" Removed Benefit : " + entry.getValue());
                it.remove();
            }
        }

    }

    public void showTelephoneOver10minutes() {
        for (Map.Entry<TelephoneConsultant, Benefit> entry : telephone.entrySet()) {
            int a = entry.getKey().getDuration();
            if (a > 10) {
                System.out.println(" List telephone > 10minute" + entry.getValue() + "thoi luong" + a);
            }
        }
    }

    public void showTelephoneOver10minutesStream() {
        telephone.entrySet().stream().filter(entry -> entry.getKey().getDuration() > 10).
                forEach(entray -> System.out.println(" List telephone > 10minute" +
                        entray.getValue() + "thoi luong" + entray.getKey().getDuration() + "minutes"));
    }
}
