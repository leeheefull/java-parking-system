package parking;

import java.util.Objects;

public class ParkingNo {
    private final int no;

    private static final int START_OF_NO = 1;
    private static final int END_OF_NO = 5;

    public ParkingNo(String no) {
        this(Integer.parseInt(no));
    }

    public ParkingNo(int no) {
        validate(no);
        this.no = no;
    }

    public int getNo() {
        return this.no;
    }

    private void validate(int no) {
        if (!isCorrectRange(no)) {
            throw new RuntimeException("주차할 수 없는 위치입니다.");
        }
    }

    private boolean isCorrectRange(int no) {
        return START_OF_NO <= no && no <= END_OF_NO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingNo that = (ParkingNo) o;
        return no == that.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
