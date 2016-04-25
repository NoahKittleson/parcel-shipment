import org.junit.*;
import static org.junit.Assert.*;


public class ParcelTest {
  @Test
  public void parcel_parcelVolume_24() {
    Parcel myParcel = new Parcel(2,3,4,5);
    assertEquals(24, myParcel.volume());
  }

  @Test
  public void parcel_parcelShipmentCost_120() {
    Parcel myParcel = new Parcel(2,3,4,5);
    assertEquals(120, myParcel.costToShip(100));
  }
}
