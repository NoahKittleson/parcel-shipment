public class Parcel {

  int mHeight;
  int mLength;
  int mWidth;
  int mWeight;

  public Parcel (int height, int length, int width, int weight) {
    mHeight = height;
    mLength = length;
    mWidth = width;
    mWeight = weight;
  }

  public int volume() {
    return mHeight * mLength * mWidth;
  }

  public int costToShip(int distance) {
    return volume() * mWeight * distance / 100;
  }

  public int surfaceArea() {
    return (mHeight * mWidth * 2) + (mHeight * mLength * 2) + (mLength * mWidth * 2);
  }

}
