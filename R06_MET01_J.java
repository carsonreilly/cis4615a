public static int getAbsAdd(int x, int y){
  if(x==Integer.MIN_VALUE || y==Integer.MINVALUE){
     throw new IllegalArgumentException();
  }
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  if(absX > Integer.MAX_VALUE - absY){
     throw new IllegalArgumentException();
  }
  return absX + absY;
}
