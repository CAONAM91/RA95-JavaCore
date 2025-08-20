import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Benefit {
    private String name;
    private String thumbnaiUrl;
    private LocalDate startDate;
    private LocalDate endDate;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Benefit(String name, String thumbnaiUrl, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.thumbnaiUrl = thumbnaiUrl;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public void input(String name, String thumbnaiUrl, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.thumbnaiUrl = thumbnaiUrl;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThumbnaiUrl(String thumbnaiUrl) {
        this.thumbnaiUrl = thumbnaiUrl;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getName() {
        return name;
    }

    public String getThumbnaiUrl() {
        return thumbnaiUrl;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "name='" + name + '\'' +
                ", thumbnaiUrl='" + thumbnaiUrl + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
