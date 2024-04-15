public class Gizmo
{
  private String maker;
  private boolean isElec;
  
  /** Returns the name of the manufacturer of this Gizmo. */
  public String getMaker()
  {
    return maker;
  }

  public boolean isElectronic()
  {
    return isElec;
  }
 public boolean hasAdjacentEqualPair(){
   if(purchases.size()<2)
     return false;
   else{
     for(int j = 0; j < purchases.size()-1; j++){
       if(pruchases.get(j).equals(purchases.get(j+1)))
         return true;
     }
   }
   return false;
 }
  public boolean equals(Object other)
  {
    boolean sameMaker = maker.equals(((Gizmo)other).getMaker());
    boolean bothElec = isElec == ((Gizmo)other).isElectronic();
    return sameMaker && bothElec;
  }
  public Gizmo(String s, boolean e)
  {
    maker = s;
    isElec = e;
  }
}
