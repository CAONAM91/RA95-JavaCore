import java.time.LocalDate;

public class Voucher extends Benefit {
    private DisplayFormate displayFormat;
    private String code;

    public Voucher(String name, String thumbnaiUrl, LocalDate startDate, LocalDate endDate, DisplayFormate displayFormat, String code) {
        super(name, thumbnaiUrl, startDate, endDate);
        setDisplayFormat(displayFormat);
        setCode(code);
    }

    public void setDisplayFormat(DisplayFormate displayFormat) {
        if ((displayFormat == null)) {
            throw new IllegalArgumentException("display cannot be null");
        }
        this.displayFormat = displayFormat;
    }

    public void setCode(String code) {
       String code1 = code.trim();
        if (!code1.matches("[A-Za-z0-9]{6}")) {
            throw new IllegalArgumentException("Input must be in 6 character");
        }
        this.code = code1;
    }

    public DisplayFormate getDisplayFormat() {
        return displayFormat;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "name='" + getName() + '\'' +
                ", thumbnailUrl='" + getThumbnaiUrl() + '\'' +
                ", startDate=" + getStartDate() +
                ", endDate=" + getEndDate() +
                ", displayFormat=" + displayFormat +
                ", code='" + code + '\'' +
                '}';
    }
}
