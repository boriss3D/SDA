package patterns.structural.facade;

import java.util.Date;
import java.util.List;

class BookingInfo {
    private String source;
    private String destination;
    private Date fromDate;
    private Date  toDate;
    private List<PersonInfo> list;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public List<PersonInfo> getList() {
        return list;
    }

    public void setList(List<PersonInfo> list) {
        this.list = list;
    }
}
